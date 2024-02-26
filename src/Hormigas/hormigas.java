/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hormigas;
import Grafo.grafo;
import Grafo.Vertice;

/**
 *
 * @author yangel
 */
public class hormigas {
    hormiga[] hormigas;
    private int cantidad;
    
    
    
    public void nuevo_Hormiguero(int numero_Hormigas, grafo ciudades){
        this.setCantidad(numero_Hormigas);
        this.hormigas = new hormiga[numero_Hormigas];
        for(int i = 0; i < numero_Hormigas; i++){
            this.hormigas[i] = new hormiga();
            String j = String.valueOf(i+1);
            this.hormigas[i].setNombre(j);
            Vertice[] ciudades_no_visitadas = ciudades.getCiudades();
            this.hormigas[i].actualizar_ciudades_no_visitados(ciudades_no_visitadas);
        }
    }

    
    
    public String Imprimir(){
        String datos = "Las hormigas que hay son: \n";
        for(int i = 0; i < this.hormigas.length; i++){
            datos += this.hormigas[i].Imprimir();
        }
        return datos;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
 