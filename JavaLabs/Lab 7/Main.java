public class Main{
    public static void main(String[] args) {
        listitem node = new listitem(3, null);
        listitem nodeTwo = new listitem(5,node);
        listitem nodeThree = new listitem(8,nodeTwo);
        listitem nodeFour = new listitem(2,nodeThree);

        System.out.println(node);
        System.out.println(nodeTwo);
        System.out.println(nodeThree);
        System.out.println(nodeFour);

    }
}