package programs;


import java.util.Scanner;

public class prizepool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=300 && n<=460){
            System.out.print("You won a MacBook ");
            if(n>=300 && n<=380){
                System.out.println("Model: M1 Mac");
            }else if(n>=380 && n<=460){
                System.out.println("Model: M2 Mac");
            }
        }
        if(n>=200 && n<=280){
            System.out.print("You won a Pack of Kurkure ");
            if(n>=200 && n<=240){
                System.out.println("Chilli Flavor");
            }else if(n>=241 && n<=280){
                System.out.println("Onion Flavor");
            }
        }
        if(n>=1100 && n<=1500){
            System.out.print("You won a Cycle ");
            if(n>=1100&& n<=1300){
                System.out.println("Avon Cycle");
            }else if(n>=1301 && n<=1500){
                System.out.println("Hero Cycle");
            }
        }
        if(n>=50 && n<=60){
            System.out.print("You won a Bike ");
            if(n>=300 && n<=380){
                System.out.println("Bullet bike");
            }else if(n>=380 && n<=460){
                System.out.println("Rajput bike");
            }
        }
        else{
            System.out.println("Better luck next time");
        }
        sc.close();
    }
}
