package DataStructures;

public class DynamicArray {
    int arr[];
    int size;
    int capacity;
    
    //create array
    DynamicArray(int capacity){
        arr = new int[capacity];
        this.capacity=capacity;
        size=0;
    }

    //insert 
    boolean insert(int index,int element){
        if(index<0||index>size){
            System.out.println("Can't insert : Invalid Index");
            return false;
        }
        else if(size>=capacity){
            resize();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        size++;
        return true;
    }

    //get
    int get(int index){
        if(index<0||index>size){
            System.out.println("Can't get : Invalid Index");
            return -1;
        }
        return arr[index];
    }

    //set
    void set(int index,int element){
        if(index<0||index>size){
            System.out.println("Can't Set : Invalid Index");
        }
        arr[index]=element;
    }

    //search
    int search(int element){
        for (int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    //delete
    boolean delete(int index){
        if(index<0||index>size){
            System.out.println("Can't get : Invalid Index");
            return false;
        }
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return true;
    }

    void resize(){
        capacity*=2;
        int [] newArr = new int[capacity];
        for(int i =0;i<size;i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    //display
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray arr1 = new DynamicArray(5);

        arr1.insert(0,5);
        arr1.insert(1, 7);
        arr1.insert(2, 9);
        arr1.insert(2,8);
        arr1.insert(2,3);
        arr1.insert(2,6);
        arr1.insert(2,11);
        arr1.insert(6,10);

        System.out.println(arr1.capacity);

        arr1.display();

        arr1.set(3,6);

        System.out.println(arr1.search(6));
        System.out.println(arr1.get(2));

        arr1.delete(3);

        arr1.display();

    }
}

