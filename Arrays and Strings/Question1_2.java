/*
 * Created by Jeprox on 12/9/17.
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class Question1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two strings separated by space, i.e.) foo bar : ");
        String string1 = input.next();
        String string2 = input.next();
        System.out.println("Are the strings permutation of each other? " + isPermutation(string1, string2));
    }

    public static boolean isPermutation(String string1, String string2) {
        // first lets check if both strings are equal length.
        if(string1.length() != string2.length()) return false;
        else {
            // check if both are permutation of each other.
            // first store both strings in a HashMap.
            Map<String, Integer> map1;
            Map<String, Integer> map2;

            map1 = storeInHM(string1);
            map2 = storeInHM(string2);

            System.out.println("Map 1 looks like this: " + map1);
            System.out.println("Map 2 looks like this: " + map2);

            // Get all entries into a set
            Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();

            // Compare all entries from each entry to map2
            for(Map.Entry<String, Integer> entry : entrySet) {

                String key = entry.getKey();
                if (!map2.containsKey(key) || entry.getValue() != map2.get(key)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static Map<String, Integer> storeInHM(String toBeStored) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < toBeStored.length(); i++) {
            String key = String.valueOf(toBeStored.charAt(i));
            if(!map.containsKey(key)) map.put(key, 1);
            else {
                int value = map.get(key);
                value++;
                map.put(key, value);
            }
        }
        return map;
    }
}
