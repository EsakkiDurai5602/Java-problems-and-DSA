package Numbers;

import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
