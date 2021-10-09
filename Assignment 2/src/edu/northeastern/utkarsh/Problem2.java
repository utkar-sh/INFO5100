package edu.northeastern.utkarsh;

//Time Complexity: O(n)
//Space Complexity: O(1)
public class Problem2 {
    public static void main(String args[]){

    }

    public int shortestDistance(String[] words, String word1, String word2) {
        int indexWord1 = -1, indexWord2 = -1;

        int minDistance = words.length + 1;

        for(int val = 0; val < words.length; val++) {
            if(words[val].equals(word1)) {
                indexWord1 = val;
            }
            if(words[val].equals(word2)) {
                indexWord2 = val;
            }

            if(indexWord1 != -1 && indexWord2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(indexWord1 - indexWord2));
            }
        }
        return minDistance;
    }
}
