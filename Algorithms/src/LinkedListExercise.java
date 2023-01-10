public class LinkedListExercise {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    Node tail = null;

    public void addNodeAtEnd(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }
    public void deleteFirstNode(){
        head = head.next;
    }
//Deleting the last node
    public void deleteNodeEnd(){
        Node current = head;
        while(current.next.next!=null){
               current = current.next;
        }
        current.next = null;
        tail = current;
    }

    //Adding node at a specific index
    public void addNodeAtIndex(int val, int index){
        int count = 1;
        Node current = head;
        while(current!=null && count!= index-1){
                  current = current.next;
                  count++;
        }
        Node newNode = new Node(val);
            Node temp = current.next;
            current.next=newNode;
            newNode.next=temp;
    }

    public void printLinkedlist(Node headNode) {
        Node current = headNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedListExercise l = new LinkedListExercise();
        l.addNodeAtEnd(10);
        l.addNodeAtEnd(20);
        l.addNodeAtEnd(40);
        l.addNodeAtEnd(60);
        l.addNodeAtEnd(80);
       // l.printLinkedlist(head);
        l.addNodeAtIndex(90, 3);
        l.deleteFirstNode();
        l.deleteNodeEnd();
        l.printLinkedlist(head);
    }
}
