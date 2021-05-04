import java.util.Scanner;

public class ArbolABB {
    private Nodo raiz;

    public ArbolABB() {
        raiz = null;
    }

    public boolean buscaDatoABB(Object valor) {
        Nodo aux = raiz;
        boolean encontrado = false;

        while ((!encontrado) && (aux != null)) {
            if (((Integer) valor) < ((Integer) aux.obtenDato()))
                aux = aux.obtenHijoIzq();
            else {
                if (((Integer) valor) > ((Integer) aux.obtenDato()))
                    aux = aux.obtenHijoDer();
                else encontrado = true;
            }
        }
        return encontrado;
    }

    public void insertaNodoABB(Nodo n) {
        Nodo aux2 = raiz, aux3 = null;

        while (aux2 != null) {
            aux3 = aux2;
            if (((Integer) n.obtenDato()) < ((Integer) aux2.obtenDato()))
                aux2 = aux2.obtenHijoIzq();
            else aux2 = aux2.obtenHijoDer();
        }
        if (aux3 == null)
            raiz = n;
        else {
            if (((Integer) n.obtenDato()) < ((Integer) aux3.obtenDato()))
                aux3.insertaHijoIzq(n.obtenDato());
            else aux3.insertaHijoDer(n.obtenDato());
        }
    }

    public void enOrden(Nodo n) {
        if (n != null) {
            enOrden(n.obtenHijoIzq());
            System.out.print("--> " + ((Integer) n.obtenDato()).intValue());
            enOrden(n.obtenHijoDer());
        }
    }
}