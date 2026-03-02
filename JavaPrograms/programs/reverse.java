import java.util.Scanner;

public class reverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		int digit=0;
		while (n>=0){
		    digit = n % 10;
		    res = res*10+digit;
		}
		System.out.println(res);
		sc.close();
	}
}
