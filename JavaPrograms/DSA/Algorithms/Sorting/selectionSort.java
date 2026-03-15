package Algorithms.Sorting;

import java.util.*; 
public class selectionSort{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int size=sc.nextInt();
	    int arr[]=new int [size];
	    
	    for(int i=0;i<=size-1;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<=size-1;i++){
	        int min=Integer.MAX_VALUE;
	        int minidx=i;
	        for(int j=i;j<=size-1;j++){
	            if(min>arr[j]){
	                min=arr[j];
	                minidx=j;
	            }
	        }
			int temp=arr[i];
	        arr[i]=arr[minidx];
	        arr[minidx]=temp;
	    }
	    
	    for(int i=0;i<=size-1;i++){
	        System.out.print(arr[i]+" ");
	    }
		sc.close();
	}
}