package aula04;


public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    // metodo construtor
    public Caneta(String m, String c, float p) { 
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampada = true;
    }

    // metodos assessores e modificadores
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo (String m) {
         this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta (float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor (String c) {
        this.cor = c;
    }

    public boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(boolean t) {
        this.tampada = t;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
        System.out.println("----------------");
    }



    
    
}
