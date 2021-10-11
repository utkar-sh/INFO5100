package edu.northeastern.utkarsh;

import java.util.Arrays;

public class Problem9 {
    public static void main(String args[]){

    }

    public String reverseWords(String str) {
        if (str == null)
            return null;

        char[] charArray = str.toCharArray();
        char[] result = cleanSpaces(charArray);

        reverse(result, 0, result.length - 1);
        reverseWords(result);
        return new String(result);
    }

    void reverseWords(char[] charArray) {
        int val1 = 0, val2 = 0;
        while (val1 < charArray.length) {
            while (val1 < charArray.length && charArray[val1] == ' ') {
                val1++;
            }
            val2 = val1;
            while (val2 < charArray.length && charArray[val2] != ' ') {
                val2++;
            }
            reverse(charArray, val1, val2 - 1);
            val1 = val2;
        }
    }

    char[] cleanSpaces(char[] charArray) {
        int val1 = 0, val2 = 0;
        while (val1 < charArray.length && val2 < charArray.length) {
            while (val2 < charArray.length && charArray[val2] == ' ') {
                val2++;
            }
            while (val2 < charArray.length && charArray[val2] != ' ') {
                charArray[val1++] = charArray[val2++];
            }
            while (val2 < charArray.length && charArray[val2] == ' ') {
                val2++;
            }
            if (val2 < charArray.length) {
                charArray[val1++] = ' ';
            }
        }
        return Arrays.copyOf(charArray, val1);
    }

    private void reverse(char[] charArray, int val1, int val2) {
        while (val1 < val2) {
            char t = charArray[val1];
            charArray[val1++] = charArray[val2];
            charArray[val2--] = t;
        }
    }
}
