

public class removeduplicates {
    public static void main(String[] args) {
        String str = "sdrtwertysdr";
        int n = str.length();
        String newStr="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<n;j++){
                if(newStr.indexOf(ch)==-1){
                   newStr+=ch;
                }
            }
        }
        System.out.println(newStr);
    }
}
