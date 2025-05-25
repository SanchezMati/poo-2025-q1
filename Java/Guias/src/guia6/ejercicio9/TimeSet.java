package guia6.ejercicio9;
import java.util.Set;

/**
 * Conjunto no ordenado de elementos, en donde a cada elemento se le asigna
 * un horario al momento de la inserción, en formato horas y minutos.
 *
 * @param <T> Tipo de los objetos almacenados.
 */
public interface TimeSet<T> {
    /**
     * Agrega un elemento al conjunto, junto con un horario especificado.
     * Si el elemento a agregar ya existía, se modifica el horario que tenía
     * anteriormente.
     *
     * @throws IllegalArgumentException Si el horario no es valido.
     */
    void add(T elem, int hours, int minutes);

    /**
     * Elimina un objeto del conjunto.
     *
     * @param elem Elemento a ser eliminado.
     */
    void remove(T elem);

    /**
     * Obtiene la cantidad de elementos del conjunto.
     */
    int size();

    /**
     * Determina si un objeto pertenece o no al conjunto.
     */
    boolean contains(T elem);

    /**
     * Obtiene todos los objetos que pertenezcan al rango
     * horario especificado.
     *
     * @throws IllegalArgumentException Si el limite superior es menor al
     * inferior, o los horarios no son validos.
     */
    Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo);

}
