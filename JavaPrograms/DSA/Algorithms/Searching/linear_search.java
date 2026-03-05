package Algorithms.Searching;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int t=0;
        boolean targetfound=false;
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                targetfound=true;
                t=i;
                break;
            }
        }
        if(targetfound){
            System.out.println("Target found at "+t);
        }else{
            System.out.print("Target not found.");
        }
        sc.close();
    }
}
