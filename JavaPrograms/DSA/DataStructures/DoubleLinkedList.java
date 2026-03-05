package DataStructures;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    
}

public class DoubleLinkedList {

    Node head = null;

    void insertBegining(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
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
        newNode.prev=temp;
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
        if(temp.next==null){
            insertEnd(data);
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        temp.next.prev=newNode;
    }

    boolean search(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false; 
    }  

    //delete by data
    void delete(int data){
    if(head==null) return;

    if(head.data==data){
        head=head.next;
        if(head!=null)
            head.prev=null;
        return;
    }

    Node temp=head;

    while(temp!=null && temp.data!=data){
        temp=temp.next;
    }

    if(temp==null){
        System.out.println("Data not found");
        return;
    }

    if(temp.next!=null)
        temp.next.prev=temp.prev;

    if(temp.prev!=null)
        temp.prev.next=temp.next;
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
        temp.next.prev=temp;
    }

    //display
    void display(){
        Node temp = head;
        System.out.print("null<->");
        while(temp!=null){

            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertBegining(3);
        list.insertBegining(2);
        list.insertBegining(1);
        list.insertBegining(6);
        list.insertEnd(4);
        list.insertIndex(3, 5);

        System.out.println(list.search(5));

        list.display();

        list.delete(6);
        list.display();

        list.deleteIndex(2);
        list.display();
    }
}
