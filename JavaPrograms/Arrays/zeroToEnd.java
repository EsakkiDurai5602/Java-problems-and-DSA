import java.util.Arrays;

public class zeroToEnd {
    public static void main(String[] args) {
        int[] arr = {6,2,0,8,11,4,0,9,10,7,0,12,1,0};
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
}
