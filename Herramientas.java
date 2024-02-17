/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Arrays;

/**
 *
 * @author yangel
 */
public class Herramientas {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Permite poner todo en Mayúscula
        String cadena = "hola";
        System.out.println(cadena.toUpperCase());
    
        // Permite poner todo en Minúscula
        cadena = "HOLA";
        System.out.println(cadena.toLowerCase());
        
        // Permite determinar el tamaño del String
        cadena = "Hola";
        System.out.println(cadena.length());
        
        // Permite determinar el tamaño del arreglo()Array []
        int[] numeros = {1,2,3,4,5,6,7};
        System.out.println(numeros.length);
        
        // Permite retornar el carácter de una posición específica del String
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(1));
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.charAt(3));
        
        //Retonar el valor ASCII
        char caracter1 = 'j';
        char caracter2 = 'y';
        System.out.println((int)caracter1);
        System.out.println((int)caracter2);
        
        //Permite crear convertir un String en arreglo usando un car[acter como divisor
        cadena = "A,B,C,D,E,F";
        String[] arreglo = cadena.split(",");
        System.out.println(Arrays.toString(arreglo));
        
        //Permite cambiar un determinado car[acter de String por otro carácter
        String chain = cadena.replace(",","/");
        System.out.println(chain);
        
        //Indica si un String tiene espacio vacíos
        cadena = "";
        String cadena2 = "  ";
        System.out.println(cadena.isBlank());
        System.out.println(cadena2.isBlank());
        
        //Pertmite saber si un String está vacío
        System.out.println(cadena.isEmpty());
        
        // Indica si unos String son iguales
        String cadena3 = "";
        System.out.println(cadena.equals(cadena2));
        System.out.println(cadena.equals(cadena3));
        
        //Indica a un Sting si contiene los caracteres indicados
        String chn = "Hola";
        System.out.println(chn.contains("ol"));
        System.out.println(chn.contains("ha"));
        
        // compareToIgnoreCase() realiza la misma funcion que compareTo() pero no diferencia las mayúsculs ni las minúsculas
        String chn2 = "arbol";
        System.out.println(chn.compareToIgnoreCase(chn2));
        
        
    }

}
