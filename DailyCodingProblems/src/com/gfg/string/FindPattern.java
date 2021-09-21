package com.gfg.string;
/*They gave a passage and the output should be printing out the number of
 *  occurrence of each word and the indices it occurs without using string
 *   matching The passage given was “jana Gana Mana” and so on.. and we
 *    have to print number of jana and it’s indices.i.e at which position
 *     it occurs.
*/

public class FindPattern {
	public static void main(String[] args) {

		String passage = "Jana Gana Mana Adhinaayak Jaya Hey,\r\n" + "Bhaarat Bhaagya Vidhaataa\r\n"
				+ "Panjaab Sindhu Gujarat Maraatha,\r\n" + "Draavid Utkal Banga\r\n"
				+ "Vindhya Himaachal Yamuna Ganga,\r\n" + "Uchchhal Jaladhi Taranga\r\n"
				+ "Tav Shubh Naamey Jaagey,\r\n" + "Tav Shubh Aashish Maange\r\n" + "Gaahey Tav Jayagaathaa\r\n"
				+ "Jana Gana Mangal Daayak,\r\n" + "Jaya Hey Bhaarat Bhaagya Vidhaataa\r\n"
				+ "Jaya Hey, Jaya Hey, Jaya Hey,\r\n" + "Jaya Jaya Jaya, Jaya Hey", word = "Jana";

		checkTheWords(passage, word);
	}

	private static void checkTheWords(String passage, String word) {
		int i = 0, j = 0;
		char[] str = passage.toCharArray(), wordArr = word.toCharArray();
		while (i < passage.length()) {

			if (str[i] == wordArr[j]) {
				System.out.print(str[i] + "-");
				j++;
			}
			if (j == word.length()) {
				System.out.println(i);
				System.out.println("Word found in index " + (i - word.length() + 1));
				j = 0;
			}
			if (str[i] == ' ') {
				j = 0;
			}
			i++;
		}
	}
}
