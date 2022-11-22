package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {
  public static void main(String[] args) {

    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    lists.add(Arrays.asList(1, 3));

    lists.add(Arrays.asList(15, 18));
    lists.add(Arrays.asList(2, 6));
    lists.add(Arrays.asList(8, 10));

    solution(lists);
  }

  private static void solution(List<List<Integer>> lists) {
    // Sort the list
    Collections.sort(lists, (a, b) -> a.get(0) - b.get(0));

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (lists.size() == 0)
      return;

    List<Integer> temp = lists.get(0);

    for (List<Integer> list : lists) {

      if (list.get(0) <= temp.get(1)) {
        temp = Arrays.asList(temp.get(0), Math.max(list.get(1), temp.get(1)));
      } else {
        result.add(temp);
        temp = list;
      }
    }

    result.add(temp);
    System.out.println(result);
  }
}
