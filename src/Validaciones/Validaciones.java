package Validaciones;

//Validaciones 
/**
 *
 * @author Sergio
 */
public class Validaciones {

    //Nombre de usuario o algo por el estilo tambien se puede usar en las ciudades 
    public static boolean Nombre(String x) {
        boolean estado = false;

        if (x != null && x.length() > 0) {
            boolean mayuscula = Character.isUpperCase(x.charAt(0));

            int tamax = x.length();
            boolean validaTasa = (tamax >= 1 && tamax <= 17);

            boolean espacio = x.contains(" ");

            estado = ((mayuscula == true) && (mayuscula == true && validaTasa == true && espacio == true));
            return estado;

        } else {
            return estado;
        }
    }

    //Validar si es un numero 
    public static boolean esN(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException t) {
            return false;
        }
    }

    /*
    Validar si tau es un double
     */
    public static String validarNumero(String x) {
        try {
            System.out.println("El numero ingresado por el usuario no es numero" + x + "" + "Ingresa un numero por favor");

        } catch (NumberFormatException e) {
            System.out.println("Solo se aceptan numeros" + x + "" + "Esto no corresponde a un numero");
        }
        return null;

    }

    //Validar si el input es vacio
    public static boolean Vacio(String x) {
        return x.isEmpty();
    }

    //Validar si us double 
    public static boolean EsDecimal(String x) {
        try {
            Double.parseDouble(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return false;

    }

    //validar si input es entero   
    public static boolean esEntero(String x) {
        try {
            Integer.parseInt(x);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }
    /*
    Validaciones faltantes:
    
    Validar que donde el input sea digito no se coloquen caracteres especiales
    
    public static boolean Isnumeronormal(String x){
        try{
            
    
    Validaciones de campo de texto :
    
    
    Limitar cantidad de palabras en un campo
    
    public static boolean CantString(String x){
        try {
    
    
    
     */

}
