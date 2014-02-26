/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeligadas;

/**
 *
 * @author Roberto
 */
public class lista<T> {

    private Nodo<T> p = null;

    /**
     * Metodo que inserta un nodo al inicio de la lista doblemente ligada.
     *
     * @param dato Dato a insertar en la lista
     */
    public void insertaAlPrincipio(T dato) {
        Nodo<T> q = new Nodo();
        if (p != null) {
            q.setValor(dato);
            q.setLigaDerecha(this.p);
            p.setLigaIzquierda(q);
            q.setLigaIzquierda(null);
            p = q;

        } else {
            q.setValor(dato);
            p = q;
        }




    }

    public void insertarAlFinal(T dato) {
        Nodo<T> q = this.p;
        Nodo<T> t = new Nodo();
        t.setValor(dato);
        while (q.getLigaDerecha() != null) {
            q = q.getLigaDerecha();
        }

        q.setLigaDerecha(t);
        t.setLigaIzquierda(q);
        t.setLigaDerecha(null);
        q = t;


    }

    /**
     * Metodo que inserta un nodo antes de otro como referencia.
     *
     * @param dato Dato a insertar
     * @param x X es el dato que se tomara como referencia para insertar un
     * nodo.
     */
    public void insertarAntesDeX(T dato, T x) {
        Nodo<T> q = this.p;
        Nodo<T> t = new Nodo();
        Nodo<T> r = new Nodo();
        while (q.getLigaDerecha() != null && q.getValor() != x) {
            q = q.getLigaDerecha();
        }
        if (q.getValor() == x) {
            t.setValor(dato);
            t.setLigaDerecha(q);
            r = q.getLigaIzquierda();
            q.setLigaIzquierda(t);

            if (this.p == q) {
                this.p = t;
                t.setLigaIzquierda(null);
            } else {
                r.setLigaDerecha(t);
                t.setLigaIzquierda(t);
            }
        } else {
            System.out.println("No se encontro");
        }
    }

    public void eliminaInicio() {
        Nodo<T> q = this.p;
        Nodo<T> t = this.p;

        if (q.getLigaDerecha() != null) {
            this.p = q.getLigaDerecha();
            this.p.setLigaIzquierda(null);
        } else {
            this.p = null;
            while (t.getLigaDerecha() != null) {
                t = t.getLigaDerecha();
            }
            t = null;
        }

    }

    public void mostrar() {
        Nodo<T> q = this.p;
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getLigaDerecha();
        }
    }

    public Nodo<T> getP() {
        return p;
    }

    public void setP(Nodo<T> p) {
        this.p = p;
    }
}
