package Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }
        while (insertPos < nums.length)
            nums[insertPos++] = 0;
    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeros.moveZeroes(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
