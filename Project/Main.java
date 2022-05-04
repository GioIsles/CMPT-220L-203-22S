package Project;

class Node {
    int data;
    Node left;
    Node right;
}

class BST {

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

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

    public int height(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public int minVal(Node node){
        if(node == null){
            System.out.println("N/A");
            return 0;
        }
        while(node.left != null){
            node = node.left;
        }
        return node.data;
    }

    public int maxVal(Node node){
        if(node == null){
            System.out.println("N/A");
            return 0;
        }
        while(node.right != null){
            node = node.right;
        }
        return node.data;
    }
    
    static int x = 0;
    public Node NthLargest(Node node, int n){
        if(node == null){
            return null;
        }

        Node right = NthLargest(node.right, n);

        if(right != null){
            return right;
        }
        x++;

        if(x == n){
            return node;
        }
        return NthLargest(node.left, n);
    }

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder(Node node){
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public void preorder(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public Node delete(Node node, int x) {
        if(node == null) {
          return node;
        }
        
        if(x < node.data) {
          node.left = delete(node.left, x);
        } 
        else if(x > node.data) {
          node.right = delete(node.right, x);
        } 
        else {
          if(node.left == null || node.right == null) {
            Node temp = node.left != null ? node.left : node.right;
    
            if(temp == null) {
              return null;
            } 
            else {
              return temp;
            }
          } 
          else {
            Node successor = get(node);
            node.data = successor.data;
            
            node.right = delete(node.right, successor.data);
            return node;
          }
        }
        return node;
      }
      
      public Node get(Node node) {
        if(node == null) {
          return null;
        }
        
        Node temp = node.right;
        
        while(temp.left != null) {
          temp = temp.left;
        }
        return temp;
      }
}

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

        System.out.println("Post Order:");
        a.postorder(root);
        System.out.println("");
        
        System.out.println("Pre Order");
        a.preorder(root);
        System.out.println("");

        System.out.println("Min Value");
        a.minVal(root);
        System.out.println("");

        System.out.println("Max Value");
        a.maxVal(root);
        System.out.println("");

        System.out.println("Nth Value");
        a.NthLargest(root, 2);
        System.out.println("");

        System.out.println("Delete + Reorganise");
        a.delete(root, 13);
        a.inorder(root);
        System.out.println("");
    }
}