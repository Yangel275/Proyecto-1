/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Carl
 */
public class grafo {

    Vertice[] ciudades;
    int max;
    int cant_ciudades;
    int primero;
    int ultimo;

    public grafo(int max) {

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

    public void InsertarVetice(String destino) {
        if (cant_ciudades != max) {
            for (int i = 0; i < max; i++) {
                if (this.ciudades[i].nombre == "") {
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
}

