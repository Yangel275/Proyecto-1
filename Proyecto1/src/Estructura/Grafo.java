/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

/**
 *
 * @author Carl
 */
public class Grafo {

    Vertice[] ciudades;
    int max;
    int cant_ciudades;
    int primero;
    int ultimo;

    public Grafo(int max) {

        this.max = max;
        this.cant_ciudades = 0;
        this.primero = this.ultimo = 0;
        this.CrearLista();

    }

    public void CrearLista() {

        this.ciudades = new Vertice[max];

        for (int i = 0; i < max; i++) {

            this.ciudades[i] = new Vertice("");

        }
    }

    public void InsertarVertice(String destino) {
        if (cant_ciudades != max) {
            for (int i = 0; i < max; i++) {
                if (this.ciudades[i].nombre.equals("")) {
                    this.ciudades[i].nombre = destino;
                    break;

                }

            }

        } else {
            Vertice[] copia = new Vertice[max++];
            for (int i = 0; i < 10; i++) {
                copia[i] = this.ciudades[i];

            }
            copia[max] = new Vertice(destino);
            max++;
            cant_ciudades++;

        }
    }

    public void Imprimir() {
        for (int i = 0; i < max; i++) {

            System.out.println(this.ciudades[i].nombre);
            System.out.println(this.ciudades[i].adyacentes.Imprimir());

        }
    }

    public void InsertarArista(String destino, String origen, double distancia) { // Crea una ciudad en el grafo

        for (int i = 0; i < 10; i++) {

            if (this.ciudades[i].nombre.equals(origen)) {

                this.ciudades[i].adyacentes.InsertarUltimo(destino, distancia);

            } else if (this.ciudades[i].nombre.equals(destino)) {
                this.ciudades[i].adyacentes.InsertarUltimo(origen, distancia);
            }
        }

    }

    public void EliminarArista(String destino, String origen) { // Elimina una arista del grafo

        for (int i = 0; i < 10; i++) {
            if (this.ciudades[i].nombre.equals(destino)) {

                this.ciudades[i].adyacentes.Eliminar(origen);

            } else if (this.ciudades[i].nombre.equals(origen)) {

                this.ciudades[i].adyacentes.Eliminar(destino);

            }

        }

    }

    public void EliminarVertice(String destino) { // Elimina el vértice del grafo

        for (int i = 0; i < 10; i++) {
            if (this.ciudades[i].nombre.equals(destino)) {
                this.ciudades[i] = new Vertice("");

            } else {
                this.ciudades[i].adyacentes.Eliminar(destino);

            }

        }

    }

    public void BuscarArista(String origen, String destino) {

        for (int i = 0; i < 10; i++) {
            if (this.ciudades[i].nombre.equals(destino)) {
                this.ciudades[i].adyacentes.BuscarArista(destino);

            }

        }
    }

    public Vertice BuscarVertice(String origen) {
        for (int i = 0; i < 10; i++) {
            if (this.ciudades[i].nombre.equals(origen)) {
                return this.ciudades[i];

            }
            
        }
        return null;
    }
}
        
