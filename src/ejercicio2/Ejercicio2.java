
package ejercicio2;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        new Hilo("a").start();
        new Hilo("b").start();
        new Hilo("c").start();
        new Hilo("d").start();
        System.out.println("Termina clase main");
    }

}
