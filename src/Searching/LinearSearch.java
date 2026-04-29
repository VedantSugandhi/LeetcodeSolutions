class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 50, 5, 8, 9, 65, 14, 122 };
        int target = 14;

        System.out.println("Unsorted array");
        for (int num : arr)
            System.out.print(num + " ");

        int result = linearSearch(arr, target);
        System.out.println("Found at position " + result);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}