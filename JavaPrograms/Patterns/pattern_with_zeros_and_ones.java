import java.util.Scanner;

public class pattern_with_zeros_and_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1);
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i%2!=0){
                    if(j==0||j==i){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
