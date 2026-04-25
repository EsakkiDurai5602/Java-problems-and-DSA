package Algorithms.Searching;
public class binary_search {

    public static int binarysearch(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                right--;
            }else{
                left++;
            }
        }
        
        return -1;
    }
    public static void main(String[] args){
        int [] arr={2,4,5,7,9,11,13,25};
        int target =4;
        int index = binarysearch(arr,target);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found.");
        }
    }
}
