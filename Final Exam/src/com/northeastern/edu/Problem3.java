package com.northeastern.edu;

public class Problem3 {
    public static int contiguousSubArraySum(int[] nums, int k) {
        int count = 0;
        for (int begin = 0; begin < nums.length; begin++) {
            for (int end = begin + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int val = begin; val < end; val++){
                    sum += nums[val];
                }
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int[] nums = {1, 1, 1};
        int[] nums2 = {1, 2, 3};
        int k = 2;
        int k2 = 3;
        System.out.println(contiguousSubArraySum(nums, k));
        System.out.println(contiguousSubArraySum(nums2, k2));
    }
}

