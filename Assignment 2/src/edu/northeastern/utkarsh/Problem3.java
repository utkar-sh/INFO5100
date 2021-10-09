package edu.northeastern.utkarsh;

//Time Complexity: O(n)
//Space Complexity: O(1)
public class Problem3 {
    public static void main(String args[]){

    }

    public void moveZeroes(int[] nums){
        int k = 0;

        for (int val : nums){
            if (val != 0) {
                nums[k++] = val;
            }
        }

        for (int val = k; val < nums.length; val++){
            nums[val] = 0;
        }
    }
}
