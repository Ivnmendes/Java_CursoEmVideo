package aula10;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
        this.matricula = 0;
        this.curso = null;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
