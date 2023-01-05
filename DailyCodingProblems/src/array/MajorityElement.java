package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//https://leetcode.com/problems/majority-element/
public class MajorityElement {
  public static void main(String[] args) {
    System.out.println(majorityElementWithHashMap(new int[] {2, 2, 1, 1, 2}));
    System.out.println(majorityElement(new int[] {2, 2, 1, 1, 2}));
    System.out.println(majorityElementWithSort(new int[] {2, 2, 1, 1, 2}));
  }


  public static int majorityElementWithHashMap(int[] nums) {
    int majority = 0, size = nums.length / 2;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : nums) {
      if (map.containsKey(i))
        map.put(i, map.get(i) + 1);
      else
        map.put(i, 1);

      if (map.get(i) > size) {
        majority = i;
        break;
      }
    }
    /*
     * Iterator<Integer> itr = map.keySet().iterator(); while (itr.hasNext()) { int key =
     * itr.next(); if (map.get(key) > size) { majority = key; break; } }
     */

    return majority;
  }

  public static int majorityElementWithKeySet(int[] nums) {
    int majority = 0, size = nums.length / 2;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : nums) {
      if (map.containsKey(i))
        map.put(i, map.get(i) + 1);
      else
        map.put(i, 1);
    }
    Iterator<Integer> itr = map.keySet().iterator();
    while (itr.hasNext()) {
      int key = itr.next();
      if (map.get(key) > size) {
        majority = key;
        break;
      }
    }

    return majority;
  }

  public static int majorityElementWithSort(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    // int mid = 0 + (nums.length - 1 - 0) / 2;
    return nums[len / 2];
  }


  /*
   * Moore voting algorithm
   * This algorithm works fine because array have n/2+1 of same element, so
   * 
   * intution of algorithm is works like if the majority element is more than n/2 then that elements
   * cancelled with all other non-majority element, gives final result as majority element
   * 
   */
  public static int majorityElement(int[] num) {

    int major = num[0], count = 1;
    for (int i = 1; i < num.length; i++) {
      if (count == 0) {
        count++;
        major = num[i];
      } else if (major == num[i]) {
        count++;
      } else
        count--;

    }
    return major;
  }

  /*
   * public int majorityElement3(int[] nums) { int count=0, ret = 0; for (int num: nums) { if
   * (count==0) ret = num; if (num!=ret) count--; else count++; } return ret; }
   */



}
