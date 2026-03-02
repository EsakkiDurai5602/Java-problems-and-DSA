import java.util.Scanner;

public class anagram_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean anagram=true;
        if(str1.length()!=str2.length()){
            anagram=false;
        }else{
            int n=str1.length();
            for(int i=0;i<n;i++){
                str1=str1.toLowerCase();
                str2=str2.toLowerCase();
                char ch=str1.charAt(i);
                if(str2.indexOf(ch)==-1){
                    anagram=false;
                    break;
                }
            }
        }
        if(anagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
