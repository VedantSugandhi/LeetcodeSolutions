package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 50, 5, 8, 9, 65, 14, 122 };

        System.out.println("Unsorted array");
        for (int num : arr)
            System.out.print(num + " ");

        bubbleSort(arr);
        System.out.println("Sorted array");
        for (int num : arr)
            System.out.print(num + " ");
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
