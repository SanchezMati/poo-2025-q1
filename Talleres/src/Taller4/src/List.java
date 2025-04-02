package taller4.src;

public interface List <T>
{
    void add(T element);
    boolean remove(int index);
    int contains(T element);
    boolean isEmpty();

    default boolean removeElement(T element)
    {
        return remove(contains(element));
    }
}


