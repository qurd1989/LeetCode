package arrays;

import java.util.Scanner;

public class CountDigitsThatDivideNumber {

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // Number of test cases

            while (t-- > 0) {
                long n = sc.nextLong(); // Number of points on the boundary

                // Calculate the maximum possible number of pieces
                long maxPieces = (n * (n - 1)) / 2 + 1;

                System.out.println(maxPieces);
            }

            sc.close();
        }

    }

