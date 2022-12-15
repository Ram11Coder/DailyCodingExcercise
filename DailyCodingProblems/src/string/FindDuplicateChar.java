package string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {
  public static void main(String[] args) {

    String word = "code decode";
    bruteForce(word);
    Approach1(word);
    Approach2(word);
  }

  /**
   * 
   * TC - O(n * logn)
   * 
   * SC - O(K) - String length
   */
  private static void Approach2(String word) {

    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    Set<Character> set = new LinkedHashSet<Character>();
    for (char c : word.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet())
      if (entry.getValue() > 1)
        set.add(entry.getKey());

    System.out.println(set);
  }

  /**
   * 
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static void Approach1(String word) {
    Set<Character> set = new LinkedHashSet<Character>();
    int[] ch = new int[256];
    for (int i = 0; i < word.length(); i++) {
      ch[word.charAt(i)]++;
    }

    for (int i = 0; i < ch.length; i++) {
      if (ch[i] > 1)
        set.add((char) i);

    }
    System.out.println(set);
  }

  /**
   * 
   * TC - O(n^2)
   * 
   * SC - O(1)
   */
  private static void bruteForce(String word) {

    Set<Character> set = new LinkedHashSet<Character>();
    for (int i = 0; i < word.length(); i++) {
      for (int j = i + 1; j < word.length(); j++) {
        if (word.charAt(i) == word.charAt(j)) {
          set.add(word.charAt(i));
          break;
        }
      }
    }
    System.out.println(set);
  }
}
