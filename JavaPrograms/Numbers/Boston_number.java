package Numbers;

import java.util.*;
public class Boston_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int sum_pf=0;
        int t=n;
        while(t>0){
            int digit=t%10;
            sum+=digit;
            t/=10;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                int t2=i;
                while(t2>0){
                    int digit=t2%10;
                    sum_pf+=digit;
                    t2/=10;
                }
                n/=i;
            }
        }

        if (n > 1) {
            int t3 = n;
            while (t3 > 0) {
                sum_pf += t3 % 10;
                t3 /= 10;
            }
        }

        if(sum_pf==sum){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
        sc.close();
    }
}