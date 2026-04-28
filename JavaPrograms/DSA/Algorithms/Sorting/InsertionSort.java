package Algorithms.Sorting;

import java.util.Scanner;

public class InsertionSort{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int size=sc.nextInt();
	    int arr[]=new int [size];
	    
	    for(int i=0;i<=size-1;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<=size-1;i++){
	        for(int j=1;j<=size-1;j++){
	            if(arr[j-1]>arr[j]){
	                int temp=arr[j-1];
	                arr[j-1]=arr[j];
	                arr[j]=temp;
	                j--;
	            }
	        }
	    }
	    for(int i=0;i<=size-1;i++){
	        System.out.print(arr[i]+" ");
	    }
		sc.close();
	}
}
