
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Error : Negative Numbers");
        }else{
            int original=n;
        int temp=n;
        int digit;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=n;
        int res = 0;
        while(temp>0){
            digit=temp%10;
            res=res+((int) Math.pow(digit,count));
            temp/=10;
        }
        if(res==original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        }
        sc.close();
    }
}
