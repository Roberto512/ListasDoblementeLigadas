/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeligadas;

/**
 *
 * @author Roberto
 */
public class ListasDoblementeLigadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lista<String> lista = new lista<>();
        lista.insertaAlPrincipio("1");
        lista.insertaAlPrincipio("2");
        lista.insertaAlPrincipio("3");
        lista.insertarAlFinal("0");
        lista.insertaAlPrincipio("4");
        lista.insertarAntesDeX("3.5", "3");
        lista.mostrar();
        System.out.println("-----");
        lista.eliminaInicio();
        lista.mostrar();
    }
}
