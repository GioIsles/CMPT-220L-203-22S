package project;

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

    public Node insert(Node node, int val){
        if(node == null){
            return createNewNode(val);
        }

        if(val < node.data){
            node.left = insert(node.left, val);
        }
        else if(val > node.data){
            node.right = insert(node.right, val);
        }

        return node;
    }

    public boolean findNode(Node node, int val){
        if (node == null){
            return false;
        }

        boolean nodeFound = false;

        while(node != null){
            if(val < node.data){
                node = node.left;
            }
            else if(val > node.data){
                node = node.right;
            }
            else{
                nodeFound = true;
                break;
            }
            return nodeFound;
        }
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
}

public class Main {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = a.createNewNode(2);

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);
    
        a.inorder(root);
        a.postorder(root);
        a.preorder(root);
    }
}

