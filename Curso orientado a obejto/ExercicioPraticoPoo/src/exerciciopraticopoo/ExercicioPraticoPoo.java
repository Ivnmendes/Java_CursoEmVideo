package exerciciopraticopoo;
import java.util.Scanner;
public class ExercicioPraticoPoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposito;
        System.out.println("Serviço Bancário");
        System.out.println("Bem vindo ao nosso banco, primeiramente crie sua conta ");
        System.out.print("No nome de quem a conta deve ser criada? ");
        String nome = sc.next();
        Banco c1 = new Banco(nome);
        System.out.print("Digite 1 para criar uma conta-corrente e digite 2 para criar uma conta poupança: ");
        int op = sc.nextInt();
        c1.setTipoConta(op);
        c1.abrirConta();
        System.out.println("Parabés, sua conta foi criada, aqui estãos os dados dela:");
        c1.status();
        boolean io = true;
        while(io) {
            System.out.print("Escolha a operaçao a ser realizada, 1 para verificar o saldo, 2 para saque, 3 para deposito, 4 para fechar a conta e 5 para parar: ");
            int op2 = sc.nextInt();
            switch (op2) {
                case 1:
                    System.out.printf("O saldo e de R$%.2f", c1.getSaldo());
                    break;
                case 2:
                    System.out.print("\n Insira o valor a ser sacado");
                    int saque = sc.nextInt();
                    c1.sacar(saque);
                    break;
                case 3:
                    System.out.print("\n Insira o valor a ser depositado");
                    deposito = sc.nextInt();
                    c1.depositar(deposito);
                    break;
                case 4:
                    c1.fecharConta();
                    if (!(c1.getStatus())) {
                        io = false;
                        System.out.println("Obrigado por usar nosso sistema!");  
                    }
                    break;    
                case 5:
                    io = false;
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;
                default:
                    System.out.println("Insira um valor válido!");
                    break;
            }
            System.out.println(" ");
        }
    }
}