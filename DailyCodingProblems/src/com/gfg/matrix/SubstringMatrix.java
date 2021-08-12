package com.gfg.matrix;

import java.util.ArrayList;

/**
 * 
 Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search 
 * for substring like “too” in the two dimensional string both from left to right
 *  and from top to bottom.
w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	 
And print the start and ending index as
Start index : <1,2>
End index: <3, 2>
 *
 */
public class SubstringMatrix {
	public static void main(String[] args) {
		String str = "WELCOMETOZOHOCORPORATION";
		String word = "TOO";
		char carr[][] = new char[5][];

		for (int i = 0, j = 0; i < str.length(); i += 5,j++) 
			carr[j] = new char[getDimension(i, str.length())];
			
		

		int val = 0;
		for (int i = 0; i < carr.length; i++) {

			for (int j = 0; j < carr[i].length; j++) {
				if (val < str.length())
					carr[i][j] = str.charAt(val++);
				System.out.print(carr[i][j] + " ");
			}
			System.out.println();
		}

		if (!searchWord(word, carr))
			System.out.println("Not found");

	}

	static boolean searchWord(String word, char[][] mat) {
		char[] searchWord = word.toCharArray();
		if (leftToRight(searchWord, mat))
			return true;
		else if (topToBottom(searchWord, mat))
			return true;

		return false;
	}

	static boolean topToBottom(char[] searchWord, char[][] mat) {
		ArrayList<Integer> startIndex = new ArrayList<Integer>(), endIndex = new ArrayList<Integer>();
		for (int i = 0; i < mat.length; i++) {
			int count = 0, val = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[j][i] == searchWord[val]) {
					count++;
					val++;
				} else {
					val = 0;
					count = 0;
					startIndex.clear();
					endIndex.clear();
				}

				if (count == 1) {
					startIndex.add(j);
					startIndex.add(i);
				}

				if (searchWord.length == count) {
					endIndex.add(j);
					endIndex.add(i);
					System.out.println("StartIndex " + startIndex + " " + ", EndIndex " + endIndex);
					return true;
				}
			}
			startIndex.clear();
			endIndex.clear();

		}
		return false;
	}

	static boolean leftToRight(char[] searchWord, char[][] mat) {
		ArrayList<Integer> startIndex = new ArrayList<Integer>(), endIndex = new ArrayList<Integer>();

		for (int i = 0; i < mat.length; i++) {
			int count = 0, val = 0;
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == searchWord[val]) {
					count++;
					val++;
				} else {
					val = 0;
					count = 0;
					startIndex.clear();
					endIndex.clear();
				}
				if (count == 1) {
					startIndex.add(i);
					startIndex.add(j);
				}

				if (searchWord.length == count) {
					endIndex.add(i);
					endIndex.add(j);
					System.out.println("StartIndex " + startIndex + " " + ", EndIndex " + endIndex);
					return true;
				}
			}
			startIndex.clear();
			endIndex.clear();
		}
		return false;
	}

	static int getDimension(int i, int j) {
		return (j - i > 5) ? 5 : j - i;
	}
}
