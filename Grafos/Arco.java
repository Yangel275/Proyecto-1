/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;

/**
 *
 * @author Sergio
 */
public class Arco {
    int destino;
    double peso;
    public Arco(int d)
    {
    destino = d;
    }
    public Arco(int d, double p)
    {
     this(d);
    peso = p;
    }
    public int getDestino()
    {
 return destino;
    }
    public boolean equals(Object n)
    {
    Arco a = (Arco)n;
    return destino == a.destino;
    }
}