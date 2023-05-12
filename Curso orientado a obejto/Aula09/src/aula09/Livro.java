package aula09;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "\ntitulo=" + titulo + ", "
                + "\nautor=" + autor 
                + ", \ntotPaginas=" + totPaginas 
                + ", \npagAtual=" + pagAtual 
                + ", \naberto=" + aberto 
                + ", \nleitor=" + leitor.getNome()
                + "\n}";
    }
    
    
    
    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear(int p) {
        if (!(this.isAberto())) {
            this.abrir();
        }
        if(p > this.totPaginas) {
            System.out.printf("O livro tem apenas %d paginas", totPaginas);
        }
        else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (!(this.isAberto())) {
            this.abrir();
        }
        if (this.getPagAtual() == this.totPaginas) {
            this.fechar();
        }
        else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (!(this.isAberto())) {
            this.abrir();
        }
        this.setPagAtual(this.getPagAtual() - 1);
        if (this.getPagAtual() == 0) {
            this.fechar();
        }
    }
    
}
