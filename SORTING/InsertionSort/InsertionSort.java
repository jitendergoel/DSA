package SORTING.InsertionSort;

import java.util.Arrays;

public class InsertionSort{
    public static int[] insertion_sort(int[] arr, boolean reverse){
        if(arr.length <=1){
            return arr;
        }
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j>0){
                if((!reverse && arr[j] < arr[j-1]) || (reverse && arr[j] > arr[j-1])){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
                else break;
            }
        }
        return arr;
    }

    public static int[] insertion_sort(int[] arr){
        return insertion_sort(arr, false);
    }

    public static void main(String[] args){
        int[] test_arr = {34,31,23,43,545,32,98,13,18};
        int[] sorted_arr = insertion_sort(test_arr, true);
        System.out.println("Sorted Array: " + Arrays.toString(sorted_arr));
        
    }
}