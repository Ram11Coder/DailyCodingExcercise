package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
  public static void main(String[] args) {

    String s = "aabb";
    List<List<String>> res = new ArrayList<>();
    solver(0, s, res, new ArrayList<String>());
    System.out.println(res);
  }

  private static void solver(int ind, String s, List<List<String>> res, ArrayList<String> ds) {

    if (ind == s.length()) {
      res.add(new ArrayList<>(ds));
      return;
    }
    for (int i = ind; i < s.length(); i++) {

      if (isPalindrome(s, ind, i )) {
        ds.add(s.substring(ind, i + 1));
        solver(i + 1, s, res, ds);
        ds.remove(ds.size() - 1);
      }
    }
  }

  private static boolean isPalindrome(String s, int start, int end) {

    while (start <= end) {
      if (s.charAt(start++) != s.charAt(end--))
        return false;
    }
    return true;
  }
}
