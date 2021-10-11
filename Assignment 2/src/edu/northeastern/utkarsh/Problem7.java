package edu.northeastern.utkarsh;

public class Problem7 {
    public static void main(String args[]){

    }

    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        String result = "";

        int length1 = num1.length();
        int length2 = num2.length();
        int difference = length2 - length1;

        int carry = 0;

        for (int val = length1 - 1; val >= 0; val--){
            int sum = ((int)(num1.charAt(val)-'0') +
                    (int)(num2.charAt(val+difference)-'0') + carry);
            result += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        for (int val = length2 - length1 - 1; val >= 0; val--){
            int sum = ((int)(num2.charAt(val) - '0') + carry);
            result += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            result += (char)(carry + '0');

        return new StringBuilder(result).reverse().toString();
    }
}
