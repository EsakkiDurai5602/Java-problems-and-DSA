package Strings;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int n =str.length();

        for(int i=0;i<=n-1;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                isPalindrome=false;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }
        sc.close();
    }
}
