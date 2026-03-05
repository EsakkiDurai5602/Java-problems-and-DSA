package Algorithms.Sorting;
public class quickSort_divide_conquer {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low - 1;       

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1; 
    }


    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
        }
    }


    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i=0;i<arr.length-1;i++) {
            System.out.print(" ");
        }
    }
}
