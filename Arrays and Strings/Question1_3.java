/*
 * Created by Jeprox on 12/9/17.
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If
 * implementing in Java, please use a character array so that you can perform this operation in place.
 * Ex.) Input: "Mr John Smith   ", 13
 *      Output: "Mr%20John%20Smith"
 */

import java.util.Scanner;

public class Question1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String stmt = input.nextLine();
        char[] charStmt = stmt.toCharArray();
        System.out.print("Enter true length of string: ");
        int trueLen = input.nextInt();
        System.out.println("Input: \"" + stmt + "\", " + trueLen);
        System.out.println("Output: " + "\"" + replaceSpaces(charStmt, trueLen) + "\"");
    }

    public static String replaceSpaces(char[] charStmt, int trueLen) {
        StringBuilder urlify = new StringBuilder();
        for(int i = 0; i < trueLen; i++) urlify.append(charStmt[i]);
        return urlify.toString().replaceAll(" ", "%20");
    }
}
