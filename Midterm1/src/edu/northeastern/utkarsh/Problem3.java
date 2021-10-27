package edu.northeastern.utkarsh;

public class Problem3 {
    public static void main(String args[]){
        int[] givenArray = {1,3,-1,3,4,-1};
        System.out.println(repeatingSum(givenArray));
    }

    public static int repeatingSum(int[] nums) {
        boolean value = true;
        int sum = 0;
        int total = 0;

        for(int val = 0; val < nums.length; val++){
            total += nums[val];
        }

        for (int val1 = 0; val1 < nums.length; val1++){
            value =true;
            for (int val2 = 0; val2 <nums.length; val2++) {
                if (nums[val1] == nums[val2] && val2!=val1) {
                    value =false;
                    break;
                }
            }
            if(value ==true) {
                sum += nums[val1];
            }
        }
        return (total - sum)/2;
    }

}

