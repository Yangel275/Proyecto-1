/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

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
        if(getPrimero() == null){
            
            setPrimero(nuevonodo);
            setSize(getSize() + 1);
            
        }else{
            Arista aux = getPrimero();
            for (int i = 0; i < getSize(); i++) {
              aux = aux.next; 
                
            }
            aux.next = nuevonodo;
            setSize(getSize() + 1);
        }
        
    }
    
    public void Eliminar(String nombre){
    
        if(getPrimero()==null){
        //JOptionPane.showMessageDialog(null, "No hay elementos para eliminar");
        }
        Arista aux = getPrimero();
        for (int i = 0; i < getSize(); i++) {
            
            if(aux.next.destino.equals(nombre)){
                break;
            }
            aux = aux.next;
        }
        
        if(aux.next != null){
            aux.next = aux.next.next;
        }
      
    
    }
    
    public String Imprimir(){
       Arista aux = getPrimero();
       String datosprint = "";
        for (int i = 0; i < getSize(); i++) {
            datosprint += aux.destino + ", ";
            aux = aux.next;
        
        }
        return datosprint;
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
        
