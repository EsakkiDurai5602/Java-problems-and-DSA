package Patterns;

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<(n*2-i*2)-n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i+1)*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n/2;i>=0;i--){
            if(i<n/2){
            for(int j=0;j<(n*2-i*2)-n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i+1)*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();
    }
    }
    sc.close();
}
}
