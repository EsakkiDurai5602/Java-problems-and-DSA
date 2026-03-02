import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your nationality: ");
        String nationality = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (nationality.equalsIgnoreCase("INDIAN") && age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
