package edu.northeastern.utkarsh;

import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        int[] givenArray = {};
    }

    public static int sumOfUniques(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        int counter = 0;

        for(int val : nums){
            map.put(nums[val], val);
        }

        for(int val : nums){
            if(map.get(val) == 1){
                counter += nums[val];
            }
        }
        return counter;
    }
}
