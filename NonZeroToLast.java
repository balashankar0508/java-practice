public class NonZeroToLast {
    public static int[] moveNonZeroToEnd(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        // Move non-zero elements to the front of the result array
        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        // The remaining elements in the result array will be zero by default
        return result;
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
