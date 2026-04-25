import java.util.ArrayList;

public class arrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> listnum = new ArrayList<>();
        ArrayList<String> listname = new ArrayList<>();
        listnum.add(10);
        listnum.add(20);
        listnum.add(30);
        listnum.add(40);
        listnum.add(50);
        System.out.println(listnum);
        listnum.remove(3);
        System.out.println(listnum);
        listnum.set(0,5);
        System.out.println(listnum);

        listname.add("Karthi");
        listname.add("preethi");
        listname.add("Mathi");
        listname.add("Vicky");
        listname.add("Bala");
        listname.add("Dheena");
        listname.add("Chandru");
        listname.add("Alex");
        for(String name : listname){
            if(name.length()>4){
                System.out.println(name);
            }
        }
    }
}
