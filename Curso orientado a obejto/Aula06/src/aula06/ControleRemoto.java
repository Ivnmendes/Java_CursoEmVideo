package aula06;

public class ControleRemoto implements Controlador {
    private int volume ;
    private boolean ligado;
    private boolean tocando;
    private int volumeArmazenado;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //Metdos set e get criados como privado para teste
    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private void setVolumeArmazenado(int volumeArmazenado) {
        this.volumeArmazenado = volumeArmazenado;
    }

    private int getVolumeArmazenado() {
        return volumeArmazenado;
    }
    
//Metodos Abstratos
    
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        if (this.isLigado() ) {
            this.setLigado(false);
        }
    }
    @Override
    public void maisVolume() {
        if (this.isLigado() && this.getVolume() <= 95) {
         this.setVolume(this.getVolume()+5);
        }
    }
    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume()>=5) {
            this.setVolume(this.getVolume() - 5);
        }
    }
    
    @Override
    public void mudo(){
        if(this.getVolume() >= 0 && this.isLigado()) {
            this.setVolumeArmazenado(this.getVolume());
            this.setVolume(0);
        }
    }
    
    @Override
    public void tirarMudo(){
        if(this.getVolume() == 0 && this.isLigado()) {
            this.setVolume(this.getVolumeArmazenado());
        }
    }
    
    @Override
    public void play () {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }
    
    @Override
    public void pause(){
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("-----MENU-----");
            System.out.println("Esta ligado? " + this.isLigado());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i<this.getVolume(); i+=5) {
                System.out.print("[*]");
            }
            System.out.println("\nEsta tocando? " + this.isTocando());
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
            System.out.println("Fechando menu...");
        }
        
    }
}
