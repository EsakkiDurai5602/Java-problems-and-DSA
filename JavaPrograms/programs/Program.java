package programs;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=300 && n<=460){
            System.out.println("Macbook");
        }else if(n>=200 && n<=280){
            System.out.println("Kurkure");
        }
        else if(n>=1100 && n<=1500){
            System.out.println("Cycle");
        }else if(n>50 && n<=80){
            System.out.println("bike");
        }else{
            System.out.println("Better luck next time");
        }
        sc.close();
    }
}
