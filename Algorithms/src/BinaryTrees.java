public class BinaryTrees {
    
    private class Node{
        
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
     
    Node root;

    public void insert(int value){
          root =   insertNode(root, value);
    }
public BinaryTrees.Node insertNode(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value)
            root.left = insertNode(root.left, value);
        else if (value > root.value)
            root.right = insertNode(root.right, value);

            return root;
}
// to find any value in the Tree

public boolean findValue(int value){
   return search(root,value );
}

public boolean search(Node root, int value){

    if (root == null)
         return false;
    if(value == root.value)
        return true;

        if(value< root.value)
        return search(root.left, value);
        else 
        return search(root.right, value);
}

public int getMinElement(){
    return minElement(root);
}
public int minElement(Node root){
    Node current;
    current = root;

    while(current.left != null){
        current = current.left;

    }
    return current.value;
}


public void printValues(){
        inordertraverse(root);
}
public void inordertraverse(Node root) {
    if(root!=null){
          inordertraverse(root.left);
          System.out.println(root.value);
          inordertraverse(root.right);
        
    }

}
    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        tree.insert(4);
        tree.insert(6);
        tree.insert(12);
        tree.insert(3);
        tree.insert(9);
        tree.insert(7);
        tree.insert(14);
        tree.insert(2);
       // tree.printValues();
        System.out.println(tree.getMinElement());
        System.out.println();
       System.out.println(tree.findValue(14));
    }
}
