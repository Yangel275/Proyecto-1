/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import Grafo.Arista;
import Interfaz.Error;

/**
 *
 * @author Carl
 */
public class Lista {
    
    private Arista primero;
    private int size;
    
    public Lista(){
        
        this.primero = null;
        this.size = 0;
    
    }
    
    public void InsertarUltimo(String nombre, double distancia){
        Arista nuevonodo = new Arista(nombre,distancia);
        if(this.getPrimero() == null){
            this.setPrimero(nuevonodo);
            this.setSize(this.getSize() + 1); 
        }else{
            boolean similitud = false;
            Arista aux = this.getPrimero();
            for(int i = 0;  i < this.getSize(); i++){
                if(aux == null){
                    break;
                }
                if(nuevonodo.getDestino().equals(aux.getDestino())){
                    similitud = true;
                        break;
                }
                aux = aux.getNext();
            }    
            if( similitud == true){
                String error = "\n\n                 Ya existe una ciudad adyacente";
                Error nuevo = new Error();
                nuevo.RecibirAd(error);
            }else{
                aux = this.getPrimero();
                for(int i = 0; i < this.getSize()-1; i++){
                    aux = aux.getNext();
                }
                aux.EnlazarArista(nuevonodo);
                this.setSize(1+ this.getSize());  
            }            
        }
    }
    
    public void Eliminar(String nombre){
        
        if(getPrimero()==null){
            String error = "\n\n                 No hay elementos para eliminar";
            Error nuevo = new Error();
            nuevo.RecibirAd(error);
        }else{
            Arista aux = this.getPrimero();
            for (int i = 0; i < this.getSize(); i++) {
                if(aux.getDestino().equals(nombre)){
                    aux = aux;
                    break;
                }
                aux = aux.getNext();
            }
            if(aux.equals(this.getPrimero())){
                if(aux.getNext() == null){
                    aux = null;
                    this.setPrimero(aux);
                    this.setSize(this.getSize() - 1); 
                }else{
                    aux = aux.getNext();
                    this.setPrimero(aux);
                    this.setSize(this.getSize() - 1);
                }
            }else{
                Arista nuevo = this.getPrimero();
                for (int i = 0; i < this.getSize(); i++) {
                    if(nuevo.getNext().equals(aux)){
                        break;
                    }
                    nuevo = nuevo.getNext();
                }nuevo.EnlazarArista(aux.getNext());
            }
        }
    }
    
    public String Imprimir(){
       Arista aux = this.getPrimero();
       String datosprint = "Ciudades adyacentes:\n"+ "\n";
       if(aux == null){
           datosprint = "No hay ciudades adyacentes\n";
           return datosprint;
       }else{
            for (int i = 0; i < this.getSize(); i++) {
            datosprint += "     - Ciudad:" + aux.getDestino() +"   - Distancia: " + String.valueOf(aux.getDistancia())+  "\n";
            if(aux.getNext() == null){
                break;
            }
            aux = aux.getNext();
        }
        return datosprint;
       }
       
        
    }

    /**
     * @return the primero
     */
    public Arista getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Arista primero) {
        this.primero = primero;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
        
