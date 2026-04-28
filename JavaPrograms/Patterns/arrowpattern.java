package Patterns;

import java.util.Scanner;

public class arrowpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=n+2;i++){
            System.out.print(" ");
            for(int j=1;j<=n-2;j++){
                System.out.print(" ");
            }
            System.out.println("e");
        }
        for(int i=n;i>0;i--){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            if(i%2!=0){
                for(int j=i;j>0;j--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
