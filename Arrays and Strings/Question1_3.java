import java.util.Scanner;

/**
 * Created by Jeprox on 12/9/17.
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If
 * implementing in Java, please use a character array so that you can perform this operation in place.
 * Ex.) Input: "Mr John Smith   ", 13
 *      Output: "Mr%20John%20Smith"
 */

public class Question1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String stmt = input.nextLine();
        char[] charStmt = stmt.toCharArray();
        System.out.print("Enter true length of string: ");
        int trueLen = input.nextInt();

        String answer = replaceSpaces(charStmt, trueLen);

        System.out.println("Input: \"" + stmt + "\", " + trueLen);
        System.out.println("Output: " + "\"" + answer + "\"");
    }

    public static String replaceSpaces(char[] charStmt, int trueLen) {
        StringBuilder step1 = new StringBuilder();
        for(int i = 0; i < trueLen; i++) step1.append(charStmt[i]);
        String step2 = new String(step1);
        return step2.replaceAll(" ", "%20");
    }
}
