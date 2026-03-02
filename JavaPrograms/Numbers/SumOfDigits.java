
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int res=0;
        while(n>0){
            digit=n%10;
            res+=digit;
            n/=10;
        }
        System.out.println(res);
        sc.close();
    }
}
