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
 * Esta clase representa un nodo de una lista enlazada que almacena un vértice y un peso.
 */
class Nodo{
    // El vértice asociado al nodo
    int vertice;
    // El peso asociado al nodo
    int peso;
    // El nodo siguiente en la lista
    Nodo siguiente;
		
    /**
     * Crea un nuevo nodo con el vértice y el peso dados.
     * @param v el vértice del nodo
     * @param a el peso del nodo
     */
    public Nodo(int v, int a){
	this.vertice = v;
	this.peso = a;
	this.siguiente = null;
	}
}
