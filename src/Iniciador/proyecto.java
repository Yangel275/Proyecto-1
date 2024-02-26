/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iniciador;

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
        colonia.Crear_Arista("1", 5, "2");
        colonia.Crear_Arista("1", 3.1, "3");
        colonia.Crear_Arista("1", 5.2, "6");
        
        // Ciudad 2
        colonia.CrearVetice("2");
        colonia.Crear_Arista("2", 5.2, "7");
        
        // Ciudad 3
        colonia.CrearVetice("3");
        colonia.Crear_Arista("3", 4.9, "2");
        colonia.Crear_Arista("3", 3, "7");
        colonia.Crear_Arista("3", 6, "5");
        
        //Ciudad 4
        colonia.CrearVetice("4");
        
        //Ciudad 5
        colonia.CrearVetice("5");
        colonia.Crear_Arista("5", 5.5, "4");
        
        
        //Ciudad 6 
        colonia.CrearVetice("6");
        colonia.Crear_Arista("6", 3.2, "3");
        colonia.Crear_Arista("6",4.7, "5");
        
       
        //Ciudad 7
        colonia.CrearVetice("7");
        colonia.Crear_Arista("7", 4.8, "4");
        
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
