/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Carl
 */
public class Vertice {
    private String nombre;
    private Lista adyacentes;
        
    public Vertice(String nombre){
    this.nombre = nombre;
    this.adyacentes = new Lista();
    }

    public void insertarArista(String destino, double distancia){
        this.adyacentes.InsertarUltimo(destino, distancia);
    }
    
    public void eliminarArista(String destino){
        this.adyacentes.Eliminar(destino);
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the adyacentes
     */
    public Lista getAdyacentes() {
        return adyacentes;
    }

    /**
     * @param adyacentes the adyacentes to set
     */
    public void setAdyacentes(Lista adyacentes) {
        this.adyacentes = adyacentes;
    }
    
    public String Imprimmir(){
        
        if(this.getAdyacentes().getSize()== 0){
            String datos = "";
            datos += "Ciudad: "+ this.nombre + "\n" + "\n";
            datos += "Ciudad Adyacentes: No hay ciudades Adyacentes\n \n";
            return datos;
        }else{
            int suma = 0;
            String datos = "";
            datos += "Ciudad: "+ this.nombre + "\n" + "\n";
            Lista adyacentes = this.getAdyacentes();
            datos += adyacentes.Imprimir()+"\n";
            return datos;
        }
    }
}            

    
    


