package listi;

public class SinglyLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
    private Node head;
    private int count;

    public SinglyLinkedList() {
        head = null;
        count = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        count++;
    }

    public int remove(int index) {
        if (isEmpty()) {
            throw new EmptyCollectionException("List is empty");
        }

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int removedValue;
        if (index == 0) {
            removedValue = head.data;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedValue = current.next.data;
            current.next = current.next.next;
        }
        count--;
        return removedValue;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
}

public boolean isEmpty() {
    return count == 0;
}

public int size() {
    return count;
}

public void printList() {
    System.out.print("[");
    Node current = head;
    while (current != null) {
        System.out.print(current.data);
        if (current.next != null) {
            System.out.print(", ");
        }
        current = current.next;
    }
    System.out.println("]");
}
}
