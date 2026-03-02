import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,1};
        int n=arr.length;
       for(int i=0;i<n/2;i++){
                int temp=arr[n-i-1];
                arr[n-i-1]=arr[i];
                arr[i]=temp;
       }
        System.out.print(Arrays.toString(arr));
    }
}
