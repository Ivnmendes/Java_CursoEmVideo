
package vetor02;

import java.util.Scanner;

/**
 *
 * @author ivanm
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o ano ");
        int ano = entrada.nextInt();
        boolean anoBissexto;
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int totDias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if (ano % 4 == 0) {
            if(ano % 100 == 0) {
                if(ano % 400 == 0) {
                    anoBissexto = true;
                }
                else {
                    anoBissexto = false;
                }
            }
            else {
                anoBissexto = true;
            }
        }
        else {
            anoBissexto = false;
        }
        
        if (anoBissexto) {
            totDias[1] = 29;
        }
        
        for(int i=0;i<mes.length;i++) {
            System.out.println("O mês de " + mes[i] + " tem " + totDias[i] + " dias.");
        }
    }
    
}
