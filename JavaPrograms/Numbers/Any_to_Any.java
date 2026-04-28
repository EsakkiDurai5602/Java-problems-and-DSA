package Numbers;

import java.util.*;
public class Any_to_Any {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        int t = sn;
        int res = 0, c = 0;

        //sn to decimal
        while(t>0){
            int digit = t%10;
            res=res+(digit*(int)Math.pow(sb,c));
            t/=10;
            c++;
        }

        int dn=0,pos=1;
        t=res;
        //decimal to db
        while(t>0){
            int reminder=t%db;
            dn=dn+(reminder*pos);
            t/=db;
            pos*=10;
        }
        System.out.print(dn);
        sc.close();
    }
}