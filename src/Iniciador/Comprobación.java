/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iniciador;
import Grafo.Arista;
import Grafo.GuardarEscribirTXT;
import Grafo.Lista;
import Grafo.VentanaGrafo;
import Grafo.Vertice;
import Grafo.grafo;

/**
 *
 * @author yangel
 */
public class Comprobación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Grafo, colonia de hormigas
        grafo colonia = new grafo();
        
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
        
        
        colonia.EliminarVertice("5");
        
        colonia.Eliminar_Arista("6", "3");
        System.out.println(colonia.Imprimir());
        
        
        
        
        
        
        
       
        
       
       
    }

    
    
}
