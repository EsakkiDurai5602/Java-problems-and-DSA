import java.util.Scanner;

public class replace_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char oldchar=sc.next().charAt(0);
        char newchar=sc.next().charAt(0);
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==oldchar){
                newStr+=newchar;
            }else{
                newStr+=ch;
            }
        }
        System.out.print(newStr);
        sc.close();;
    }
}