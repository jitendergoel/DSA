package SORTING.BubbleSort;

public class BubbleSort{
    /**
     * Bubble Sort Algorithm
     * This method sorts an array of integers using the bubble sort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void bubbleSort (int[] arr){
        if (arr == null || arr.length <= 1){
            return;
        }
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        printArray(arr);
    }
}

