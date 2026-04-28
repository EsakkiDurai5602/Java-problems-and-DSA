package Patterns;

import java.util.*;
public class mountainPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+"\t");
            }
            for(int k=1;k<=2*(n-(i+1))-1;k++){
                System.out.print(" \t");
            }
            for(int l=i;l>=0;l--){
                if(l+1!=n){
                    System.out.print((l+1)+"\t");
                }
            }
            System.out.println();
            }
            sc.close();
        }
    }
