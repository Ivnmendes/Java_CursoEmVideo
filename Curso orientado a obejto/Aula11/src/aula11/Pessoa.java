package aula11;
public abstract class Pessoa {
    protected String nome;
    protected int Idade;
    protected String sexo;
    
    public final void fazerAniversario(){
        this.Idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", Idade=" + Idade + ", sexo=" + sexo + '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
