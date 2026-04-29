public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 50, 5, 8, 9, 65, 14, 122 };
        int target = 14;

        int binaryResult = binarySearch(arr, target);
        System.out.println("Found at position " + binaryResult);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
