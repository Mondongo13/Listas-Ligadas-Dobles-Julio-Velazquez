/**
 * Clase principal para el uso de listas doblemente enlazadas.
 */
public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        // Insertar nodos en la lista
        lista.insertarDespuesDe(null, "A");  // Insertar al principio
        lista.insertarDespuesDe("A", "B");
        lista.insertarDespuesDe("B", "C");
        lista.insertarDespuesDe("C", "D");

        // Imprimir la lista
        System.out.println("Lista original:");
        lista.imprimir();

        // Buscar un nodo por valor
        Nodo nodoEncontrado = lista.buscarPorValor("B");
        if (nodoEncontrado != null) {
            System.out.println("Nodo encontrado: " + nodoEncontrado.dato);
        } else {
            System.out.println("Nodo no encontrado");
        }

        // Insertar un nuevo nodo después de un nodo buscado
        lista.insertarDespuesDe("B", "E");
        System.out.println("Lista después de la inserción:");
        lista.imprimir();

        // Intercambiar nodos
        lista.intercambiarNodos("B", "D");
        System.out.println("Lista después del intercambio:");
        lista.imprimir();
    }
}




