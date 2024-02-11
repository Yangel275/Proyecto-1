/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;

/**
 * Representa un arco en un grafo dirigido. Un arco conecta dos vértices y puede tener un peso asociado.
 *
 * @author Sergio
 */
public class Arco {

    /**
     * El índice del vértice destino del arco.
     */
    private final int destino;

    /**
     * El peso del arco, si está presente. Un valor de 0 indica que no hay peso.
     */
    private final double peso;

    /**
     * Crea un arco con un destino específico y un peso predeterminado de 0.
     *
     * @param d El índice del vértice destino del arco.
     */
    public Arco(int d) {
        this(d, 0.0);
    }

    /**
     * Crea un arco con un destino específico y un peso especificado.
     *
     * @param d El índice del vértice destino del arco.
     * @param p El peso del arco.
     */
    public Arco(int d, double p) {
        this.destino = d;
        this.peso = p;
    }

    /**
     * Obtiene el índice del vértice destino del arco.
     *
     * @return El índice del vértice destino.
     */
    public int getDestino() {
        return destino;
    }

    /**
     * Obtiene el peso del arco.
     *
     * @return El peso del arco.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Comprueba si dos arcos son iguales. Dos arcos se consideran iguales si tienen el mismo destino.
     *
     * @param o El otro objeto a comparar.
     * @return True si los arcos son iguales, False en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arco arco = (Arco) o;
        return destino == arco.destino;
    }

    /**
     * Genera un hash code basado en el destino del arco.
     *
     * @return El hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(destino);
    }
}
