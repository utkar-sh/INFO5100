package edu.northeastern.utkarsh;

public class Problem2 {
    public static void main(String args[]){
        int[] givenArray = {1, 2, 3, 2};
        printArray(sortedSquares(givenArray));
    }

    public static void printArray(int[] nums){
        for(int val = 0; val < nums.length; val++){
            System.out.print(nums[val] + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] finalArray = new int[nums.length];
        int s = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] < 0) {
                j++;
            }
            nums[k] = nums[k] * nums[k];
        }
        i = j -1;
        while (i >= 0 && j <= nums.length - 1) {
            if (nums[i] < nums[j]) {
                finalArray[s] = nums[i];
                i--;
            } else {
                finalArray[s] = nums[j];
                j++;
            }
            s++;
        }
        while (i >= 0) {
            finalArray[s] = nums[i];
            i--;
            s++;
        }
        while (j <= nums.length - 1) {
            finalArray[s] = nums[j];
            j++;
            s++;
        }
        return finalArray;
    }
}
