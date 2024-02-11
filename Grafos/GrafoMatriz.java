/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;


/**
 * Representa un grafo dirigido mediante una matriz de adyacencia.
 */
public class GrafoMatriz {

    /**
     * Número máximo de vértices que puede tener el grafo.
     */
    static final int MaxVerts = 20;

    /**
     * Número actual de vértices en el grafo.
     */
    private int numVerts;

    /**
     * Matriz de adyacencia que representa el grafo.
     */
    private int[][] matAd;

    /**
     * Lista de vértices del grafo.
     */
    private Vertice[] verts;

    /**
     * Crea un nuevo grafo con la capacidad máxima de vértices.
     */
    public GrafoMatriz() {
        this(MaxVerts);
    }

    /**
     * Crea un nuevo grafo con la capacidad especificada de vértices.
     *
     * @param mx La capacidad máxima de vértices del grafo.
     */
    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }

    /**
     * Agrega un nuevo vértice al grafo con el nombre especificado.
     *
     * @param nom El nombre del nuevo vértice.
     */
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    /**
     * Obtiene el índice de un vértice en la lista de vértices a partir de su nombre.
     *
     * @param vs El nombre del vértice a buscar.
     * @return El índice del vértice en la lista de vértices, o -1 si no se encuentra.
     */
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado; ) {
            encontrado = verts[i].equals(v);
            if (!encontrado) i++;
        }
        return (i < numVerts) ? i : -1;
    }

    /**
     * Agrega una nueva arista al grafo entre dos vértices especificados por sus nombres.
     *
     * @param a El nombre del vértice origen de la arista.
     * @param b El nombre del vértice destino de la arista.
     * @throws Exception Si no se encuentra alguno de los vértices especificados.
     */
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        matAd[va][vb] = 1;
    }

    /**
     * Comprueba si dos vértices especificados por sus nombres son adyacentes en el grafo.
     *
     * @param a El nombre del vértice origen.
     * @param b El nombre del vértice destino.
     * @throws Exception Si no se encuentra alguno de los vértices especificados.
     * @return True si los vértices son adyacentes, False en caso contrario.
     */
    public boolean adyacente(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return matAd[va][vb] == 1;
    }

    /**
     * Comprueba si dos vértices especificados por sus índices son adyacentes en el grafo.
     *
     * @param va El índice del vértice origen.
     * @param vb El índice del vértice destino.
     * @
/**
 * Representa un grafo dirigido mediante una matriz de adyacencia.
 */
public class GrafoMatriz {

    /**
     * Número máximo de vértices que puede tener el grafo.
     */
    static final int MaxVerts = 20;

    /**
     * Número actual de vértices en el grafo.
     */
    private int numVerts;

    /**
     * Matriz de adyacencia que representa el grafo.
     */
    private int[][] matAd;

    /**
     * Lista de vértices del grafo.
     */
    private Vertice[] verts;

    /**
     * Crea un nuevo grafo con la capacidad máxima de vértices.
     */
    public GrafoMatriz() {
        this(MaxVerts);
    }

    /**
     * Crea un nuevo grafo con la capacidad especificada de vértices.
     *
     * @param mx La capacidad máxima de vértices del grafo.
     */
    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }

    /**
     * Agrega un nuevo vértice al grafo con el nombre especificado.
     *
     * @param nom El nombre del nuevo vértice.
     */
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    /**
     * Obtiene el índice de un vértice en la lista de vértices a partir de su nombre.
     *
     * @param vs El nombre del vértice a buscar.
     * @return El índice del vértice en la lista de vértices, o -1 si no se encuentra.
     */
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado; ) {
            encontrado = verts[i].equals(v);
            if (!encontrado) i++;
        }
        return (i < numVerts) ? i : -1;
    }

    /**
     * Agrega una nueva arista al grafo entre dos vértices especificados por sus nombres.
     *
     * @param a El nombre del vértice origen de la arista.
     * @param b El nombre del vértice destino de la arista.
     * @throws Exception Si no se encuentra alguno de los vértices especificados.
     */
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        matAd[va][vb] = 1;
    }

    /**
     * Comprueba si dos vértices especificados por sus nombres son adyacentes en el grafo.
     *
     * @param a El nombre del vértice origen.
     * @param b El nombre del vértice destino.
     * @throws Exception Si no se encuentra alguno de los vértices especificados.
     * @return True si los vértices son adyacentes, False en caso contrario.
     */
    public boolean adyacente(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return matAd[va][vb] == 1;
    }

    /**
     * Comprueba si dos vértices especificados por sus índices son adyacentes en el grafo.
     *
     * @param va El índice del vértice origen.
     * @param vb El índice del vértice destino.
     * @
