package Arrays;

public class RotateArrayToTheRight {
    public static void main(String[] args) {
        rotate1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
    }

    public static void rotate1(int[] nums, int k) {
        if (nums == null)
            return;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            arr[(i + k) % nums.length] = nums[i];
        }
        assignArray(nums, arr);
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void assignArray(int[] nums, int[] arr) {
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = arr[i];
        }
    }
}