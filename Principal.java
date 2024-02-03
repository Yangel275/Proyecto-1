
import java.io.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Carl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File archivo;
        try{
        archivo = new File("C:\\Users\\Carl\\Desktop\\TXT\\archivo.txt");
        
        if(archivo.createNewFile()){
            System.out.println("Se ha creado el archivo");
            }
    }catch(IOException e){
            System.err.println("No se ha podido crear el archivo");
            
        }
    }
    
}
