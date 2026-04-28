package Strings;

import java.util.Scanner;

public class char_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = sc.nextLine();
        System.out.print("Enter char:");
        char ch = sc.next().charAt(0);
        int n=str.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(ch==str.charAt(i)){
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}
