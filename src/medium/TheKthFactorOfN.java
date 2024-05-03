package medium;

import java.util.Arrays;
import java.util.Scanner;

public class TheKthFactorOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kthFactor(n, k));
    }

    public static int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
                // Check for perfect squares only if k is greater than count
                if (i * i != n && count == k) {
                    return n / i;
                }
            }
        }
        return -1;
    }
}