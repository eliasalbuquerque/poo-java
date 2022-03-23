package aula11;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;
    private boolean mensalidade;


    public Aluno() {
        this.mensalidade = false;
    }


    public void cancelarMatr() {
        this.setMatricula(false);
        System.out.println("Matricula cancelada!");
    }


    public void pagarMensalidade() {
        if (this.getMensalidade()) {
            System.out.println("Mensalidade do aluno em dia!");
        } else {
            this.setMensalidade(true);
            System.out.println("Pagando mensalidade de aluno "+ this.getNome());
        }
    }

    public boolean getMatricula() {
        return this.matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }    

    public boolean getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
