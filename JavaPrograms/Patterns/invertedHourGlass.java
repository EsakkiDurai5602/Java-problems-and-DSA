package Patterns;

import java.util.*;
public class invertedHourGlass {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n+1;i++){
            int t=n;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t--;
            }
            for(int k=1;k<=2*n-2*i+1;k++){
                System.out.print("  ");
            }
            for(int l=n-i+1;l<=n;l++){
                if(l!=0){
                System.out.print(l+" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            int t=n;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t--;
            }
            for(int k=1;k<=2*n-2*i+1;k++){
                System.out.print("  ");
            }
            
            for(int l=n-i+1;l<=n;l++){
                if(l!=0){
                System.out.print(l+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
