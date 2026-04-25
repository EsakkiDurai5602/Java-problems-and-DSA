package Algorithms.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search_2d {

    public static int[] search(int[][] arr,int target){
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter the element at ("+i+","+j+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(search(arr,target)));
    }
}
