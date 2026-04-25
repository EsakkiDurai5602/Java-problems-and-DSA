import java.util.HashMap;
import java.util.Scanner;

public class countfrequency {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        System.out.println(map);
        sc.close();
    }
}
