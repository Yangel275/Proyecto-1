/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iniciador;
import Grafo.Arista;
import Grafo.GuardarEscribirTXT;
import Grafo.Lista;
import Grafo.Proyecto1;
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
        double distancia; 
        /* Ciudad 1
        *   Aristas
        *       - (Ciudad de inicio: 1, Ciudad de llegada: 2, Distancia: 5)
        *       - (Ciudad de inicio: 1, Ciudad de llegada: 3, Distancia:  3.1)
        *       - (Ciudad de inicio: 1, Ciudad de llegada: 6, Distancia:  5.2)
        */
        Lista Ciudad1 = new Lista();
        Ciudad1.InsertarUltimo("2", 5);
        Ciudad1.InsertarUltimo("3", 3.1);
        Arista Arista1 = new Arista("2", 5);
        Arista Arista2 = new Arista("3",3.1);
        Arista Arista3 = new Arista("6",5.2);
        /*
        * Ciudad 2
        *       - (Ciudad de inicio: 2, Ciudad de llegada: 7, Distancia: 5.2)
        */
        Arista Arista4 = new Arista("7",5.2);
        
        /*
        * Ciudad 3
        *       - (Ciudad de inicio: 3, Ciudad de llegada: 2, Distancia: 4,9)
        *       - (Ciudad de inicio: 3, Ciudad de llegada: 7, Distancia: 3)
        *       - (Ciudad de inicio: 3, Ciudad de llegada: 5, Distancia: 6)
        */
        Arista Arista5 = new Arista("2",4.9);
        Arista Arista6 = new Arista("7",3);
        Arista Arista7 = new Arista("5",6);
        
        /*
        * Ciudad 4
        */
        
        /*
        * Ciudad 5
        *       - (Ciudad de inicio: 5, Ciudad de llegada: 4, Distancia: 5,5)
        */
        Arista Arista8 = new Arista("4",5.5);
        /*
        * Ciudad 6 
        *       - (Ciudad de inicio: 6, Ciudad de llegada: 3, Distancia: 3,2)
        *       - (Ciudad de inicio: 6, Ciudad de llegada: 5, Distancia: 4,7)
        */
        Arista Arista9 = new Arista("3",3.2);
        Arista Arista10 = new Arista("5",4.7);
        /*
        * Ciudad 7
        *       - (Ciudad de inicio: 7, Ciudad de llegada: 4, Distancia: 4,8)
        */
        
        Arista Arista11 = new Arista("4",4.8);
        
    }

    
    
}
