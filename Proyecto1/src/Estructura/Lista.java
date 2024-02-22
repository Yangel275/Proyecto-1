/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

/**
 *
 * @author Carl
 */
public class Lista {
    
    Arista primero;
    int size;
    
    public Lista(){
        
        this.primero = null;
        this.size = 0;
    
    }
    
    public void InsertarUltimo(String nombre, double distancia){
        Arista nuevonodo = new Arista(nombre,distancia);
        if(primero == null){
            
            primero = nuevonodo;
            size++;
            
        }else{
            Arista aux = primero;
            for (int i = 0; i < size-1; i++) {
              aux = aux.next; 
                
            }
            aux.next = nuevonodo;
            size++;
        }
        
    }
    
    public void Eliminar(String nombre){
    
        if(primero==null){
        //JOptionPane.showMessageDialog(null, "No hay elementos para eliminar");
        }
        Arista aux = primero;
        for (int i = 0; i < size; i++) {
            
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
       Arista aux = primero;
       String datosprint = "";
        for (int i = 0; i < size; i++) {
            datosprint += aux.destino + ", ";
            aux = aux.next;
        
        }
        return datosprint;
    }
    
    public Arista BuscarArista(String destino){
        Arista aux = primero;
        while(aux!=null&&!aux.destino.equals(destino)){
          aux= aux.next;
                
            }
        return aux;
        }
        }
    
        
    

        
