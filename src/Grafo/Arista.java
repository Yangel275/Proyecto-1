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
    private Arista next;
    private double distancia;
    private double feromonas;
    private String destino;
    
    public Arista(String nombre, double dist){
        this.distancia = dist;
        this.destino = nombre;
        this.feromonas=0;
        this.next = null;
    }  
    
    public Arista(String nombre){
        this.distancia = distancia;
        this.destino = nombre;
        this.feromonas=feromonas;
        this.next = next;
    }
    
    public void EnlazarArista(Arista siguiente){
        setNext(siguiente);
    }
    
    public  Arista obtenerSiguiente(){
        return getNext();
    }
    
    public void ActulizarFeromonas(double feromona){
        this.setFeromonas(feromona);
    }
    
    public double obtenerFeromonas(){
        return getFeromonas();
    }

    /**
     * @return the next
     */
    public Arista getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Arista next) {
        this.next = next;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the feromonas
     */
    public double getFeromonas() {
        return feromonas;
    }

    /**
     * @param feromonas the feromonas to set
     */
    public void setFeromonas(double feromonas) {
        this.feromonas = feromonas;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
}
