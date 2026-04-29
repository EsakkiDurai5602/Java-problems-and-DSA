package Patterns;


import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cols=0;
        for(int rows=0;rows<n*2;rows++){
            cols=rows<n ? rows+1 : cols-1;
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
