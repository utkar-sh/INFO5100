package edu.northeastern.utkarsh;

//Time Complexity: O(n)
//Space Complexity: O(1)
public class Problem8 {
    public static void main(String args[]){

    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        char lChar, rChar;

        while (left <= right) {
            lChar = s.charAt(left);
            rChar = s.charAt(right);
            if (!Character.isLetterOrDigit(lChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rChar)) {
                right--;
            } else {
                if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
