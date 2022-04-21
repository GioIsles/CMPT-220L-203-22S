package base;

public class Node {
    int value;
    Node nextNode;

    public Node(int value){
        this.value = value;
        this.nextNode = null;
    }

Node root;

    public Node addNode(int value){
        root = new Node(value);
        return root;
    }

    public void add(int newValue){
        this.root = addNode(newValue);
    }

    public void delete(int value){
        Node useNode = this.root;
        while(useNode.nextNode == null){
            useNode = nextNode;
        }
    
        Node display(int value){
            return value;
        }
    }
}
