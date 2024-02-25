/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hormigas;

import Grafo.Arista;
import Grafo.Lista;
import Grafo.Vertice;

/**
 *
 * @author yangel
 */
public class hormiga {
    String nombre;
    Vertice[] Ciudades_no_visitados;
    Vertice[] Ciudades_visitadas;
    double distancia;
    
    public void actualizar_ciudades_no_visitados(Vertice[] ciudades){
        this.setCiudades_no_visitados(ciudades);
        this.setDistancia(0);
    }
    
    public void actualizar_ciudades_visitadas(String nombre_ciudad){
        
        if(this.getCiudades_no_visitados().length == 0){
            // Revisar la ciudad que se visitó
            int nuevo_indice_no_visitados = this.getCiudades_visitadas().length;
            int indice = 0;
            for(int i = 0; i < this.getCiudades_no_visitados().length; i++){
                if(this.getCiudades_no_visitados()[i].getNombre()== nombre_ciudad){
                    nuevo_indice_no_visitados = i;
                    break;
                }
            }
            
            // Actualizacion de la lista de ciudades visitados
            Vertice[] nuevo = new Vertice[1];
            nuevo[0] = this.getCiudades_no_visitados()[nuevo_indice_no_visitados];
            this.setCiudades_visitadas(nuevo);
            
            // Actualizacion de la lista de ciudades no visitadas
            Vertice[] viejo = this.getCiudades_no_visitados();
            int nuevo_indice_visitados = this.getCiudades_no_visitados().length;
            nuevo_indice_visitados -= 1; 
            Vertice[] nuevo1 = new Vertice[nuevo_indice_visitados];
            indice = 0;
            for(int i = 0; i <viejo.length; i++ ){
                if(!viejo[i].getNombre().equals(nombre_ciudad)){
                    nuevo1[indice] = viejo[i];
                    indice +=1;
                }
            }
            this.setCiudades_no_visitados(nuevo1);
            
            
        }else{
            // Revisar la ciudad que se visitó
            int nuevo_indice_visitados = this.getCiudades_visitadas().length;
            for(int i = 0; i < this.getCiudades_no_visitados().length; i++){
                if(this.getCiudades_no_visitados()[i].getNombre() == null ? nombre_ciudad == null : this.getCiudades_no_visitados()[i].getNombre().equals(nombre_ciudad)){
                    nuevo_indice_visitados = i;
                    break;
                }
            }
            
            // Actualizacion de la lista de ciudades visitados
            int indice = this.getCiudades_visitadas().length;
            indice =1;
            
            Vertice[] viejo_visitados = this.getCiudades_visitadas();
            Vertice[] nuevo_visitados = new Vertice[indice];
            
            System.arraycopy(viejo_visitados, 0, nuevo_visitados, 0, this.getCiudades_visitadas().length);
            this.getCiudades_visitadas()[indice] = viejo_visitados[nuevo_indice_visitados];
            
            // Actualizacion de la lista de ciudades no visitadas
            Vertice[] viejo = this.getCiudades_no_visitados();
            nuevo_indice_visitados = this.getCiudades_no_visitados().length;
            nuevo_indice_visitados -= 1; 
            Vertice[] nuevo1 = new Vertice[nuevo_indice_visitados];
            indice = 0;
            for(int i = 0; i <viejo.length; i++ ){
                if(!viejo[i].getNombre().equals(nombre_ciudad)){
                    nuevo1[indice] = viejo[i];
                    indice +=1;
                }
            }
            this.setCiudades_no_visitados(nuevo1);
            
            setDistancia(0);
            for(int i  = 0; i < this.getCiudades_visitadas().length-1; i++){
                int j = i +1;
                Vertice nido = this.getCiudades_visitadas()[j];
                Vertice llegada = this.getCiudades_visitadas()[i];
                Arista aux = nido.getAdyacentes().getPrimero();
                for(int k = 0; k < nido.getAdyacentes().getSize();k++){
                    if(aux.getDestino().equals(llegada.getNombre())){
                        setDistancia(getDistancia() + aux.getDistancia());
                        if(aux.getNext() == null){
                            break;
                        }
                        
                    }
                }
                
            }
            
        }
        
    }
    
    public String Imprimir(){
        String datos = "Hormiga #"+this.getNombre()+"\n";
        datos += "Ciudades no visitadas: \n\n";
        for(int i = 0; i <this.getCiudades_no_visitados().length ; i++)
            datos += this.getCiudades_no_visitados()[i].Imprimmir()+"\n";
        datos += "Ciudades visitadas: ";
        Vertice[] nuevo =  this.getCiudades_visitadas();
        if(nuevo.equals(null)){
            datos += "No se ha visitado ciudades\n";
            datos += "Distancia: "+ String.valueOf(this.getDistancia()) + "\n";
            return datos;
        }else{
            datos +="\n\n";
            for(int i = 0; i <this.getCiudades_visitadas().length ; i++)
            datos += this.Ciudades_visitadas[i].Imprimmir()+"\n";
            datos += "Distancia: "+ String.valueOf(this.getDistancia()) + "\n";
            return datos;
        }
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
     * @return the Ciudades_no_visitados
     */
    public Vertice[] getCiudades_no_visitados() {
        return Ciudades_no_visitados;
    }

    /**
     * @param Ciudades_no_visitados the Ciudades_no_visitados to set
     */
    public void setCiudades_no_visitados(Vertice[] Ciudades_no_visitados) {
        this.Ciudades_no_visitados = Ciudades_no_visitados;
    }

    /**
     * @return the Ciudades_visitadas
     */
    public Vertice[] getCiudades_visitadas() {
        return Ciudades_visitadas;
    }

    /**
     * @param Ciudades_visitadas the Ciudades_visitadas to set
     */
    public void setCiudades_visitadas(Vertice[] Ciudades_visitadas) {
        this.Ciudades_visitadas = Ciudades_visitadas;
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
}
