package DataStructures;

public class StackLinkedList {
    class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    Node top=null;
    void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(top==null){
            System.out.println("UnderFlow");
            return -1;
        }
        int temp = top.data;
        top=top.next;
        return temp;
    }

    int peek(){
        if(top==null){
            System.out.println("UnderFlow");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stacklist = new StackLinkedList();
        stacklist.push(1);
        stacklist.push(2);
        stacklist.push(3);
        stacklist.push(4);
        stacklist.push(5);

        System.out.println(stacklist.pop());
        System.out.println(stacklist.peek());
        System.out.println(stacklist.isEmpty());
    }
}

