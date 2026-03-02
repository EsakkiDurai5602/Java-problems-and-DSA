import java.util.*;
public class fibonaccipattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        int next=1;
        int cur=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(res+"\t");
            cur=res;
            res+=next;
            next=cur;
            }
            System.out.println();
        }
        sc.close();
    }
}