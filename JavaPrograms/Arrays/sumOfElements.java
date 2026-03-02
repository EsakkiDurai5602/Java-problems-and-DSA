public class sumOfElements{
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}