package Patterns;

import java.util.Scanner;

public class hollow_sand_clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                if(j==n||j==i){
                 System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
        for(int i=n+1;i>=1;i--){
            if(i<n){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
                for(int j=n;j>=i;j--){
                if(j==n||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
    sc.close();
    }
}
