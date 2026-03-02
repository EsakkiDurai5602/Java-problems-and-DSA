import java.util.Arrays;

public class merge_array {
    public static void main(String[] args) {
        int[] arr1 = {6,2,0,8,11,4,0,9,10,7,0,12,1,0};
        int[] arr2 = {4,6,4,2,8,5,2,9,1,8};
        int index=0;
        int[] res_arr = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            res_arr[index]=arr1[i];
            index++;
        }
        for(int j=0;j<arr2.length;j++){
            res_arr[index]=arr2[j];
            index++;
        }
        System.out.println(Arrays.toString(res_arr));
    }
}
