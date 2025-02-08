package easy;

public class RichestCustomerWeath {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        RichestCustomerWeath obj = new RichestCustomerWeath();
        System.out.println(obj.maximumWealth(accounts));
    }

    private int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int richestCustomerWealth = 0;
            for(int i = 0; i < account.length; i++){
                richestCustomerWealth += account[i];
            }
            if(richestCustomerWealth > maxWealth){
                maxWealth = richestCustomerWealth;
            }
        }
        return maxWealth;
    }
}
