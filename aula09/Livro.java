package aula09;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    // metodo detalhes do livro
    // public void detalhes() {
    //     System.out.println("----- DETALHES DO LIVRO -----");
    //     System.out.println("Titulo do Livro: " + this.getTitulo());
    //     System.out.println("Autor do Livro: " + this.getAutor());
    //     System.out.println("Total de páginas: " + this.getTotPaginas());
    // }
    
    // @Override
    public String detalhes() {
        return "Livro: titulo: " + titulo 
                + ", \n       autor: " + autor 
                + ", \n       totPaginas: " + totPaginas 
                + ", \n       pagAtual: " + pagAtual
                + ", \n       aberto: " + aberto 
                + ", \n       leitor: " + leitor.getNome() 
                + ", " + leitor.getIdade() 
                + " anos, do sexo " + leitor.getSexo();
    }
    


    public Livro (String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
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

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


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
            System.out.println(leitor.getNome() + " abriu o livro");
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
            if (this.getPagAtual() != this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("avançou para pág: " + this.getPagAtual());
            } else {
                System.out.println("o livro esta na última página");
            }            
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
    public void folhear(int p) {
    // metodo utilizado nao correspondo ao proposto no exercicio
    /*  
     *  se getAberto() entao
     *      setPagAtual(getPagAtual() + 10)
     *  senao
     *      escreva "o livro esta fechado"
     *  fim se
     */
        // if (this.getAberto()) {
        //     this.setPagAtual(this.getPagAtual() + 10);
        //     System.out.println("pág: " + this.getPagAtual());
        // } else {
        //     System.out.println("O livro esta fechado!");
        // }
        // -----------------------------------------------------


    // metodo proposto no exercicio
    /*
     * se getAberto() entao
     *      se (p <= getTotPaginas) entao
     *          setPagAtual(p)
     *          escreva pag + getPagAtual
     *      senao
     *          escreva pagina nao existente!
     *      fim se
     *      escreva "o livro esta fechado!"
     * fim se
     */
        if (this.getAberto()) {
            if (p <= this.getTotPaginas()) {
                this.setPagAtual(p);
                System.out.println("folheou " + this.getPagAtual() + " páginas");
            } else {
                System.out.println("página nao existente!");
            }            
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
            if (this.pagAtual != 0) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("voltou para pág: " + this.getPagAtual());
            } else {
                System.out.println("O livro esta na primeiira pág");
            }                
        } else {
            System.out.println("O livro esta fechado!");
        }
    }
}
