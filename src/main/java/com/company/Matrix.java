package com.company;

/**
 * Created by Ulan on 1/25/2017.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] mA =
                {{1,2,3},
                {1,2,3},
                {1,2,3},};

        int[][] mB =
                {{1,2,3},
                {1,2,3},
                {1,2,3}};


        int m = 3;
        int n = 3;
        int o = 3;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.printf("%4d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
