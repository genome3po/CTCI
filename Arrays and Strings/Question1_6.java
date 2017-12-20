/*
 * Created by Jeprox on 12/13/17.
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated character. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should
 * return the original string. You can assume the string has only uppercase and lowercase
 * letters (a - z).
 */

public class Question1_6 {
    public static void main(String[] args) {
        String answer = compress("aabcccccaaa") + " " +
                compress("abcdefghijjjjjjjjkl") + " " +
                compress("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzxxxxxxv");
        System.out.println("\nThis is the final print: " + answer);
    }

    public static String compress(String s) {

        // Let's make the string more workable by creating a char array
        char[] c = s.toCharArray(); // optional
        StringBuilder b = new StringBuilder();

        //===== DEBUG =====
        System.out.print("Is there any inside the StringBuilder var?: " + b.length() + "\n");
        //===== DEBUG END =====

        int count = 0; //counter for current alpha

        for(int i = 0; i < c.length; i++) {
            if(b.length() == 0) {
                b.append(c[i]);
                count++;
            }
            else if(c[i] == b.charAt(b.length() - 1)) {
                count++;
            }
            else if(c[i] != b.charAt(b.length() - 1)) { // next alpha is not the same any more
                b.append(count); // concat the last value of count to 'b'
                b.append(c[i]); // add the new current alpha to 'b'
                count = 0; // reset the counter
                count++;
            }
        }
        b.append(count); // don't forget to add the last count value

        //===== DEBUG =====
//        System.out.print("Printing while in the method: ");
//        for(char c1: c) {
//            System.out.print(c1);
//            b.append(c1);
//        }
//        System.out.print("\n");
//
//        System.out.print("Checking if index starts at 0: ");
//        for(int i = 0; i < c.length; i++) {
//            System.out.print(c[i]);
//        }
//        System.out.print("\n");
//
//        System.out.print("What's inside the StringBuilder var?: " + b.length() + "\n");
        //===== DEBUG END =====

        System.out.println("What inside b string: " + b.toString());
        System.out.println("Length of b string: " + b.length());
        System.out.println("Length of original string: " + s.length());

        if(b.length() < s.length()) return b.toString();
        else return s;

    }

}
