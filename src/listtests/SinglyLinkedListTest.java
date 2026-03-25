package listtests;

import listi.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printList();

        System.out.println("Item at index 2: " + list.get(2));
        System.out.println("Removed: " + list.remove(1));

        list.printList();
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
    }
}