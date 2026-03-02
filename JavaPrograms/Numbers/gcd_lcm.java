
import java.util.Scanner;

public class gcd_lcm {

    
        static int gcd(int x, int y){
        int temp;
        while(y!=0){
            temp=y;
            y=x%y;
            x=temp;
        }
        return x;
        }

        static int lcm(int x,int y){
            return (x*y)/gcd(x,y);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
        sc.close();
    }
}
