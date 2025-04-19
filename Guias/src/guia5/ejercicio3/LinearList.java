package guia5.ejercicio3;

public interface LinearList<T> {
    /**
     * Agrega un elemento al final de la lista.
     */
    void add(T obj);

    /**
     * Obtiene el i-ésimo elemento de la lista.
     */
    Object get(int i);

    /**
     * Modifica el i-ésimo elemento de la lista colocando un nuevo valor.
     */
    void set(int i, T obj);

    /**
     * Elimina el i-ésimo elemento de la lista.
     */
    void remove(int i);

    /**
     * Busca el índice de la primer ocurrencia de un objeto en la lista.
     */
    int indexOf(T obj);

    /**
     * Retorna el tamaño de la lista.
     */
    int size();
}
