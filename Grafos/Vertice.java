/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;

/**
 *
 * @author Sergio
 * 
 * Clase Vertice 
 * 
 * Es un nodo en el grafo con nombre string 
 * 
 * Pone numero en el vertice -1
 */
public class Vertice {
      /**
     * Nombre del vértice.
     */
    String nombre;
    
    /**
     * Número asignado al vértice (opcional).
     */
    int numVertice;
    
     /**
     * Crea un nuevo vértice con el nombre dado.
     *
     * @param nombre El nombre del vértice.
     */
    public Vertice(String x ){
        nombre = x;
        numVertice = -1;
        
    }
     /**
     * Devuelve el nombre del vértice.
     *
     * @return El nombre del vértice.
     */
    public String nomVertice(){
        return nombre;
    }
      /**
     * Compara dos vértices para ver si son iguales.
     *
     * @param n El otro vértice con el que comparar.
     * @return True si los nombres de los vértices son iguales, False en caso contrario.
     */
    public boolean equals(Vertice n){
       return nombre.equals(n.nombre);
    }
    
    /**
     * Asigna un número al vértice.
     *
     * @param n El número que se desea asignar.
     */
    public void asigVert(int n){
      numVertice = n;  
    }
     /**
     * Devuelve una cadena que representa el vértice con su nombre y número asignado (si lo tiene).
     *
     * @return La cadena con la información del vértice.
     */
       public String toString() // características del vértice
    {
     return nombre + " (" + numVertice + ")";
    }
} 
    
    



        
        

