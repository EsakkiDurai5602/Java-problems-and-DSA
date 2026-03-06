package DataStructures;

public class CircularLinkedList <T>{
    class Node{

        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
        Node tail;

        CircularLinkedList(){
            tail=null;
        }

        //insert Begining
        void insertBegining(T data){
            Node newNode = new Node(data);
            if(tail==null){
                newNode.next=newNode;
                tail=newNode;
                return;
            }
            newNode.next=tail.next;
            tail.next=newNode;
        }

        //display
        void display(){
            Node temp=tail;
            System.out.println();
            do{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }while(temp!=tail);
        }
        public static void main(String[] args) {
            CircularLinkedList <Integer> list = new CircularLinkedList<>();
            list.insertBegining(5);
            list.insertBegining(3);
            list.insertBegining(2);

            list.display();
        }
}
