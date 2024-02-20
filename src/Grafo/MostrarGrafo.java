/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;

public class MostrarGrafo {
	
	public static void prueba(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Eliminar Grafo");
		System.out.println("4. Mostrar Grafo");
		System.out.println("5. Obtener lista Adyacencia vertice");
		System.out.println("6. Salir");
	}
	
	public static void AgregarArista(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int peso = in.nextInt();
		g.insertaArista(v1, v2, peso);
	}
	
	public static void BorrarArista(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		if(g.existeArista(v1, v2))g.EliminarAristas(v1, v2);
		else System.out.println("Arista buscada no existe");
	}
	
	public static void BorrarGrafo(Grafo g){
		System.out.println("Borrando grafo");
		g.BorrarGrafo();
	}
	
	public static void MostrarGrafo(Grafo g){
		g.ShowGrafo();
	}
	
	public static void getAdList(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte vertice");
		int v = in.nextInt();
		if(g.ListaVacia(v)){
			System.out.println("La lista esta vacia");
		}
		else{
			Nodo aux = g.PrimerAdy(v);
			System.out.println("Lista: ");
			while(aux != null){
				System.out.print(" " + aux.vertice);
				aux = g.ProximoAdy(aux);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int opcion;
		Grafo g = new Grafo(5);
		
		do{
			prueba();
			
			System.out.println("Ingrese una opcion");
			Scanner in = new Scanner(System.in);
			opcion = in.nextInt();
			
			switch(opcion){
			case 1: AgregarArista(g);break;
			case 2: BorrarArista(g);break;
			case 3: BorrarGrafo(g);break;
			case 4: MostrarGrafo(g);break;
			case 5: getAdList(g);break;
			case 6: break;
			default: System.out.println("Opcion incorrecta ");
			}
		}while(opcion != 6);
	}
}