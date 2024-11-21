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

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        Node<Integer> nodeInt1 = new Node<Integer>(10);
        Node<Integer> nodeInt2 = new Node<Integer>(20);

        System.out.println(nodeInt1.getData());
    }
}

