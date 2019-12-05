package com.example.user.myapplication.JavaPart;



import java.util.Scanner;

public class KingdomSArmory {
    // Complete the kingdomDivision function below.
    static int kingdomDivision(int n, int[][] roads) {



        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] roads = new int[n-1][2];

        for (int i = 0; i < n-1; i++) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int roadsItem = Integer.parseInt(roadsRowItems[j]);
                roads[i][j] = roadsItem;
            }
        }

        int result = kingdomDivision(n, roads);

        System.out.println(result);
        scanner.close();
    }

}
