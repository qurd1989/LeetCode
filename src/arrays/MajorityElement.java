package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String subString = s.substring(3, 6);
        int lastThreeDigits = Integer.valueOf(subString);
        System.out.println(subString);
        int v = lastThreeDigits/3;
        System.out.println(lastThreeDigits);
        if (lastThreeDigits >= 1 &&  lastThreeDigits <= 349 || lastThreeDigits != 316) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
//    public int majorityElement(int prices[]){
//        int buy = prices[0];
//        int profit = 0;
//        for (int i = 1; i < prices.length; i++){
//            if (prices[i] < buy){
//                buy = prices[i];
//            }else if (prices[i] - buy > profit ){
//                profit = prices[i] - buy;
//            }
//        }
//        return profit;
//
}
