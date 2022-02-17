package aula05;


public class ContaBanco {

    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    // verificar os estado atual dos metodos
    public void estadoAtual() {
        System.out.println("-------DADOS-------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus()); 
    }


    // metodos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo == "cc") {
            this.setSaldo(50);
        } else if (tipo == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta FECHADA com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);            
            System.out.println("Deposito realizado na contar de: " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em conta invalida!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque relizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta inexistente!");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;            
        } else if (this.getTipo() == "cp") {
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Taxa de mensalidade em dia");
            } else {
                System.out.println("Saldo insuficiente para devitar taxa de mensalidade!");
            }            
        } else {
            System.out.println("Nao há conta aberta a ser texada");
        }
    }


    // metodos construtores
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }    

    // metodos getters e setters
    public Integer getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // public boolean isStatus() {
    //     return this.status;
    // }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
