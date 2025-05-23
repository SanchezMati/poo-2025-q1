package guia5.ejercicio3;

public class LinearListImpl<T> implements LinearList<T> {

    private Node<T> first;
    private int size;

    private static class Node<T> {
        private T head;
        private Node<T> next;

        Node(T head, Node<T> next) {
            this.head = head;
            this.next = next;
        }
    }

    @Override
    public void add(T obj) {
        Node<T> current = first;
        if(first == null) {
            first = new Node<>(obj, null);
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(obj, null);
        }
        size++;
    }

    @Override
    public T get(int i) {
        Node<T> current = findNode(i);
        return current.head;
    }

    private Node<T> findNode(int i) {
        Node<T> current = first;
        int index = 0;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (current != null && index < i) {
            index++;
            current = current.next;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        return current;
    }

    @Override
    public void set(int i, T obj) {

    }

    @Override
    public void remove(int i) {
        if (i < 0 || first == null) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            first = first.next;
        } else {
            Node<T> previous = findNode(i-1);
            if (previous.next == null) {
                throw new IndexOutOfBoundsException();
            }
            previous.next = previous.next.next;
        }
        size--;
    }

    @Override
    public int indexOf(T obj) {
        int index = 0;
        Node<T> current = first;
        while (current != null && !current.head.equals(obj)) {
            current = current.next;
            index++;
        }
        return current == null ? -1 : index;
    }

    @Override
    public int size() {
        return size;
    }


}
