package Algorithms.Sorting;


import java.util.*;

public class inverseNum {

    public static int inverseNumber(int n) {
        int position = 1;
        int inverse = 0;

        while (n > 0) {
            int digit = n % 10;          
            inverse += position * Math.pow(10, digit - 1);
            n = n / 10;                  
            position++;
        }

        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(inverseNumber(n));
        sc.close();
    }
}
