import java.util.Scanner;

public class numpyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<=n;x++){
        for(int i=1;i<=n-x;i++){
            System.out.print(" ");
        }
        for(int j=x;j>=1;j--){
            System.out.print(j);
        }
        for(int k=2;k<=x;k++){
            System.out.print(k);
        }
        System.out.println("");
        }
        sc.close();
    }
}