package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * input : is1 Thi0s T3est 2a
 * output : This is a Test
 */
public class SortWordsContainsNumbers {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        solution1(input);
        solution2(input);
    }

    private static void solution2(String input) {
        String[] words = input.split(" ");

        Arrays.sort(words, Comparator.comparingInt(SortWordsContainsNumbers::extractNumber));

        String res = Arrays.stream(words)
                .map(word -> word.replaceAll("\\d", ""))
                .collect(Collectors.joining(" "));
        System.out.println(res);
    }

    private static int extractNumber(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return c - '0';
            }
        }
        return -1; // should not happen if input is valid
    }

    private static void solution1(String input) {
        String[] words = input.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int num = -1;
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    num = c - '0';
                } else {
                    sb.append(c);
                }
            }
            result[num] = sb.toString();
        }
        String res = String.join(" ", result);
        System.out.println(res);
    }
}
