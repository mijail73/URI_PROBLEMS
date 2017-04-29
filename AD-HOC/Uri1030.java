import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Programa para resolver el ejercicio 1030 de URI
 * Flavious Josephus Legend - Problem
 * @author mijail
 * @version 1.0
 */
public class Uri1030 {

    /**
     * Metodo main de nuestra clase.
     */
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	String entrada;
	String entradaWhile;
	entrada = in.readLine();
	int entradaI = Integer.parseInt(entrada);
	int contadorCasos = 1;
	int men = 0;
	int steps = 0;
	int res = 0;
	
	while(contadorCasos < entradaI + 1) {
	    entradaWhile = in.readLine();
	    String[] entradaWhileArr = entradaWhile.split(" ");
	    int[] entradaInt = new int[entradaWhileArr.length];
	    for (int i = 0; i < entradaInt.length; i++) {
		entradaInt[i] = Integer.parseInt(entradaWhileArr[i]);
	    }
	    men = entradaInt[0];
	    steps = entradaInt[1];
	    ListaCircular<Integer> mesaRedonda = new ListaCircular<>();
	    for (int i = 1; i < men + 1 ; i++) {
		mesaRedonda.add(i);
	    }

	    while(mesaRedonda.size() > 1) {
		if(mesaRedonda.size() == men) {
		    for (int i = 1; i < steps +1 ; i++) {
			mesaRedonda.next();
		    }
		    mesaRedonda.remove();
		} else {
		    for (int i = 1; i < steps; i++) {
			mesaRedonda.next();
		    }
		    mesaRedonda.remove();
		}
	    }
	    res = mesaRedonda.peek();
	    System.out.format("Case %d: %d\n", contadorCasos, res);
	    contadorCasos ++;
	}
    }
}
    
/**
 * Practica3 EDD 2017 - 1
 * Lista circular con metodos de complejidad constante
 * @author mijail
 * @version 1.0
 */
class ListaCircular<T> {
    /**
     * Variable para guardar el tamaño de nuestra lista circular
     */
    private int size;
    /**
     * Nodos que nos serviran de referencia para poder operar sobre
     * nuestra lista circular
     */
    private Nodo<T> actual;
    private Nodo<T> anterior;

    /**
     * Este constructor crea  una Lista Circular vacia
     */
    public ListaCircular() {
	actual = anterior = null;
	size = 0;
    }

    /**
     * Regresa el número de elementos de la estructura de datos.
     * @return size la variable con el numero de elementos de la estructura
     */
    public int size() {
	return size;
    }

    /**
     * Metodo para comprobar si la estructura es vacia o no.
     * @return true si la lista no contiene ningrun elemento.
     * @return false en caso contrario.
     */
    public boolean isEmpty() {
	if(size == 0)
	    return true;
	else
	    return false;
    }

    /**
     * Agrega el nodo con elemento x en la lista circular, estableciendo
     * este valor como el nodo actual.
     * @param x elemento del nuevo nodo que se añadira a la lista
     */
    public void add(T x) {
	Nodo<T> nuevo = new Nodo<T>(x);
	if(isEmpty())
	    actual = anterior = nuevo;
	else {
	    nuevo.setSiguiente(actual.getSiguiente());
	    actual.setSiguiente(nuevo);
	    actual = nuevo;
	    if(size() > 1)
		anterior = anterior.getSiguiente();
	}
	size ++;
    }

    /**
     * Metodo para obtener el elemento del nodo actual
     * @return T el objeto
     */
    public T peek() {
	return actual.getElemento();
    }

    /**
     * Avanza el nodo actual al siguiente elemento de la lista.
     */
    public void next() {
	if(size() != 0) {
	    actual = actual.getSiguiente();
	    anterior = anterior.getSiguiente();
	}
    }

    /**
     * Elimina el nodo actual y lo establece en el siguiente elemento.
     */
    public void remove() {
 	if(size() == 1)
	    anterior = actual = null;
	anterior.setSiguiente(actual.getSiguiente());
	actual = anterior.getSiguiente();
	size --;
    }
}
	    
/**
 * Clase interna que modela un objeto Nodo
 */
class Nodo<T> {
    /**
     * Este Nodo contiene un elemento de tipo T
     */
    private T elemento;
    /**
     * Una liga al nodo siguiente
     */
    private Nodo<T> siguiente;
	
    /**
     * Construye un nodo vacio
     */
    public Nodo() {
	elemento = null;
	siguiente = this;
    }
	
    /**
     * Construye un nodo con el elemento que contendra.
     * @param elementoA elemento en el nodo
     */
    public Nodo(T elementoA) {
	elemento = elementoA;
	siguiente = this;
    }

    /**
     * Establece el elemento de un nodo ya existente.
     * @param elementoA nuevo elemento en el nodo.
     */
    public void setElemento(T elementoA) {
	elemento = elementoA;
    }

    /**
     * Establece el siguiente del nodo.
     * @param siguienteA nodo siguiente de la instancia
     * que invoca el metodo.
     */
    public void setSiguiente(Nodo<T> siguienteA) {
	siguiente = siguienteA;
    }

    /**
     * Permite conocer el contenido del nodo.
     * @return una referencia al objeto contenido en el nodo
     */
    public T getElemento() {
	return elemento;
    }

    /**
     * Obtenemos una referencia al nodo siguiente de 
     * la instancia que invoca al metodo
     * @return una referencia al nodo siguiente del que llama
     */
    public Nodo<T> getSiguiente() {
	return siguiente;
    }
}
