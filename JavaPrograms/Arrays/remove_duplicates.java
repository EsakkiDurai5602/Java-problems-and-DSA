package Arrays;

import java.util.Arrays;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {4,6,4,2,8,5,2,9,1,8};
        int[] res_arr = new int[arr.length];
        int count = 0;

       for(int i=0;i<arr.length;i++){
        boolean isDuplicate=false;
        for(int j=0;j<count;j++){
            if(arr[i]==res_arr[j]){
                isDuplicate=true;
                break;
            }
        }
        if(!isDuplicate){
            res_arr[count]=arr[i];
            count++;
        }
       }
       int[] final_array=Arrays.copyOf(res_arr, count);
       System.out.println(Arrays.toString(final_array));
    }
}