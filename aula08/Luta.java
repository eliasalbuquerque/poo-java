package aula08;

import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    // metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return  aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    // metodos
    public void marcarLuta(Lutador l1 , Lutador l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);;
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }            
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("#################");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("##################");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            // vencedor = aleatorio(0..2)
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0: // empate
                    System.out.println("##########");
                    System.out.println("# Empatou!");
                    System.out.println("##########");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            
                case 1: // desafiado vence
                    System.out.println("######################################");
                    System.out.println("# E o vencedor foi: " + this.desafiado.getNome());
                    System.out.println("######################################");  
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // desafiante vence
                    System.out.println("######################################");
                    System.out.println("# E o vencedor foi: " + this.desafiante.getNome());
                    System.out.println("######################################");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("############################");
            System.out.println("# A luta nao pode acontecer!");
            System.out.println("############################");
        }
    }
}
