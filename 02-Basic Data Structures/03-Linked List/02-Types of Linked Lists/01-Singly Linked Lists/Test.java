public class Test {

    // Class representing a node in the linked list
    class Node {
        String data;
        Node next;

        // Constructor to initialize a new node
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Adds a new node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);

        // Handle empty list case
        if (head == null) {
            head = newNode;
            return;
        }

        // Update new node's next pointer and head pointer
        newNode.next = head;
        head = newNode;
    }

    // Adds a new node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);

        // Handle empty list case
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Update last node's next pointer
        currNode.next = newNode;
    }

    // Removes the first node from the list
    public void deleteFirst() {
        // Handle empty list case
        if (head == null) {
            System.out.println("List is Empty, nothing to delete.");
            return;
        }

        // Update head pointer to the next node
        head = head.next;
    }

    // Removes the last node from the list
    public void deleteLast() {
        // Handle empty list case and single-node case
        if (head == null) {
            System.out.println("List is Empty, nothing to delete.");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the second last node
        Node prevNode = null;
        Node currNode = head;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // Update second last node's next pointer to null
        prevNode.next = null;
    }

    // Prints the data of each node in the list
    public void printNode() {
        // Handle empty list case
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Test ls = new Test();
        ls.addFirst("Jiyon");
        ls.addFirst("is");
        ls.addFirst("name");
        ls.addFirst("My");

        ls.addLast("Jiyon");

        System.out.println("Original List:");
        ls.printNode();

        ls.deleteFirst();
        System.out.println("\nList after deleting first element:");
        ls.printNode();

        ls.deleteLast();
        System.out.println("\nList after deleting last element:");
        ls.printNode();
    }
}
