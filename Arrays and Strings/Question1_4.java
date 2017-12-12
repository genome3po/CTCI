/*
 * Created by Jeprox on 12/10/17.
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of
 * a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome does not need to be limited to
 * just dictionary words.
 * Ex.)
 * Input:   Tact Coa
 * Output:  True (permutations: "taco cat", "atco cta", etc.)
 * Hit: #106, #121, #134, #136
 */

import java.util.Map;
import java.util.HashMap;

public class Question1_4 {

    public static void main(String[] args) {
        System.out.println(isPalinPerm("Tact Coa"));
    }

    public static boolean isPalinPerm(String input) {
        int countOdd = 0;
        Map<String, Integer> map = new HashMap<>();
        String step1 = input.toLowerCase();
        String stmt = step1.replace(" ", "");
        for(int i = 0; i < stmt.length(); i++) {
            String key = String.valueOf(stmt.charAt(i));
            if(!map.containsKey(key)) {
                map.put(key, 1);
                countOdd++;
            } else {
                int value = map.get(key);
                value++;
                if(value % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
                map.put(key, value);
            }
        }
        return (countOdd <= 1);
    }
}
