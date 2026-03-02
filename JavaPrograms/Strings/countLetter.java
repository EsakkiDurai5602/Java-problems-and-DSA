
import java.util.Scanner;

public class countLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vow=0;
        int cons=0;
        int space=0;
        int n=str.length();
        for(int i=0;i<=n-1;i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if("aeiou".indexOf(ch)!=-1){
                vow++;
            }else if(" ".indexOf(ch)!=-1){
                space++;
            }else{
                cons++;
            }
            }
            System.out.println("Vowels: "+vow);
            System.out.println("Consonants: "+cons);
            System.out.println("Spaces: "+space);
            sc.close();
        }
    }

