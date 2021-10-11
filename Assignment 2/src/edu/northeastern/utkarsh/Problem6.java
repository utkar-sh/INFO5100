package edu.northeastern.utkarsh;


import java.util.HashMap;
import java.util.HashSet;

//Time Complexity: O(n)
//Space Complexity: O(n)
public class Problem6 {
    public static void main(String args[]){

    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int val = 0; val < s.length(); val++) {
            char char1 = s.charAt(val);
            char char2 = t.charAt(val);

            if (map.containsKey(char1)) {
                if (map.get(char1) != char2) {
                    return false;
                }
            } else {
                map.put(char1, char2);
            }
        }

        HashSet<Character> set = new HashSet<>(map.values());
        if (set.size() == map.values().size()) {
            return true;
        }
        return false;
    }
}
