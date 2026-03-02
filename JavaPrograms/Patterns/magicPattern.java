import java.util.*;
public class magicPattern {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            for(int l=0;l<n-i;l++){
              if(l!=n-1) {
                System.out.print("*");
              }
            }
            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            if(i!=n-1){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            for(int l=0;l<n-i;l++){
              if(l!=n-1){
                  System.out.print("*");
              }  
            }
            System.out.println();
        }
        }
        sc.close();
        }
    }
