package Taller4.src;

import java.util.Arrays;

public class ArrayIntegerList implements List <Integer>
{
    private final static int INITIAL_DIM = 5;
    private int dim;
    private Integer[] array;

    public ArrayIntegerList()
    {
        array = new Integer[INITIAL_DIM];
        dim = 0;
    }

    @Override
    public void add(Integer element)
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
        if(index < 0 || index >= dim)
        {
            return false;
        }
        System.arraycopy(array, index, array, index+1, (--dim)-index);
        return true;
    }

    @Override
    public int contains(Integer element)
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
