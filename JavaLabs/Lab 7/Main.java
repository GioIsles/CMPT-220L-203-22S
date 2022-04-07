public class Main{
    public static void main(String[] args) {
        listitem node = new listitem(3, null);
        listitem nodeTwo = new listitem(5,node);
        listitem nodeThree = new listitem(8,nodeTwo);
        listitem nodeFour = new listitem(2,nodeThree);
        listitem nodeFive = new listitem(6,nodeFour);

        node.listitem = nodeTwo;
        nodeTwo.listitem = nodeThree;
        nodeThree.listitem = nodeFour;
        nodeFour.listitem = nodeFive;
    }
}