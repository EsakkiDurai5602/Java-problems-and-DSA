package Patterns;

import java.util.Scanner;

public class zigzag_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x = 1; x <= n; x++){
            if(x % 2 != 0){
                for(int i = 1; i <= n; i++){
                    System.out.print("*");
                    for(int k = 1; k <= n; k++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j < n; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
