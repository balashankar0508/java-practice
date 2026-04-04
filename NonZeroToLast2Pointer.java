public class NonZeroToLast2Pointer {
    public static int[] moveNonZeroToEnd(int[] nums) {
        int left = 0;
        int right=0;
        for(right=0; right<nums.length; right++){
            if(nums[right]!=0){
               nums[left] = nums[right];
               left++;
            }
        }

        while (left<nums.length) {
            nums[left] = 0;
            left++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -3, 0, 5, -2, 0, 8, 0, -4};
        int[] result = moveNonZeroToEnd(nums);

        System.out.print("Array after moving non-zero elements to the end: ");
        for (int num : result) {
            System.out.print(num + " ");
        }  
    }
    
}
