package DataStructures;


public class queueArray {
    int size;
    int [] queue;
    int front=-1;
    int rear=-1;

    queueArray(int size){
        queue=new int[size];
        this.size=size;
    }

    void enque(int data){
        if(rear==queue.length-1){
            throw new IndexOutOfBoundsException("Queue is Full");
        }
        if(front==-1&&rear==-1){
            front++;
            queue[++rear]=data;
            return;
        }
        queue[++rear]=data;
    }

    int deque(){
        if(rear==-1){
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        int temp=queue[front];
        for(int i=0;i<=rear;i++){
            queue[i]=queue[i+1];
        }
        --rear;
        return temp;
    }

    void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queueArray q = new queueArray(6);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.display();
        q.deque();
        q.deque();
        q.display();
    }
}

