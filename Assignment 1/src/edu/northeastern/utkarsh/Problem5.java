package edu.northeastern.utkarsh;

public class Problem5 {
    public static void main(String args[]) {
        String str = "Aa12s1d3";
        System.out.print(stringInspection(str));
    }

    public static boolean stringInspection(String str){
        boolean itIsADigit = false;
        boolean itIsAnAlphabet = false;

        char characterAtIndex = str.charAt(0);

        if(Character.isDigit(characterAtIndex)){
            itIsADigit = true;
        } else {
            itIsAnAlphabet = true;
        }

        for(int val = 1; val < str.length(); val++){
            char checkCharacter = str.charAt(val);
            if(itIsADigit){
                if(Character.isDigit(checkCharacter)){
                    return false;
                } else{
                    itIsAnAlphabet = true;
                    itIsADigit = false;
                }
            } else if(itIsAnAlphabet){
                if(Character.isLetter(checkCharacter)){
                    return false;
                } else {
                    itIsAnAlphabet = false;
                    itIsADigit = true;
                }
            }
        }
        return true;
    }
}
