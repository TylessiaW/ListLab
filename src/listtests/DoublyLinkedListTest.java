package listtests;

import listi.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(100);
        list.add(200);
        list.add(300);

        list.printList();

        System.out.println("Item at index 1: " + list.get(1));
        System.out.println("Removed:" + list.remove(1));

        list.printList();
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
    }
}
