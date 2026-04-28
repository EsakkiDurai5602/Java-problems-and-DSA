package Algorithms.Sorting;

public class quickSortMedianOfThree {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void medianOfThree(int[] arr, int low, int high){
        int mid = (low + high) / 2;

        if(arr[low] > arr[mid]) swap(arr, low, mid);
        if(arr[low] > arr[high]) swap(arr, low, high);
        if(arr[mid] > arr[high]) swap(arr, mid, high);


        swap(arr, mid, high);
    }

    public static int partition(int[] arr,int low,int high){
        medianOfThree(arr, low, high);

        int pivot = arr[high];
        int i = low;
        int j = high - 1;

        while(i <= j){
            while(i <= j && arr[i] <= pivot){
                i++;
            }
            while(i <= j && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }

        swap(arr, i, high);
        return i;
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 4, 5, 8, 12, 1, 6};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
