/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Carl
 */
public class VentanaGrafo {
  
    private Graph graph;
    private Viewer usuario;
    Graph j = new SingleGraph("");
    Grafo o = new Grafo(0);
    
    
    public VentanaGrafo() {
        //crea un nuevo grafo
        this.graph = new SingleGraph("Grafo");
        this.usuario = null;
        
        
        
    }
    
    public Viewer getViewer(){
        return usuario;
    }
    
    public void HacerUnaCiudad(){
        o.CrearLista();
        while(o.max != 4){
        String vertice = JOptionPane.showInputDialog(null,"Nombre de la ciudad...");
        j.addNode(vertice);
        o.max++;
        o.cant_ciudades++;
        j.display();
        }
}
    
    
    /*public void AgregarVerice(){
        String vertice = JOptionPane.showInputDialog(null,"Nombre de la ciudad...");
        g.InsertarVetice(vertice);*/
    }


