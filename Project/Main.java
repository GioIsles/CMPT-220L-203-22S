package Project;

import java.util.LinkedList;
import java.util.Queue;

//creates a node class
class Node {
    int data;
    Node left;
    Node right;
}

//creates a binary search tree class
class BST {

    //createNewNode function makes a new node
    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    //insert function inserts a int into the tree to make a node
    public Node insert(Node node, int x){
        if(node == null){
            return createNewNode(x);
        }

        if(x < node.data){
            node.left = insert(node.left, x);
        }
        else if(x > node.data){
            node.right = insert(node.right, x);
        }
        return node;
    }

    //findNode function finds a node in the tree to see if the int is in the tree
    public boolean findNode(Node node, int x){
        if (node == null){
            return false;
        }

        boolean nodeFound = false;

        while(node != null){
            if(x < node.data){
                node = node.left;
            }
            else if(x > node.data){
                node = node.right;
            }
            else{
                nodeFound = true;
                break;
            }
        }
        return nodeFound;
    }

    //returns the height of the tree
    public int height(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    //returns the minimum value of the tree
    public int minval(Node node){
        if(node == null){
            System.out.println("N/A");
            return 0;
        }
        while(node.left != null){
            node = node.left;
        }
        return node.data;
    }

    //returns the maximum value of the tree
    public int maxval(Node node){
        if(node == null){
            System.out.println("N/A");
            return 0;
        }
        while(node.right != null){
            node = node.right;
        }
        return node.data;
    }
    
    //returns the nth largest value in the tree
    static int x = 0;
    public Node nthlargest(Node node, int n){
        if(node == null){
            return null;
        }

        Node right = nthlargest(node.right, n);

        if(right != null){
            return right;
        }

        x++;

        if(x == n){
            return node;
        }
        return nthlargest(node.left, n);
    }

    //puts the tree in order
    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    //puts the tree in post order
    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    //puts the tree in pre order
    public void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //does a depth first search
    public boolean depthFirstSearch(Node node, int val){
        boolean found = false;

        if(node == null){
            return found;
        }

        if (node.data == val){
            found = true;
        }

        depthFirstSearch(node.left, val);
        depthFirstSearch(node.right, val);
        return found;
      }

      //does a breadth first search
      public boolean breadthFirstSearch(Node node, int val){
        boolean found = false;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        if(node == null){
            return found;
        }

        if (node.data == val){
            found = true;
        }

        breadthFirstSearch(node.left, val);
        breadthFirstSearch(node.right, val);
        return found;
      }
      
      //deletes a node
      public static Node deleteNode(Node node, int val) {

        if (node == null) {
            return node;
        }

        else if (val < node.data) {
            node.left = deleteNode(node.left, val);
        }
  
        else if (val > node.data) {
            node.right = deleteNode(node.right, val);
        }
  
        else {
            if (node.left == null && node.right == null) {
                node = null;
            }

            else if (node.left == null) {
                Node del = node;
                node = node.right;
                del = null;
            }

            else if (node.right == null) {
                Node del = node;
                node = node.left;
                del = null;
            }

            else {

                Node del = findMin(node.right);
                node.data = del.data;
                node.right = deleteNode(node.right, del.data);
            }
        }
        return node;
    }

    //finds the min value
    public static Node findMin(Node node) {
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}

//the main creates a binary search tree, adds values, and tests all the functions shown above
public class Main {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = a.createNewNode(1);

        root = a.insert(root, 9);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 13);
        root = a.insert(root, 6);
        root = a.insert(root, 7);
        root = a.insert(root, 8);
        root = a.insert(root, 17);
        root = a.insert(root, 16);
        root = a.insert(root, 1);

        System.out.println("In Order:");
        a.inorder(root);
        System.out.println("");
        System.out.println("");

        System.out.println("Post Order:");
        a.postorder(root);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Pre Order");
        a.preorder(root);
        System.out.println("");
        System.out.println("");

        System.out.println("Min Value");
        System.out.println(a.minval(root));
        System.out.println("");

        System.out.println("Max Value");
        System.out.println(a.maxval(root));
        System.out.println("");

        System.out.println("Nth Value");
        System.out.println(a.nthlargest(root, 3).data);
        System.out.println("");

        System.out.println("Depth First Search");
        System.out.println(a.depthFirstSearch(root, 1));
        System.out.println("");

        System.out.println("Breadth First Search");
        System.out.println(a.breadthFirstSearch(root, 1));
        System.out.println("");

        System.out.println("Delete + Reorganise");
        a.deleteNode(root, 13);
        a.inorder(root);
        System.out.println("");
    }
}
