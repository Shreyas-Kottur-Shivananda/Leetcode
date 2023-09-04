package leetCodeExamples;

import java.util.Arrays;
import java.util.logging.Logger;

public class MergeSortedArray {

    private static final Logger log = Logger.getLogger(MergeSortedArray.class.getName());

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        nums1 = merge(nums1,3,nums2,3);
        log.info(Arrays.toString(nums1));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int actualLength = Math.max(nums1.length - n, 0);
        int[] mergedArray = new int[actualLength + n];
        if(actualLength>0){
            System.arraycopy(nums1, 0, mergedArray, 0, actualLength);
            System.arraycopy(nums2, 0, mergedArray, actualLength, n);
        } else{
            System.arraycopy(nums2, 0, mergedArray, 0, n);
        }
        nums1 = mergedArray;
        return Arrays.stream(nums1).sorted().toArray();
    }
}
