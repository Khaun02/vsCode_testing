public class helloWorld {
    public static void main(String[] args) {
    
        System.out.println("Hello world!");

        System.out.println("Shaun is the best");

        System.out.println("this was on the big pc gang");

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(22);
        node1.setNext(node2);

        System.out.println("Node 1 Data: " + node1.getData());
        System.out.println("Node 2 Data: " + node1.getNext().getData());
    }
}
