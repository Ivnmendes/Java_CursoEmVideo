package aula12;
public abstract class Ave extends Animal{
    protected String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Ciscando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Cantando");
    }
}
