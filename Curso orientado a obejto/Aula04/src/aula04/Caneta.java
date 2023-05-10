package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String c, String m, float p) { //método contrutor
        this.tampada = true;
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        
    }
    
    public void status(){
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor " + this.getCor());
        System.out.println("Tampada " + this.getTampada());
    }
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
