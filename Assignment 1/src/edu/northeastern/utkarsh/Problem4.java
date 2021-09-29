package edu.northeastern.utkarsh;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String args[]){
        String ransomNote, magazine;
        ransomNote = "stressed";
        magazine = "desserts";

        System.out.print(isPossibleToConstruct(ransomNote, magazine));
    }

    private static Map<Character, Integer> makeCountsMap(String givenString) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char charInMagazine : givenString.toCharArray()) {
            int currentCount = counts.getOrDefault(charInMagazine, 0);
            counts.put(charInMagazine, currentCount + 1);
        }
        return counts;
    }

    public static boolean isPossibleToConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> magazineCounts = makeCountsMap(magazine);

        for (char charInMagazine : ransomNote.toCharArray()) {
            int countInMagazine = magazineCounts.getOrDefault(charInMagazine, 0);
            if (countInMagazine == 0) {
                return false;
            }
            magazineCounts.put(charInMagazine, countInMagazine - 1);
        }
        return true;
    }
}
