package aula11;

public class Bolsista extends Aluno {
    private float bolsa;
    private boolean mensalidade;


    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public boolean getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }


    public void renovarBolsa() {
        System.out.println("Renovando bolsa de "+ this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsista "+ this.getNome());
    }
}
