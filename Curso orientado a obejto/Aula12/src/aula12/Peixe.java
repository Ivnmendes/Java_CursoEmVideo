package aula12;
public abstract class Peixe extends Animal{

    protected String corEscama;
    
    public void soltarBOlhas() {
        System.out.println("Soltando bolhas...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
}
