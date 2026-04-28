package Patterns;

import java.util.Scanner;

public class Inverted_hour_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n+1; i++) {
            int t=n;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t--;
            }
            for(int k=1;k<=n*2-(i*2-1);k++){
                System.out.print("  ");
            }
            for(int l=n-i+1;l<=n;l++){
                if(l>0){
                System.out.print(l+" ");
                }
            }
            System.out.println();
        }
        for (int i = n+1; i >=0; i--) {
            if(i<n+1){
                int t=n;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t--;
            }
            for(int k=1;k<=n*2-(i*2-1);k++){
                System.out.print("  ");
            }
            for(int l=n-i+1;l<=n;l++){
                if(l>0){
                System.out.print(l+" ");
                }
            }
            System.out.println();
            }
        }
        sc.close();
    }
}
