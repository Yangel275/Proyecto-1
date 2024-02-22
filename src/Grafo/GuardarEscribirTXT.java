/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class GuardarEscribirTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir en un txt
        GuardarEscribirTXT txt = new GuardarEscribirTXT();
        txt.CrearEscribirTXTSimulacion();
        txt.Leer();
    }

    public void CrearEscribirTXTSimulacion() {
        File DatosSimulacion;  //Manipula el archivo
        FileWriter escribir;// Escribe en el archivo
        PrintWriter linea; // Para escribir en el archivo
        String nombrenodo = "", vertice = "", peso = "";
        DatosSimulacion = new File("SimulacionGuardada.txt");//Prepara el txt
        if (!DatosSimulacion.exists()) {

            try {
                DatosSimulacion.createNewFile();
                nombrenodo = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo"
                        + "Solicitando Datos" + 3);
                vertice = JOptionPane.showInputDialog(null, "Ingresa el vertice",
                        " Solicitando Datos", 3);
                peso = JOptionPane.showInputDialog(null, "Ingresa la distancia del nodo",
                        "Solicitando Datos", 3);
                escribir = new FileWriter(DatosSimulacion, true);//El true es para escribir al final del archivo
                linea = new PrintWriter(escribir);//Escribe varias lineas de texto en el archivo
                //Escribir en el archivo
                linea.println("Nombre: " + nombrenodo);
                linea.println("Vertice: " + vertice);
                linea.println("Distancia: " + peso);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarEscribirTXT.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                //Escribe en el archivo ya creado
                nombrenodo = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo",
                        "Solicitando Datos", 3);
                vertice = JOptionPane.showInputDialog(null, "Ingresa el vertice",
                        "Solicitando Datos", 3);
                peso = JOptionPane.showInputDialog(null, "Ingresa la distancia del nodo"
                        + "Solicitando Datos", 3);
                escribir = new FileWriter(DatosSimulacion, true);//El true es para escribir al final del archivo
                linea = new PrintWriter(escribir);//Escribe varias lineas de texto en el archivo
                //Escribir en el archivo
                linea.println("Nombre: " + nombrenodo);
                linea.println("Vertice: " + vertice);
                linea.println("Distancia: " + peso);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarEscribirTXT.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void Leer() {
        int nNodos = 0;
        File DatosSimulacion;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadenanodo, nombrenodo = "A", vertice = "AB", peso = "";
        DatosSimulacion = new File("SimulacionGuardada.txt");

        try {

            leer = new FileReader(DatosSimulacion);
            almacenamiento = new BufferedReader(leer);
            cadenanodo = "";
            while (cadenanodo != null) {
                try {
                    nombrenodo = cadenanodo;
                    cadenanodo = almacenamiento.readLine();
                    vertice = cadenanodo;
                    cadenanodo = almacenamiento.readLine();
                    peso = cadenanodo;
                    if (cadenanodo != null) {
                        JOptionPane.showMessageDialog(null, "Nombre del nodo: " + nombrenodo
                                + "\nVertice: " + vertice + "\n Distancia: " + peso,
                                "Datos del Nodo #" + nNodos, 1);
                        nNodos++;

                    }

                } catch (IOException ex) {
                    Logger.getLogger(GuardarEscribirTXT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarEscribirTXT.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarEscribirTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
