package DataStructures;


class StackArray {
    int size;
    int [] stack;
    int top=-1;

    StackArray(int size){
        stack=new int[size];
        this.size=size;
    }

    void push(int data){
        if(top==size-1){
            System.out.println("OverFlow");
            return;
        }
        stack[++top]=data;
    }

    int pop(){
        if(top==-1){
            System.out.print("UnderFlow");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if(top==-1){
            System.out.print("UnderFlow");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackArray  stackarr1 = new StackArray(10);
        stackarr1.push(1);
        stackarr1.push(2);
        stackarr1.push(3);
        stackarr1.push(4);
        stackarr1.push(5);

        System.out.println(stackarr1.pop());
        System.out.println(stackarr1.peek());
        System.out.println(stackarr1.isEmpty());
    }
}
