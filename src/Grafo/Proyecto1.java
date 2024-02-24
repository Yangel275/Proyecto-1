/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Grafo;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

/**
 *
 * @author Carl
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        grafo simu = new grafo(8);
        Graph graph = new SingleGraph("Proyecto1");
        simu.InsertarVetice("i");
        simu.Imprimir();
        
        graph.addNode("A"); 
        graph.addNode("B" );
        graph.addNode("C" );
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        System.setProperty("org.graphstream.ui", "swing"); 
        graph.display();
        
    }
    
}
