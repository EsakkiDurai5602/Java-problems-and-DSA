package Numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<10 && n>=0){
            System.out.println(n);
        }else if (n<0) {
            System.out.println("Error: Negative Number");
        }else{
            int digit ;
            int res = 0;
            while(n>0){
                digit=n%10;
                res=(res*10)+digit;
                n/=10;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
