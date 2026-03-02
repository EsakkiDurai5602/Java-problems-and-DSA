import java.util.Scanner;

public class SortArrayWithoutArrayClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the Size of the array:");
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=scan.nextInt();
        }
        int temp=arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j< n; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The elements in sorted array");
        for (int i=0;i<n;i++){
            System.out.println("Element "+(i+1)+" :"+arr[i]);
        }
            scan.close();
    }

}