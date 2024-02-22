
package Calculos;

/**
 *
 * @author Sergio
 */
public class Feoromonas {
    
       private double tau;
       private double deltatau;
       private double rho;

    public Feoromonas(double tau, double deltatau, double rho) {
        this.tau = tau;
        this.deltatau = deltatau;
        this.rho = rho;
    }  
            
 /*

 *
 * @param tau El valor actual de la feromona en el camino. Debe ser mayor o igual que cero.
 * @param deltaTau El cambio en la cantidad de feromona. Debe ser mayor o igual que cero.
 * @param rho El factor de evaporación. Debe estar entre 0 y 1.
 * @return La cantidad actualizada de feromona.
 * @throws IllegalArgumentException Si alguno de los parámetros es inválido.
 */
    public static double actualizarFeromona(double tau, double deltaTau, double rho) {
      // Validar los parámetros
      if (tau < 0) {
        throw new IllegalArgumentException("El valor actual de la feromona no puede ser negativo.");
      }
      if (deltaTau < 0) {
        throw new IllegalArgumentException("El cambio en la cantidad de feromona no puede ser negativo.");
      }
      if (rho < 0 || rho > 1) {
        throw new IllegalArgumentException("El factor de evaporación debe estar entre 0 y 1.");
      }

      // Calcular la cantidad actualizada de feromona
      return (1 - rho) * tau + deltaTau;
    }

    /**
     * @return the tau
     */
    public double getTau() {
        return tau;
    }

    /**
     * @param tau the tau to set
     */
    public void setTau(double tau) {
        this.tau = tau;
    }

    /**
     * @return the deltatau
     */
    public double getDeltatau() {
        return deltatau;
    }

    /**
     * @param deltatau the deltatau to set
     */
    public void setDeltatau(double deltatau) {
        this.deltatau = deltatau;
    }

    /**
     * @return the rho
     */
    public double getRho() {
        return rho;
    }

    /**
     * @param rho the rho to set
     */
    public void setRho(double rho) {
        this.rho = rho;
    }
    
}


