package Arrays;

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] arr = {6,2,8,11,4,9,10,7,12,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
