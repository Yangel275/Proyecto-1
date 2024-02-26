/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaz;

import Grafo.La_simulacion;
import Grafo.grafo;
import Hormigas.hormigas;
import Interfaz.Menú;
import Interfaz.Emulador;

/**
 *
 * @author yangel
 */
public class proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        La_simulacion simulacion = new La_simulacion();
        
        
        grafo colonia = new grafo();
        
        colonia.setPrimero("1");
        colonia.setUltimo("7");
        
        // Ciudad 1
        colonia.CrearVetice("1");
        colonia.Crear_Arista("1", "2", 5);
        colonia.Crear_Arista("1", "3", 3.1);
        colonia.Crear_Arista("1", "6", 5.2);
        
        // Ciudad 2
        colonia.CrearVetice("2");
        colonia.Crear_Arista("2", "7", 5.2);
        
        // Ciudad 3
        colonia.CrearVetice("3");
        colonia.Crear_Arista("3", "2", 4.9);
        colonia.Crear_Arista("3", "7", 3);
        colonia.Crear_Arista("3", "5", 6);
        
        //Ciudad 4
        colonia.CrearVetice("4");
        
        //Ciudad 5
        colonia.CrearVetice("5");
        colonia.Crear_Arista("5", "4", 5.5);
        
        
        //Ciudad 6 
        colonia.CrearVetice("6");
        colonia.Crear_Arista("6", "3", 3.2);
        colonia.Crear_Arista("6", "5",4.7);
        
       
        //Ciudad 7
        colonia.CrearVetice("7");
        colonia.Crear_Arista("7", "4", 4.8);
        
        int ciclos = 0; 
        double Importancia_feromona = 1;
        double Visibilidad_ciudad = 2;
        double factor_evaporacion = 0.5;
        
        hormigas hormiguero = new hormigas();
        hormiguero.nuevo_Hormiguero(4, colonia);
        
        simulacion.setColonia(colonia);
        simulacion.setCiclos(ciclos);
        simulacion.setHormiguero(hormiguero);
        simulacion.setImportancia_feromona(Importancia_feromona);
        simulacion.setVisibilidad_ciudad(Visibilidad_ciudad);
        simulacion.setFactor_evaporacion(factor_evaporacion);
         
        Emulador.setSimulacion(simulacion);
        Menú ventana = new Menú();
        ventana.Actualizacion();
        ventana.setVisible(true);
         
    }
    
}
