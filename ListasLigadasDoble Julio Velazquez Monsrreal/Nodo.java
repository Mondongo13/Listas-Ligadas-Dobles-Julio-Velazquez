/**
 * Proyecto: Listas Ligadas Dobles
 * Autor: Julio Mauricio Velázquez Monsrreal
 * Fecha: 27 de noviembre del 2023
 */

/**
 * Clase que define un nodo en una lista doblemente enlazada.
 */
public class Nodo {
    String dato;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}