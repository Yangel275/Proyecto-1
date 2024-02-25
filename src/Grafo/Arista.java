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
    double feromonas;
    String destino;
    
    public Arista(String nombre, double dist){
            this.distancia = dist;
            this.destino = nombre;
            this.feromonas=0;
            this.next = null;
    }
    
    public void EnlazarArista(Arista siguiente){
        next = siguiente;
    }
    
    public  Arista obtenerSiguiente(){
        return next;
    }
    
    public void ActulizarFeromonas(double feromona){
        this.feromonas = feromona;
    }
    
    public double obtenerFeromonas(){
        return feromonas;
    }
}
