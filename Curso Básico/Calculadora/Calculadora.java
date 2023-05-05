package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean io = true;
        double resultado;
        String op;
        System.out.print("Insira um número: ");
        double n1 = entrada.nextDouble();
        resultado = n1;
        while(io) {
            System.out.print("Escolha um operador: +, -, *, / ou =:  ");
            op = entrada.next();
            if("=".equals(op)) {
                System.out.printf("O resultado final é: %.2f \n", resultado);
                io = false;
                continue;
            }
            System.out.print("Insira um número: ");
            n1 = entrada.nextDouble();
            switch(op){
               case "+" -> resultado += n1;
               case "-" -> resultado -= n1;
               case "*" -> resultado *= n1;
               case "/" -> resultado /= n1;
               default -> {
                   System.out.println("Insira um valor válido!");
                   io = false;
                }

            }
        }   
    }
    
}
