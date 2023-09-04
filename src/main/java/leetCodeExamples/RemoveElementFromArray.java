package leetCodeExamples;

import java.util.Arrays;
import java.util.logging.Logger;

public class RemoveElementFromArray {

    private static final Logger log = Logger.getLogger(MergeSortedArray.class.getName());

    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
        int k = removeElement(nums1,2);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == val){
                count++;
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}
