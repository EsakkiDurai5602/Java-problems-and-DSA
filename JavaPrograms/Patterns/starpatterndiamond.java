package Patterns;


import java.util.Scanner;

public class starpatterndiamond{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cols=0;
        int spaces=0;
        for(int rows=0;rows<n*2;rows++){
            cols=rows<n ? rows+1 : cols-1;
            spaces=n-cols;
            for(int i=0;i<spaces;i++){
                System.out.print(" ");
            }
            for(int j=0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
