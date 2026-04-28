package Arrays;

public class max_min{
    public static void main(String[] args) {
        int[] arr = {6,2,8,4,9,7,12,1};
        int s=arr.length;
        int min=arr[0];
        for(int i=0;i<s-1;i++){
            if(arr[i+1]<min){
                min=arr[i+1];
            }
        }
        System.out.println(min);
    }
}