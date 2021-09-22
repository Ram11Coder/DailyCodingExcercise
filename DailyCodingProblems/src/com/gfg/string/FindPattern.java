package com.gfg.string;
/*They gave a passage and the output should be printing out the number of
 *  occurrence of each word and the indices it occurs without using string
 *   matching The passage given was “jana Gana Mana” and so on.. and we
 *    have to print number of jana and it’s indices.i.e at which position
 *     it occurs.
*/

public class FindPattern {
	public static void main(String[] args) {

		String passage = "Jana Gana Mana Adhinaayak Jaya Hey,Bhaarat Bhaagya Vidhaataa Panjaab Sindhu Gujarat Maraatha,Draavid Utkal BangaVindhya Himaachal Yamuna Ganga,Uchchhal Jaladhi TarangaTav Shubh Naamey Jaagey,Tav Shubh Aashish MaangeGaahey Tav Jayagaathaa Jana Gana Mangal Daayak,Jaya Hey Bhaarat Bhaagya VidhaataaJaya Hey, Jaya Hey, Jaya Hey,Jaya Jaya Jaya, Jaya HeyJana",
				word = "Jana";

		checkTheWords(passage, word);
	}

	private static void checkTheWords(String passage, String word) {
		int i = 0, j = 0, m = word.length() - 1;

		char[] str = passage.toCharArray(), wordArr = word.toCharArray();
		while (i < passage.length() - m) {

			if (str[i] == wordArr[j] && check(passage.substring(i, i + word.length()), word))
				System.out.println(word + " found at position " + (i + 1));
			i++;
		}

	}

	private static boolean check(String substr, String word) {

		for (int i = 0; i < word.length(); i++) {
			if (substr.charAt(i) != word.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
