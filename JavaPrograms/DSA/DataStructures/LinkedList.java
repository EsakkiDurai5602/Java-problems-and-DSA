package DataStructures;

public class LinkedList {
    class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}


    Node head = null;

    void insertBegining(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void insertEnd(int data){
        if(head==null){
            insertBegining(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void insertIndex(int index,int data){
        if(index<0){
            System.out.println("Can't Insert : Invalid Index");
            return;
        }
        Node temp=head;
        for(int i=0;temp.next!=null&&i<index-1;i++){
            temp=temp.next;
        }
        Node newNode = new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    boolean search(int data){
        Node temp = head;
        while(temp.next!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false; 
    }   

    //delete by data
    void delete(int data){
        Node temp=head;
        while(temp.next.data!=data&&temp.next==null){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    //delete by Index
    void deleteIndex(int index){
        if(index<0){
            System.out.println("Can't deleteIndex : Invalid Index");
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
            if(temp.next==null){
                System.out.println("Can't deleteIndex : Invalid Index");
                return;
            }
        }
        temp.next=temp.next.next;
    }

    //reverse
    void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    //display
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBegining(3);
        list.insertBegining(2);
        list.insertBegining(1);
        list.insertEnd(4);
        list.insertIndex(3, 5);

        System.out.println(list.search(8));

        list.display();

        list.deleteIndex(5);

        list.display();
    }
}
