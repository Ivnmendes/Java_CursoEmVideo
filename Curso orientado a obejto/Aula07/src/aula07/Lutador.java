package aula07;

public class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if(this.getPeso() <52.2) {
            this.categoria = "Invalido";
        }else if (this.getPeso() <=70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Medio"; 
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
//Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    

    public void apresentar() {
        System.out.printf("lutador %s, %s, com %d anos, %.2f metros e %.2f KG. Ele pertence a categoria %s e tem %d vitorias, %d derrotas e %d empates", this.getNome(), this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getCategoria(), this.getVitorias(), this.getEmpates(), this.getDerrotas());
    }

    public void status() {
        System.out.println("----STATUS----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.printf("Altura: %.2f", this.getAltura());
        System.out.printf("\nPeso: %.1f", this.getPeso());
        System.out.println("\nCategoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
    }


    public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
    }
}
