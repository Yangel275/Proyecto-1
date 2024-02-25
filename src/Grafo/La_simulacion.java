/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import Hormigas.hormigas;
/**
 *
 * @author yangel
 */
public class La_simulacion {
    private grafo colonia;
    private hormigas Hormiguero;
    private int ciclos; 
    private double Importancia_feromona;
    private double Visibilidad_ciudad;
    private double factor_evaporacion;

    public String Imprimir(){
        String datos = "La simulación está compuesta por: \n";
        datos += this.colonia.Imprimir() + "\n";
        datos += this.Hormiguero.Imprimir() + "\n";
        datos += "Número de ciclos: "+ String.valueOf(this.getCiclos()) + "\n";
        datos += "Grado de importancia de la feromonas: "+String.valueOf(this.getImportancia_feromona()+"\n");
        datos += "Grado de visibilidad de las ciudades: "+String.valueOf(this.getVisibilidad_ciudad())+"\n";
        datos += "Grado de Evaporación: "+String.valueOf(this.getFactor_evaporacion())+"\n";
        return datos;
    }
    /**
     * @return the colonia
     */
    public grafo getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(grafo colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the Hormiguero
     */
    public hormigas getHormiguero() {
        return Hormiguero;
    }

    /**
     * @param Hormiguero the Hormiguero to set
     */
    public void setHormiguero(hormigas Hormiguero) {
        this.Hormiguero = Hormiguero;
    }

    /**
     * @return the ciclos
     */
    public int getCiclos() {
        return ciclos;
    }

    /**
     * @param ciclos the ciclos to set
     */
    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    /**
     * @return the Importancia_feromona
     */
    public double getImportancia_feromona() {
        return Importancia_feromona;
    }

    /**
     * @param Importancia_feromona the Importancia_feromona to set
     */
    public void setImportancia_feromona(double Importancia_feromona) {
        this.Importancia_feromona = Importancia_feromona;
    }

    /**
     * @return the Visibilidad_ciudad
     */
    public double getVisibilidad_ciudad() {
        return Visibilidad_ciudad;
    }

    /**
     * @param Visibilidad_ciudad the Visibilidad_ciudad to set
     */
    public void setVisibilidad_ciudad(double Visibilidad_ciudad) {
        this.Visibilidad_ciudad = Visibilidad_ciudad;
    }

    /**
     * @return the factor_evaporacion
     */
    public double getFactor_evaporacion() {
        return factor_evaporacion;
    }

    /**
     * @param factor_evaporacion the factor_evaporacion to set
     */
    public void setFactor_evaporacion(double factor_evaporacion) {
        this.factor_evaporacion = factor_evaporacion;
    }
    
    
}
