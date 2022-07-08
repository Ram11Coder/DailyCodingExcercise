package matrix;

/**
 * 
 * Given a 2D grid of characters, you have to search for all the words in a
 * dictionary by moving only along two directions, either right or down. Print
 * the word if it occurs.
 * 
 *  Sample :
 *  
 *  a z o l
 *  n x h o 
 *  v y i v
 *  o r s e 
 *   
 * Dictionary = {van, zoho, love, are, is}
 * 
 *  Output: zoho love Is
 *
 * 
 */
public class WordSearch {
	public static void main(String[] args) {

		char[][] words = { { 'a', 'z', 'o', 'l' }, { 'n', 'x', 'h', 'o' }, { 'v', 'y', 'i', 'v' },
				{ 'o', 'r', 's', 'e' } };

		String[] word = { "van", "zoho", "love", "are", "is" };

		for (String s : word) {
			wordSearch(words, s);
		}

	}

	private static void wordSearch(char[][] words, String s) {
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				if (words[i][j] == s.charAt(index) && index < s.length()) {
					index++;
				} else if (words[++i][--j] == s.charAt(index)) {

				}
			}
		}
	}
}