/**
 * Clase que define una lista doblemente enlazada.
 */
public class ListaDoble {
    private Nodo cabeza;  // referencia al primer nodo de la lista

    public ListaDoble() {
        this.cabeza = null;  // al inicio, la lista está vacía
    }

    // ... (otros métodos)

    // Método para buscar un nodo por el valor de su campo dato y devolver una referencia
    public Nodo buscarPorValor(String valor) {
        Nodo temp = this.cabeza;
        while (temp != null && !temp.dato.equals(valor)) {
            temp = temp.siguiente;
        }
        return temp;
    }

    // Método para buscar un nodo por su campo dato e insertar un nuevo nodo después de él
    public void insertarDespuesDe(String valor, String nuevoDato) {
        Nodo nuevoNodo = new Nodo(nuevoDato);

        if (valor == null) {
            // Insertar al principio de la lista
            nuevoNodo.siguiente = this.cabeza;
            if (this.cabeza != null) {
                this.cabeza.anterior = nuevoNodo;
            }
            this.cabeza = nuevoNodo;
        } else {
            // Buscar el nodo con valor y insertar después de él
            Nodo temp = buscarPorValor(valor);
            if (temp != null) {
                nuevoNodo.siguiente = temp.siguiente;
                nuevoNodo.anterior = temp;
                if (temp.siguiente != null) {
                    temp.siguiente.anterior = nuevoNodo;
                }
                temp.siguiente = nuevoNodo;
            }
        }
    }

    // Método para intercambiar nodos
    public boolean intercambiarNodos(String valor1, String valor2) {
        Nodo nodo1 = buscarPorValor(valor1);
        Nodo nodo2 = buscarPorValor(valor2);

        if (nodo1 != null && nodo2 != null) {
            // Intercambiar nodos
            if (nodo1.anterior != null) {
                nodo1.anterior.siguiente = nodo2;
            } else {
                this.cabeza = nodo2;
            }

            if (nodo2.anterior != null) {
                nodo2.anterior.siguiente = nodo1;
            } else {
                this.cabeza = nodo1;
            }

            Nodo tempAnterior1 = nodo1.anterior;
            Nodo tempSiguiente1 = nodo1.siguiente;
            nodo1.anterior = nodo2.anterior;
            nodo1.siguiente = nodo2.siguiente;
            nodo2.anterior = tempAnterior1;
            nodo2.siguiente = tempSiguiente1;

            if (tempAnterior1 != null) {
                tempAnterior1.siguiente = nodo2;
            }

            if (tempSiguiente1 != null) {
                tempSiguiente1.anterior = nodo2;
            }

            return true;
        }
        return false;
    }

    // Método para imprimir la lista doblemente enlazada
    public void imprimir() {
        Nodo temp = this.cabeza;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print("[ " + temp.dato + " ] <-> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}