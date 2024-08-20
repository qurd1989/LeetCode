package medium;

import java.util.Scanner;

public class CountOf3s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 3; i <= n; i++) {
                int temp = i;
                while (temp > 0) {
                    if (temp % 10 == 3) {
                        count++;
                    }
                    temp = temp / 10;
                }
            }
            System.out.println(count);
        }
    }
    public static int countOf3s(int x) {
        int count = 0;
        char c[] = String.valueOf(x).toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '3') {
                count++;
            }
        }
        return count;
    }
}
