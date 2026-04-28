package Strings;

import java.util.Scanner;

public class string_rotation_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String var = sc.nextLine();
        boolean rotated=true;
        if(str.length()!=var.length()){
            rotated=false;
        }else{
            for(int i=0;i<str.length();i++){
                String r=str.substring(i)+str.substring(0,i);
                if(r.equals(var)){
                    rotated=true;
                    break;
                }else{
                    rotated=false;
                }
            }
        }
        if(rotated){
            System.out.print(rotated);
        }else{
            System.out.print(rotated);
        }
        sc.close();
    }
}
