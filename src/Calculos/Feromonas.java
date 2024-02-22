package Calculos;

/**
 *
 * @author Sergio
 */
public class Feromonas {

    double FeromonaAct;
    double CambFeoromona;
    double FactEvaporacion;

    public Feromonas(double FeoromonaAct, double CambFeoromona, double FactEvaporacion) {
        this.FeromonaAct = FeoromonaAct;
        this.CambFeoromona = CambFeoromona;
        this.FactEvaporacion = FactEvaporacion;
    }

    /*
    * @param FeromonaAct Es el valor actual de la feromona en el camino que dejan 
    las hormigas que debe ser mayor o igual que cero.
    
    * @param Feromonas es el cambio de la cantidad de feromona que debe ser mayor o igual que cero.
    
    * @param FactEvaporacion Es el  factor de evaporación que Debe estar entre 0 y 1, 
    datos ya dados por el mismo enunciado del problema.
    
    * @param FeotomonasT es el total de feormonas que deja la hormigas en las ciudades o aristas.
    
     */
    public static double actualizarFeromona(double FeoromonaAct, double CambFeoromona, double FactEvaporacion) {
        // Validar los parámetros
        if (FeoromonaAct < 0) {
            throw new IllegalArgumentException("El valor actual de la feromona no puede ser negativo.");
        }
        if (CambFeoromona < 0) {
            throw new IllegalArgumentException("El cambio en la cantidad de feromona no puede ser negativo.");
        }
        if (FactEvaporacion < 0 || FactEvaporacion > 1) {
            throw new IllegalArgumentException("El factor de evaporación debe estar entre 0 y 1.");
        }

        /*
       Calculo de la cantidad actualizada de feromonas.
      
      
         */
        double FeoromonasT = 0.0;

        FeoromonasT = (1 - FactEvaporacion) * FeoromonaAct + CambFeoromona;

        return FeoromonasT;
    }

}
