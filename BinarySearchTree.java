package ElaborateSorting;

public class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right;
        int size = 0;
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    public BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    public void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    public Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) {
            root.left = insertRec(root.left, key); 
            root.size++;
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key); 
            root.size ++;
        }
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    public int[] inorder()  { 
        int[] array = new int[root.size];
        return inorderRec(root, array, 0); 
    } 
  
    // A utility function to do inorder traversal of BST 
    public int[] inorderRec(Node root,int[] array,int index) { 
        if (root != null) { 
            inorderRec(root.left,array,index); 
            array[index]=root.key; 
            inorderRec(root.right,array,index);
            index++;
        }
        return array;
    }
}
