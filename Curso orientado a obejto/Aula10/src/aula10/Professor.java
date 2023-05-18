package aula10;
public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    public void aumentarSalario(double aumento) {
        this.salario += aumento;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }
}
