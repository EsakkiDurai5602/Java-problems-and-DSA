import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={6,4,5,8,2,9};
        int n=arr.length;

            for(int i=0;i<n-1;i++){
                boolean isswapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isswapped=true;
                }
            }
            if(!isswapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
