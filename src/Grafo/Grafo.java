/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Sergio
 */
/**
 * Esta clase representa un grafo dirigido y ponderado usando listas de adyacencia.
 */
public class Grafo {

    // El arreglo de nodos que contiene las listas de adyacencia de cada vértice
    private Nodo grafo[];
    // El número de vértices del grafo
    private int numvertices;

    /**
     * Crea un nuevo grafo con el número de vértices dado.
     * @param nroVertices el número de vértices del grafo
     */
    public Grafo(int nroVertices) {
        this.numvertices = nroVertices;
        grafo = new Nodo[this.numvertices];

        for (int i = 0; i < this.numvertices; i++) {
            grafo[i] = null;
        }
    }

    /**
     * Verifica si existe una arista entre dos vértices dados.
     * @param v1 el vértice de origen
     * @param v2 el vértice de destino
     * @return true si existe una arista entre v1 y v2, false en caso contrario
     */
    public boolean existeArista(int v1, int v2) {
        if (grafo[v1] == null) {
            return false;
        }
        Nodo actual = grafo[v1];
        while (actual != null) {
            if (actual.vertice == v2) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Inserta una arista entre dos vértices dados con un peso dado.
     * @param v1 el vértice de origen
     * @param v2 el vértice de destino
     * @param peso el peso de la arista
     */
    public void insertaArista(int v1, int v2, int peso) {

        if (!existeArista(v1, v2)) {
            Nodo nuevo = new Nodo(v2, peso);

            if (grafo[v1] == null) {
                grafo[v1] = nuevo;
            } else {
                Nodo actual = grafo[v1];
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }

                actual.siguiente = nuevo;
            }
        } else {
            System.out.println("Ya existe una arista entre:" + v1 + " y " + v2);
        }
    }

    /**
     * Elimina una arista entre dos vértices dados si existe.
     * @param v1 el vértice de origen
     * @param v2 el vértice de destino
     */
    public void EliminarAristas(int v1, int v2) {
        if (existeArista(v1, v2)) {
            Nodo actual = grafo[v1];

            if (actual.vertice == v2) {
                grafo[v1] = actual.siguiente;
            } else {
                Nodo anterior = actual;
                actual = actual.siguiente;

                while (actual != null) {
                    if (actual.vertice == v2) {
                        anterior.siguiente = actual.siguiente;
                        return;
                    }
                    anterior = actual;
                    actual = actual.siguiente;
                }
            }
        } else {
            System.out.println("No existe una arista entre: " + v1 + " y " + v2);
        }
    }

    /**
     * Borra el grafo eliminando todas las aristas.
     */
    public void BorrarGrafo() {
        for (int i = 0; i < grafo.length; i++) {
            grafo[i] = null;
        }
    }

    /**
     * Muestra el grafo por consola imprimiendo las listas de adyacencia de cada vértice.
     */
    public void ShowGrafo() {
        for (int i = 0; i < grafo.length; i++) {
            Nodo actual = grafo[i];

            while (actual != null) {
                System.out.printf("%d -> ", i);
                System.out.printf("%d(%d)\n", actual.vertice, actual.peso);

                actual = actual.siguiente;
            }
            System.out.println();
        }
    }

// ----- Operadores para obtener lista de adyacentes -----//
    /**
     * Verifica si la lista de adyacentes de un vértice dado está vacía.
     * @param v el vértice a consultar
     * @return true si la lista de adyacentes de v está vacía, false en caso contrario
     */
    public boolean ListaVacia(int v) {
        if (grafo[v] == null) {
            return true;
        }
        return false;
    }

    /**
     * Obtiene el primer nodo de la lista de adyacentes de un vértice dado.
     * @param v el vértice a consultar
     * @return el primer nodo de la lista de adyacentes de v, o null si la lista está vacía
     */
    public Nodo PrimerAdy(int v) {
        return grafo[v];
    }

    /**
     * Obtiene el siguiente nodo de la lista de adyacentes de un vértice dado, a partir de un nodo anterior.
     * @param anterior el nodo anterior en la lista de adyacentes
     * @return el siguiente nodo de la lista de adyacentes, o null si no hay más nodos
     */
    public Nodo ProximoAdy(Nodo anterior) {
        if (anterior.siguiente == null) {
            return null;
        } else {
            return anterior.siguiente;
        }
    }
// ----- Fin Operadores para obtener lista de adyacentes -----//
}
