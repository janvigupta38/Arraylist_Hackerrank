public class Linked_list {
    private Node head = null;
    private Node tail = null;
    int size = 0;

    public void addElement(Employee element) {
        Node node = new Node();
        node.setData(element);
        if (head != null) {
            tail.setNext(node);
            tail = node;
            size++;
        } else {
            head = node;
            tail = node;
            size++;
        }
    }

    public void traverse() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getData() + "-->");
                temp = temp.getNext();
            }
        }
    }
}
