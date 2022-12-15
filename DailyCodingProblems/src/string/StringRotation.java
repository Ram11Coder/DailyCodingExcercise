package string;

import java.util.Arrays;

/**
 * Check if two strings are a rotation of each other either left or right rotation Ex: str1:
 * helloworld str2: ldhellowor Output: YES str1: vicky str2: cvkyi
 * 
 * Output: NO
 * 
 */
public class StringRotation {

  public static void main(String[] args) {

    System.out.println("Approach 1");
    System.out.println((brutefore("vicky", "")) ? "YES" : "NO");
    System.out.println((brutefore("vicky", null)) ? "YES" : "NO");
    System.out.println((brutefore(null, "cvkyi")) ? "YES" : "NO");
    System.out.println((brutefore("vicky", "vicky")) ? "YES" : "NO");
    System.out.println((brutefore("vicky", "ckyvi")) ? "YES" : "NO");
    System.out.println((brutefore("vicky", "kyvic")) ? "YES" : "NO");
    System.out.println((brutefore("vicky", "cvkyi")) ? "YES" : "NO");

    System.out.println("Approach 2");
    System.out.println((betterApproach("vicky", "")) ? "YES" : "NO");
    System.out.println((betterApproach("vicky", null)) ? "YES" : "NO");
    System.out.println((betterApproach(null, "cvkyi")) ? "YES" : "NO");
    System.out.println((betterApproach("vicky", "vicky")) ? "YES" : "NO");
    System.out.println((betterApproach("vicky", "ckyvi")) ? "YES" : "NO");
    System.out.println((betterApproach("vicky", "kyvic")) ? "YES" : "NO");
    System.out.println((betterApproach("vicky", "cvkyi")) ? "YES" : "NO");

    System.out.println("Approach 3");
    System.out.println((optimal("vicky", "")) ? "YES" : "NO");
    System.out.println((optimal("vicky", null)) ? "YES" : "NO");
    System.out.println((optimal(null, "cvkyi")) ? "YES" : "NO");
    System.out.println((optimal("vicky", "vicky")) ? "YES" : "NO");
    System.out.println((optimal("vicky", "ckyvi")) ? "YES" : "NO");
    System.out.println((optimal("vicky", "kyvic")) ? "YES" : "NO");
    System.out.println((optimal("vicky", "cvkyi")) ? "YES" : "NO");
  }

  /**
   * 
   * TC - O(n^2)
   * 
   * SC - O(2n)
   * 
   * @param s1
   * @param s2
   * @return
   */
  private static boolean optimal(String s1, String s2) {
    if (!checkInputs(s1, s2))
      return false;

    if (s1.equals(s2))
      return true;

    String s3 = s1.concat(s1);
    return s3.contains(s2);
  }


  /**
   * 
   * TC - O(n^2)
   * 
   * SC - O(n^2)
   * 
   * @param s1
   * @param s2
   * @return
   */
  private static boolean betterApproach(String s1, String s2) {
    if (!checkInputs(s1, s2))
      return false;

    if (s1.equals(s2))
      return true;
    for (int i = 1; i < s2.length(); i++) {
      s2 = s2.substring(1) + s2.substring(0, 1);
      if (s1.equals(s2))
        return true;
    }
    return false;
  }

  /**
   * 
   * TC - O(n^3)
   * 
   * SC - O(n)
   * 
   * @param s1
   * @param s2
   * @return
   */
  private static boolean brutefore(String s1, String s2) {

    if (!checkInputs(s1, s2))
      return false;

    if (s1.equals(s2))
      return true;

    char carr[] = s2.toCharArray();

    for (int i = 0; i < carr.length; i++) {
      rotate(carr);
      if (Arrays.equals(s1.toCharArray(), carr))
        return true;
    }

    return false;
  }

  private static void rotate(char[] carr) {
    char temp = carr[0];
    int i = 0;
    for (i = 0; i < carr.length - 1; i++) {
      carr[i] = carr[i + 1];
    }
    carr[i] = temp;
  }


  public static boolean checkInputs(String s1, String s2) {
    if (s1 == null || s2 == null)
      return false;

    return s1.trim().length() == s2.trim().length();
  }
}
