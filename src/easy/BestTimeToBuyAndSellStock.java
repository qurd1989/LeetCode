package easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int n[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(n));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = Integer.MAX_VALUE;
        int tempPrice = 0;
        int maxPrice = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }

            tempPrice = prices[i] - minValue;
            if (tempPrice > maxPrice) {
                maxPrice = tempPrice;
            }
        }
        return maxPrice;
    }

}
