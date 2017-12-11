/**
 * Created by Jeprox on 12/9/17.
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data
 * structures?
 */

import java.util.Scanner;

public class Question1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String problem = input.next();

        System.out.println("Is the string unique? " + isUnique(problem));

    }

    public static boolean isUnique(String unique) {

        for(int i = 0; i < unique.length(); i++) {

            for(int j = i+1; j < unique.length(); j++) {
                if (unique.charAt(i) == unique.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
