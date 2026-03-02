import java.util.Scanner;

public class reverse_array_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={3,5,7,9,1,8,2,6};
        System.out.println("Enter start index range");
        int s=sc.nextInt();
        System.out.println("Enter end index range");
        int e=sc.nextInt();
       for(int i=s;i<=e;i++){
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
        sc.close();
    }
}
