import java.util.Scanner;

public class Array_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr size of the Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if((arr[j-1]%2==0)&&arr[j]%2==1){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
