package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Write a program to form lines using given set of words. The line formation should follow 
 * below rules.
i) Total characters in a single line excluding the space between the words and the favorite 
character should not exceed the given number.
ii) Favorite character is case insensitive.
iii) Words should not be broken up. Complete words alone should be used in a single line.
 A word should be used in one line only.
Input : Max char per line = 10
        Favorite character = 'o'
        Words : Zoho, Eating, Watching, Pogo
                Loving, Mango
Output : Watching Zoho
         Eating Mango
         Loving Pogo.
*/
public class LineFormation {
	/*case 1:
	 * Input : Max char per line = 10
        Favorite character = 'o'
	 * Eating Watching Mango Loving Zoho Pogo
	 * output:
	 * 	Eating Mango 
		Watching Zoho 
		Loving Pogo
	 * case 2:
	 * Input : Max char per line = 15
        Favorite character = 'w'
	 * Twinkle Twinkle little star how i wonder what you are
	 * output:
	 * 	Twinkle Twinkle how i 
		little star wonder 
		what you are 
	 * */
	public static void main(String[] args) {

		String str = "Twinkle Twinkle little star how i wonder what you are";		
		char fav = 'w';
		int n = 15;
		lineSolver(str, fav, n);
	}

	private static void lineSolver(String str, char fav, int n) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		List<Integer> iA = new ArrayList<Integer>();
		List<String> list = new ArrayList<String>(Arrays.asList(words));

		int j = 0;
		int k = list.size();
		while (j < k) {
			int val = 0;
			for (int i = 0; i < list.size(); i++) {
				int fc = checkForFav(list.get(i), fav);
				val += fc;
				if (val <= n) {
					sb.append(list.get(i)).append(" ");
					iA.add(i);
				} else
					val -= fc;

				if (val >= n)
					break;
			}

			j += iA.size();
			System.out.print(sb + "\n");
			sb.setLength(0);//Remove all elements in sb

			for (int i = 0; i < iA.size(); i++)
				if (i == 0)
					list.remove((int) iA.get(i));//once the element deleted so position will be changed
				else
					list.remove((int) iA.get(i) - i);//Next iteration depends on position of i

			iA.clear();//Remove all elements in list
		}
		//list.forEach(System.out::print);
	}

	private static int checkForFav(String s, char fav) {
		int i = 0, j = s.length(), count = 0;
		while (i < j) {
			if (s.charAt(i) == fav)
				count++;
			i++;
		}
		return j - count;
	}
}
