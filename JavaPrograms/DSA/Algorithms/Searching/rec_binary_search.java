package Algorithms.Searching;

public class rec_binary_search {

    public static int binarysearch(int[] arr,int left,int right,int key){
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            right--;
            return binarysearch(arr, left, right, key);
        }else{
            left++;
            return binarysearch(arr, left, right, key);
        }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={2,4,5,7,9,11,13,25};
        int target =0;
        int index=binarysearch(arr,0,arr.length,target);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found.");
        }
    }
}

