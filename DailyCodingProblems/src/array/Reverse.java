package array;

import java.util.*;
import java.io.*;
import java.lang.*;

class Reverse {

  public static String reverseWord(String str) {
    StringBuilder sb = new StringBuilder(str);

    sb = sb.reverse();
    return String.valueOf(sb);

  }

  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String str = read.readLine();
      System.out.println(reverseWord(str));
    }
  }
}// } Driver Code Ends


// User function Template for Java


/*
 * class Reverse { // Complete the function // str: input string public static String
 * reverseWord(String str) { StringBuilder sb = new StringBuilder(str);
 * 
 * sb = sb.reverse(); return String.valueOf(sb);
 * 
 * } }
 */
