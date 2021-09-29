package edu.northeastern.utkarsh;

//Tested for various inputs
public class Problem3 {
    public static void main(String args[]){
        int[] givenArray = {2, 2, 4, 5, 6, 5, 4, 6, 1};
        System.out.print(nonRepeatingChar(givenArray));
    }

    public static int nonRepeatingChar(int[] nums) {
        int sing = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sing = sing ^ nums[i];
        }
        return sing;
    }
}
