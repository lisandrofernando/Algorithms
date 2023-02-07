public class QueueOp {
    
    int rear;
    int front;
    int [] a;
    int size;

    public QueueOp(int size){
        rear = -1;
        this.size = size;
        this.a = new int [size];
    }

    public void enQueue(int x){
        rear ++;
        a[rear] = x;
    }
   public int deQueue(){
    int ele = a[0];
    for (int i=0; i<rear; i++){
        a[i] = a[i+1];
    }
    rear--;
    return ele;
   }

   public void printQueue(){
     
    for(int i=0; i<=rear; i++){
        System.out.println(a[i]);
    }

   }

   public static void main(String [] args) {
    QueueOp qe = new QueueOp(5);
    qe.enQueue(4);
    qe.enQueue(6);
    qe.enQueue(8);
    qe.deQueue();
    qe.enQueue(12);
    qe.enQueue(15);
    qe.deQueue();
    qe.deQueue();
    qe.printQueue();
   }
}