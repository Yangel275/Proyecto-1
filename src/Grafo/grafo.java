/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import Interfaz.Error;
/**
 *
 * @author Carl
 */
public class grafo {

    Vertice[] ciudades;
    int cant_ciudades;
    String primero;
    String ultimo;

    public grafo() {
        this.cant_ciudades = 0;
        this.primero = null;
        this.ultimo = null;
        this.ciudades = new Vertice[0];
    }

    public void Crear_Arista(String ciudad,String destino, double distancia) {
        boolean similitud = false;
        int ciudad_num = 0;
        for(int i = 0; i <this.getCiudades().length; i++){
            if(this.getCiudades()[i].getNombre().equals(ciudad)){
                    similitud = true;
                    ciudad_num = i;
                    break;
            }
        }
        if(similitud == true){
            Vertice la_ciudad = this.getCiudades()[ciudad_num];
            la_ciudad.insertarArista(destino, distancia);
        }else{
            String error = "\n\n              Aún no se ha creado la ciudad";
                Error nuevo = new Error();
                nuevo.RecibirAd(error);
            
        }
    }
    
     public void Eliminar_Arista(String ciudad, String destino){
            int indice = 0;
            for(int i = 0; i < this.getCant_ciudades(); i++ ){
                if(this.getCiudades()[i].getNombre() == ciudad){
                    indice = i;
                    break;
                }
            }
            Vertice arista_eliminar = this.ciudades[indice];
            System.out.println(arista_eliminar.Imprimmir());
            arista_eliminar.eliminarArista(destino);
     }

    /**
     *
     * @param ciudad */
    public void CrearVetice(String ciudad) {
        if(this.getCant_ciudades() == 0){
            this.setCiudades(new Vertice[1]);
            this.getCiudades()[0] = new Vertice(ciudad);
            this.setCant_ciudades(this.getCant_ciudades() + 1);
        }else{
            int similitud = 0;
            for(int i = 0; i <this.getCiudades().length; i++ ){
                if(this.getCiudades()[i].getNombre().equals(ciudad)){
                    similitud = 1;
                    break;
                }
            }
            if(similitud == 1){
                String error = "\n\n                 Ya existe la ciudad ";
                Error nuevo = new Error();
                nuevo.RecibirAd(error);
            }else{
                Vertice[] viejo = this.getCiudades();
                this.setCant_ciudades(this.getCant_ciudades() + 1);
                this.setCiudades(new Vertice[this.getCant_ciudades()]);
                for(int i=0; i<viejo.length; i++)
                    this.getCiudades()[i] = viejo[i];
                this.getCiudades()[this.getCant_ciudades()-1] = new Vertice(ciudad);
                
                
            }
            
           
        }
        
    }

    public void EliminarVertice(String ciudad){
        Vertice[] viejo = this.getCiudades();
        int nuevo_indice = this.getCant_ciudades() - 1;
        this.setCant_ciudades(nuevo_indice);
        Vertice[] nuevo = new Vertice[nuevo_indice];
        int indice = 0;
        for(int i = 0; i <viejo.length; i++ ){
            if(!viejo[i].getNombre().equals(ciudad)){
                nuevo[indice] = viejo[i];

                indice +=1;
            }
        }
        this.setCiudades(nuevo);
        Lista adyacentes = new Lista();
        for(int i = 0; i <this.getCant_ciudades(); i++ ){
            adyacentes = this.getCiudades()[i].getAdyacentes();
            Arista aux = adyacentes.getPrimero();
            boolean similitud = false;
            int probar = adyacentes.getSize(); 
            for(int j = 0; j < probar; j++){
                if(aux.getDestino().equals(ciudad)){
                    similitud = true;
                    break;
                }
                if(aux.getNext() == null){
                    break;
                }
                aux = aux.getNext();
                    
            }
            if(similitud == true){
                this.getCiudades()[i].eliminarArista(ciudad);
            }
        }
        
        
    }
    public String Imprimir() {
        String datos = "El Grafo está compuesto por las siguientes ciudades: \n \n"; 
        datos += "  - El nido está en: "+this.getPrimero()+"\n";
        datos += "  - La comida está en: "+this.getUltimo()+"\n";
        datos += "  - Conformado por un total de "+ String.valueOf(this.getCant_ciudades())+"  .Estas son: \n\n";
        for(int i = 0; i < this.getCant_ciudades(); i++) {
            datos += ciudades[i].Imprimmir();
        }
        return datos;
    }

    /**
     * @return the primero
     */
    public String getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(String primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public String getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the ciudades
     */
    public Vertice[] getCiudades() {
        return ciudades;
    }

    /**
     * @param ciudades the ciudades to set
     */
    public void setCiudades(Vertice[] ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * @return the cant_ciudades
     */
    public int getCant_ciudades() {
        return cant_ciudades;
    }

    /**
     * @param cant_ciudades the cant_ciudades to set
     */
    public void setCant_ciudades(int cant_ciudades) {
        this.cant_ciudades = cant_ciudades;
    }
    
}

