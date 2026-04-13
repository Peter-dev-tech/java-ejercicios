import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

public class ActividadArboles {
    Nodo raiz;

    public int contarNodos(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }

    public boolean buscar(Nodo nodo, int valorBuscado) {
        if (nodo == null) return false;
        if (nodo.valor == valorBuscado) return true;
        return buscar(nodo.izquierdo, valorBuscado) || buscar(nodo.derecho, valorBuscado);
    }

    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);
        } else {
            raiz.derecho = insertar(raiz.derecho, valor);
        }
        return raiz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ActividadArboles arbol = new ActividadArboles();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
            arbol.raiz = arbol.insertar(arbol.raiz, arreglo[i]);
        }

        System.out.println("\nCantidad total de nodos en el árbol: " + arbol.contarNodos(arbol.raiz));

        System.out.print("\nIngrese el valor que desea buscar en el árbol: ");
        int aBuscar = sc.nextInt();
        boolean encontrado = arbol.buscar(arbol.raiz, aBuscar);
        System.out.println("¿El número se encuentra en el árbol?: " + encontrado);

        sc.close();
    }
}