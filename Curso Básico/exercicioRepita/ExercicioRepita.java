/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioRepita;

import javax.swing.JOptionPane;
/**
 *
 * @author ivanm
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, soma = 0, totValores = 0, totPares = 0, totImpares = 0, acima100 = 0;
        double media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(use 0 para interromper)</em></html>"));
            if (n % 2 == 0) {
                totPares++;
            }
            else {
                totImpares++;
            }
            if (n>100) {
                acima100++;
            }
            soma += n;
            totValores++;
        } while (n!=0);
        media = soma / totValores;
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr>" + 
                "<br>Somatório vale " + soma +
                "<br>Foram digitados " + totValores + " valores" +
                "<br>Pares " + totPares +
                "<br>Impares " + totImpares +
                "<br>Maiores que 100 " + acima100 +
                "<br> Media dos valores" + media +"</html>");
    }
    
}
