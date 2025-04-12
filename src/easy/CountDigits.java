package easy;

public class CountDigits {
    public static void main(String[] args) {

    }
    static int evenlyDivides(int n) {

        int digits[] = Integer.toString(n).
                chars()
                .map(c-> c - '0')
                .toArray();

        int count = 0;
        for (int digit : digits){
            if (digit !=0 && n % digit ==0) {
                count++;
            }
        }
        return count;
    }
}
