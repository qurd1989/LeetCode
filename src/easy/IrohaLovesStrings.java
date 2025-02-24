package easy;

import java.util.Scanner;

public class IrohaLovesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long n = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        String[] v = new String[(int) t];
        for (int i = 0; i < t; i++) {
            v[i] = sc.nextLine();
        }
        // Sort the array manually
        for (int i = 0; i < t - 1; i++) {
            for (int j = i + 1; j < t; j++) {
                if (v[i].compareTo(v[j]) > 0) {
                    String temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        for (String s : v) {
            System.out.print(s);
        }
        String p = "";
        System.out.println(p);
    }
}