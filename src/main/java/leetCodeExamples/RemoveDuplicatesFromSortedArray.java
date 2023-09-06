package leetCodeExamples;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,2};
        int k = removeDuplicates(nums1);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
