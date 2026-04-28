package programs;

import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            str[i]=arr[i]%2==0 ? "Even":"Odd";
        }   
        for(int i=0;i<n;i++){
            System.out.print(str[i]+" ");
        }
        sc.close();
    }
}
