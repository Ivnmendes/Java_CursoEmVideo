package exerciciopraticopoo;
public class Banco {
    private String tipoConta;
    private String donoConta;
    private double saldo = 0;
    boolean status = false;
    public Banco(String dC) {
        this.donoConta = dC;
        this.status = true;
    }
    public void status() {
        System.out.println("--------------------------------------");
        System.out.printf("| %-11s %23s%s", this.donoConta, "e o/a dono/a da conta", "|\n");
        System.out.printf("| %-20s %14s%s", "A conta e do tipo: ", this.tipoConta, "|\n");
        System.out.printf("| A conta esta aberta? %3s %12s", this.status?"sim":"nao", "|\n");
        System.out.printf("| O saldo e de R$%.2f%17s",this.saldo, " |\n");
        System.out.println("--------------------------------------");
    }
    public void abrirConta () {
        if (this.tipoConta.equals("Conta-corrente")) {
            this.saldo = 20;
        }
        else {
            this.saldo = 50;
        }
        this.status = true;
    }
    public void fecharConta() {
        if (this.saldo == 0) {
            status = false;
        }
        else {
            System.out.println("Sua conta deve estar vazia para ser fechada!");
        }
    }
    public boolean getStatus() {
        return this.status;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }
    public void setTipoConta(int tipoConta) {
        switch (tipoConta) {
            case 1:
                this.tipoConta = "Conta-corrente";
                break;
            case 2:
                this.tipoConta = "Conta-poupanca";
                break;
            default:
                System.out.println("Insira um valor valido!");
        }
    }
    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.printf("O saldo agora e de R$%.2f", this.saldo);
    }
    public void sacar(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            System.out.printf("O saldo agora e de R$%.2f", this.saldo);
        }
        else {
            System.out.println("O valor do saque nao pode ser maior que o saldo!");
            System.out.printf("O saldo e de R$%.2f", this.saldo);
        }
    }
}