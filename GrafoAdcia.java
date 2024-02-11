/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;

/**
 *
 * @author Sergio
 */
public class GrafoAdcia {

    String nombre;
    int numVertice;
    Lista lad;

    public GrafoAdcia(String x) {
        nombre = x;
        numVertice = -1; // Se corrige el error cambiando ':' por '='
        lad = new Lista();
    }
    
}

