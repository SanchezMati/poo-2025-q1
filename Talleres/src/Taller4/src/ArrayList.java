package taller4.src;

import java.util.Arrays;

public class ArrayList <T> implements List <T>
{
    private final static int INITIAL_DIM = 5;
    private int dim;
    private T[] array;

    @SuppressWarnings("unchecked")

    public ArrayList()
    {
        array = (T[]) new Object[INITIAL_DIM];
        dim = 0;
    }

    @Override
    public void add(T element)
    {
        if(dim == array.length)
        {
            resize();
        }
        array[dim++] = element;
    }

    private void resize()
    {
        Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public boolean remove(int index)
    {
        if(index < 0 || index > dim)
        {
            return false;
        }
        System.arraycopy(array, index+1, array, index, (--dim)-index);
        return true;
    }

    @Override
    public int contains(T element)
    {
        for(int i = 0; i < dim; i++)
        {
            if (array[i].equals(element))
            {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean isEmpty()
    {
        return dim == 0;
    }
}
