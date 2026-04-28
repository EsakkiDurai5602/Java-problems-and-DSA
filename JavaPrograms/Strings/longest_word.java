package Strings;

import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String longest="";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(longest.length()<words[i].length())
                longest=words[i];
        }
        System.out.print(longest);
        sc.close();
    }
}
