
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 || n%5==0){
            System.out.println("True");
        }else if(n%3==0){
            System.out.println("False");
        }else{
            System.out.println("Not Valid number");
        }
        sc.close();
    }
}
