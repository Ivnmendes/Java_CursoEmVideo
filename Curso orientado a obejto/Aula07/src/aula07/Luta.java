package aula07;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiador;
    private int rounds;
    private boolean aprovada;

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    public void marcarLuta(Lutador a, Lutador b) {
        if( (a != b ) && (a.getCategoria().equals(b.getCategoria()))) {
            this.aprovada = true;
            desafiado = a;
            desafiador = b;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiador = null;
        }
    }
    public void lutar() {
        if(this.aprovada) {
            desafiado.apresentar();
            System.out.print("\n foi desafiado pelo \n");
            desafiador.apresentar();
            int vencedor = (int) (Math.random() * 3);
            switch (vencedor) {
                case 1 -> {
                    System.out.println("\nO vencedor foi o " + this.desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiador.perderLuta();
                }
                case 2 -> {
                    System.out.println("\nO vencedor foi o " + this.desafiador.getNome());
                    desafiador.ganharLuta();
                    desafiado.perderLuta();
                }
                case 0 -> {
                    System.out.println("\nA luta terminou em empate");
                    desafiado.empatarLuta();
                    desafiador.empatarLuta();
                }
                default -> System.out.println("\nA luta nao pode acontecer!");
            }
        }else {
            System.out.println("\nA Luta nao foi aprovada!");
        }
    }
}
