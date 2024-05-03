package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int prices[]){
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < buy){
                buy = prices[i];
            }else if (prices[i] - buy > profit ){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
