import java.util.Scanner;

public class diamondhollowstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // N must be odd

        int mid = N / 2;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(
                  
                    i == 0 || i == N-1 || j == 0 || j == N-1 ||

                    ((j == i || j == N-1-i) && !(i == mid && j == mid))
                ){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}