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
        String r = compress("aabcccccaa");
        System.out.println("This is the final print: " + r);
    }

    public static String compress(String s) {
        // Let's make the string more workable by creating a char array
        char[] c = s.toCharArray();
        StringBuilder b = new StringBuilder();

        System.out.print("Printing while in the method: ");
        for(char c1: c) {
            System.out.print(c1);
            b.append(c1);
        }
        System.out.print("\n");

        return String.valueOf(b);

    }

}
