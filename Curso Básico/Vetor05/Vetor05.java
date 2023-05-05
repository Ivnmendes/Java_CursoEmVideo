
package Vetor05;

import java.util.Arrays;

/**
 *
 * @author ivanm
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0);
        for(int valor: vetor) {
            System.out.println(valor+" ");
        }
    }
    
}
