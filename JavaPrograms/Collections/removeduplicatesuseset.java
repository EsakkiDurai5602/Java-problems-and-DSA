import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeduplicatesuseset {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    Set<Integer> set = new HashSet<>();
    for(int a : arr){
        set.add(a);
    }
    System.out.println(set);
    
    sc.close();
  }  
}
