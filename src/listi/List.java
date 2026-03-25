package listi;

public interface List {
    void add(int value);
    int remove(int index);
    int get(int index);
    boolean isEmpty();
    int size();
    void printList();
}