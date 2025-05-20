package taller4.list;

public interface newList<T>
{
    void add(T element);
    boolean remove(int index);
    int contains(T element);
    boolean isEmpty();

    default boolean removeElement(T element)
    {
        return remove(contains(element));
    }

    int size();
}


