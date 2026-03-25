package listtests;

import listi.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();

        System.out.println("Item at index 1: " + list.get(1));
        System.out.println("Removed:" + list.remove(1));

        list.printList();
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
    }
}
