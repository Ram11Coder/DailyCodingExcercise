package backtracking;

import java.util.ArrayList;
import java.util.List;

public class KthPermutationSequence {
  public static void main(String[] args) {

    /**
     * BruteForce: Generate all the permutation and store it in dataStructure
     * 
     * sort the permutation
     * 
     * Time complexity -> O(n!)*n + n!*log(n!)
     * 
     */

    /**
     * Optimal Solution
     *  Reducing the block by block to finding the answer
     */

    int n = 4, fact = 1, k = 17;
    List<Integer> number = new ArrayList<>();

    for (int i = 1; i < n; i++) {
      fact *= i;
      number.add(i);
    }
    number.add(n);
    String res = "";
    k--;
    while (true) {

      res += number.get(k / fact);
      number.remove(number.get(k / fact));
      if (number.size() == 0)
        break;

      k = k % fact;
      fact=fact/number.size();
    }
    
    System.out.println(res);
  }

}
