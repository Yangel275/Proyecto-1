/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Carl
 */
public class Arista {
    Arista next;
    double distancia;
    double ferormonas;
    String destino;
    
    public Arista(String nombre, int dist){
            this.distancia = dist;
            this.destino = nombre;
            this.ferormonas=0;
            this.next = null;
    }
}