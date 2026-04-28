package Patterns;

import java.util.*;
public class patternwithzeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print(i+"\t");
                }else{
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
