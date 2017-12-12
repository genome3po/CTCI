/*
 * Created by Jeprox on 12/11/17.
 * One Away: There are three types of edits that can be performed on strings: insert a
 * character, remove a character, or replace a character. Given two strings, write a function
 * to check if they are one edit (or zero edits) away.
 * Ex.)
 * pale, ple    -> true
 * pales, pale  -> true
 * pale, bale  -> true
 * pale, bake   -> false
 */

public class Question1_5 {
    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }

    public static boolean isOneAway(String input1, String input2) {

        int countMiss = 0;
        String small, big;

        if(input1.length() == input2.length()) {
            for(int i = 0; i < input1.length(); i++) {
                if(input1.charAt(i) != input2.charAt(i)) countMiss++;
            }
            return countMiss <= 1;
        } else if(input1.length() + 1 == input2.length()) {
            small = input1;
            big = input2;
            return oddOneAway(small, big);
        } else if(input2.length() + 1 == input1.length()) {
            small = input2;
            big = input1;
            return oddOneAway(small, big);
        }
        return false;
    }

    public static boolean oddOneAway(String small, String big) {
        int smallIndex = 0;
        int bigIndex = 0;
        while(smallIndex < small.length() && bigIndex < big.length()) {
            if(small.charAt(smallIndex) != big.charAt(bigIndex)) {
                if(smallIndex != bigIndex) {
                    return false;
                }
                bigIndex++;
            } else {
                smallIndex++;
                bigIndex++;
            }
        }
        return true;
    }
}
