package Patterns;


import java.util.Scanner;

public class printstar4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<=n;x++){
        for(int i=1;i<=n-i;i++){
            System.out.print(" ");
        }
            for(int j=1;j<=x;j++){
                    System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
