import java.util.Scanner;

/**
 * Created by Jeprox on 12/9/17.
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

public class Question1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter two strings separated by space, i.e.) foo bar : ");
        String string1 = input.next();
        String string2 = input.next();

        System.out.println("Are the strings permutation of each other? " + isPermutation(string1, string2));

    }

    public static boolean isPermutation(String string1, String string2) {
        return true;
    }

}
