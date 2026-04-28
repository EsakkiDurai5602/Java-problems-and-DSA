package programs;

public class print_array_in_reverse {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,1};
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
