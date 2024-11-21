/** Generic class for a node
 * 
 * @author Shaun Khang
 * 
 * @param <T> any data type that you want the node to hold
 */
public class Node<T> {
    private T data; //the data that will be stored in the node; can be String, int, double, float, etc
    private Node<T> next; // reference to the next node

    // the constructor for making a node; this mean its an public instantiable(creatable) class
    public Node(T data) {
        this.data = data;
        this.next = null; // sets the next node to be null
    }

    // setter and getter for data
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // setter and getter for next node
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);

        node1.setNext(node2);

        System.out.println("Node 1 Data: " + node1.getData());
        System.out.println("Node 2 Data: " + node1.getNext().getData());
    }
}

