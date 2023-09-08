package leetCodeExamples;

import java.util.Arrays;

public class MajorityElementInArray {

    public static void main(String[] args){
        int[] nums = new int[]{2,2};
        majorityElement(nums);

    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 0;
        int  majorityele = 0;
        if(nums.length == 1) return nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(i == nums.length-1){
                    if(count>maxCount){
                        return nums[i];
                    }
                }
            } else {
                if(count > maxCount){
                    maxCount = count;
                    count = 1;
                    majorityele = nums[i-1];
                }
            }
        }
        return majorityele;
    }
}
