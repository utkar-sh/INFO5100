package edu.northeastern.utkarsh;

import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        int[] givenArray = {1, 2, 3, 2, 1, 3, 10};
        System.out.print(sumOfUniques(givenArray));
    }

    public static int sumOfUniques(int[] nums){
        int sum = 0;
        HashMap<Integer, Integer> mapOfValues = new HashMap<>();

        for(int val = 0; val < nums.length; val++){
            if (mapOfValues.containsKey(nums[val])) {
                mapOfValues.put(nums[val], mapOfValues.get(nums[val]) + 1);
            } else {
                mapOfValues.put(nums[val], 1);
            }
        }

        for(int val = 0; val < nums.length; val++){
            if(mapOfValues.get(nums[val]) == 1){
                sum = sum + nums[val];
            }
        }
        return sum;
    }
}
