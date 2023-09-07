package Striver.Sorting;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low ; j <= high ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, high);

        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 3, 6, 7};

        sort(arr);
        //quickSort(arr, 0, arr.length-1);
        
        for (int j : arr) {
            System.out.print(j);
        }
    }


}
