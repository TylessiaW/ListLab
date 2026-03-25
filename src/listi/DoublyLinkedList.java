package listi;

public class DoublyLinkedList implements List {
    private class Node {
        int data;
        Node next;
        Node previous;

        Node(int value) {
            data = value;
            next = null;
            previous = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        count++;
    }

    public int remove(int index) {
        if (isEmpty()) {
            throw new EmptyCollectionException("Doubly linked list is empty.");
        }

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        int removedValue = current.data;

        if (current == head && current == tail) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.next;
            head.previous = null;
        } else if (current == tail) {
            tail = tail.previous;
            tail.next = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

        count--;
        return removedValue;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index.");
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
        Node current = head;
        System.out.print("[");

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