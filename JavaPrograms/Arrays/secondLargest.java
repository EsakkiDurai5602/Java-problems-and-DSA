package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {6,2,8,11,4,9,10,7,12,1};
        int l=arr[0];
        int sl=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>l){
                sl=l;
                l=arr[i+1];
                System.out.println(l);
                System.out.println(sl);
            }
        }
        System.out.println(sl);
    }
}
