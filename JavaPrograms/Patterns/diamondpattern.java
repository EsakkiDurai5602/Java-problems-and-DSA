
import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<=n;x++){
        for(int i=1;i<=n-x;i++){
            System.out.print(" ");
        }
            for(int j=1;j<=x;j++){
                    System.out.print("*");
            }
            System.out.println("");
        }
        for(int x=1;x<n;x++){
            for(int i=1;i<=x;i++){
                 System.out.print(" ");
            }
            for(int j=n-1;j>=x;j--){
                    System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
