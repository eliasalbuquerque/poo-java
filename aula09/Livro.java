package aula09;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    // private ??? leitor;


    // metodo detalhes do livro
    public void detalhes() {
        System.out.println("----- DETALHES DO LIVRO -----");
        System.out.println("Titulo do Livro: " + this.getTitulo());
        System.out.println("Autor do Livro: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
    }


    // metodos getters e setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    // public boolean getLeitor() {
    //     return this.leitor;
    // }

    // public void setLeitor(boolean leitor) {
    //     this.leitor = leitor;
    // }


    // metodos abstratos
    @Override
    public void abrir() {
    /*
     *  se getAberto() entao
     *      escreva "livro já esta aberto"
     *  senao
     *      setAberto(verdadeiro)
     *  fim se
     */

        if (this.getAberto()) {
            System.out.println("O livro já está aberto!");
        } else {
            this.setAberto(true);
            System.out.println("Abrindo o livro");
        }
    }

    @Override
    public void avancarPag() {
    /*
     *  se getAberto() entao
     *      setPagAtual(getPagAtual() + 1)
     *  senao
     *      escreva "o livro esta fechado"
     *  fim se
     */

        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("pág: " + this.getPagAtual());
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    @Override
    public void fechar() {
    /*
     *  se getAberto() entao
     *      setAberto(falso)
     *  senao
     *      escreva "o livro já esta fechado"
     *  fim se
     */

        if (this.getAberto()) {
            this.setAberto(false);
            System.out.println("Fechando livro");
        } else {
            System.out.println("O livro já esta fechado!");
        }
    }

    @Override
    public void folhear() {
        //  *      c = 0
        //  *      se (c = 0) entao
        //  *          salvarPagAtual = getPagAtual()
        //  *          c = c + 1
        //  *      fim se
    /*  
     *  se getAberto() entao
     *      setPagAtual(getPagAtual() + 10)
     *  senao
     *      escreva "o livro esta fechado"
     *  fim se
     */

        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 10);
            System.out.println("pág: " + this.getPagAtual());
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    @Override
    public void voltarPag() {
    /*
     *  se getAberto() entao
     *      setPagAtual(getPagAtual() - 1)
     *  senao
     *      escreva "o livro esta fechado"
     *  fim se
     */
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("pág: " + this.getPagAtual());
        } else {
            System.out.println("O livro esta fechado!");
        }
    }
}
