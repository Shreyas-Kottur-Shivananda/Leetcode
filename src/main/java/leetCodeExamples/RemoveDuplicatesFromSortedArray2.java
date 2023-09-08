package leetCodeExamples;

public class RemoveDuplicatesFromSortedArray2 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,1,1,2,2,3};
        int k = removeDuplicates(nums1);
    }

    public static int removeDuplicates(int[] nums) {
        int index=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[index-2])
            {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
