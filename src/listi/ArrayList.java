package listi;

public class ArrayList implements List {
    private int[] data;
    private int count;

    public ArrayList() {
        data = new int[10];
        count = 0;
    }

    public void add(int value) {
        if (count == data.length) {
            expandCapacity();
        }

        data[count] = value;
        count++;
    }

    public int remove(int index) {
        if (isEmpty()) {
            throw new EmptyCollectionException("Array list is empty.");
        }

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        int removedValue = data[index];

        for (int i = index; i < count - 1; i++) {
            data[i] = data[i + 1];
        }

        count--;
        return removedValue;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        return data[index];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(data[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private void expandCapacity() {
        int[] larger = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            larger[i] = data[i];
        }

        data = larger;
    }
}