package edu.northeastern.utkarsh;

import java.util.HashMap;

public class Problem4 {
    public static void main(String args[]){
        String str = "abcabcbb";
        System.out.println(longestSubsttr(str));
    }

    public static String longestSubsttr(String str) {
        int val = 0;
        int st = 0;
        int currentLength = 0;

        int maxLength = 0;
        int start = 0;

        HashMap<Character, Integer> mapOfValues = new HashMap<>();
        mapOfValues.put(str.charAt(0), 0);

        for (val = 1; val < str.length(); val++) {
            if (!mapOfValues.containsKey(str.charAt(val))) {
                mapOfValues.put(str.charAt(val), val);
            } else {
                if (mapOfValues.get(str.charAt(val)) >= st) {
                    currentLength = val - st;
                    if (maxLength < currentLength) {
                        maxLength = currentLength;
                        start = st;
                    }
                    st = mapOfValues.get(str.charAt(val)) + 1;
                }
                mapOfValues.replace(str.charAt(val), val);
            }
        }

        if (maxLength < val - st){
            maxLength = val - st;
            start = st;
        }
        return str.substring(start, start + maxLength);
    }
}