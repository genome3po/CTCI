/*
 * Created by Jeprox on 12/15/17.
 * Rotate matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
 * to rotate the image by 90 degrees. Can you do this in place?
 */

import java.util.Scanner;

public class Question1_7 {
    public static void main(String[] args) {
        int n = 4;
        char[][] test = new char[n][n];
        char alpha = 'A';

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                test[i][j] = alpha++;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        int size = input.next(int);
        char[][] issue = new char[size][size];
        char[][] answer = rotateMatrix(issue);

    }

    public static char[][] rotateMatrix(char[][] prob) {
        char[][] soln = prob;
        return soln;
    }
}
