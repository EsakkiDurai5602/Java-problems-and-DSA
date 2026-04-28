package programs;

public class maxoperator {
    public static void main(String[] args) {
        int[] arr = {6,2,8,4,9,7,12,1};
        int n=arr.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            res=Math.max(a,b);
        }
    System.out.println(res);
    }

}
