package Arrays;

import java.util.Scanner;

public class left_rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter rotate array value ");
        int k = sc.nextInt();
        k=k%n;
        while(k>0){
            for(int i=0;i<n-1;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            k--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
