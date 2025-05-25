package guia6.ejercicio10;

import java.util.Comparator;

public interface MultiSortedCollection<T> {

    /**
     * Agrega un comparador a la colección.
     */
    void add(Comparator<T> comp);

    /**
     * Agrega un elemento a la colección.
     * Arroja IllegalStateException si no se agrego al menos un comparador.
     */
    void add(T elem);

    /**
     * Elimina un elemento de la colección. Si el mismo no existe, no hace nada.
     */
    void remove(T elem);

    /**
     * Devuelve un objeto iterable en base al comparador pedido.
     * Arroja IllegalArgumentException si el comparador no pertenece a la colección.
     */
    Iterable<T> iterable(Comparator<T> comp);

}
