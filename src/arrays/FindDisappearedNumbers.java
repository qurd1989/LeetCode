package arrays;

import java.util.*;

public class FindDisappearedNumbers {
    public static void main(String[] args) {

    }
    public static List<Integer> findDisappearedNumbers(int [] nums) {
       int n = nums.length;
       HashMap<Integer, Boolean> hashtable = new HashMap<>();
       for (int i = 0; i < n; i++) {
           hashtable.put(nums[i], true);

       }
       List<Integer> list = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           if (!hashtable.containsKey(i)){
               list.add(i);
           }
       }
       return list;
    }
}
