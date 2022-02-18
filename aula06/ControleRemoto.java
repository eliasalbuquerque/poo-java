package aula06;


public class ControleRemoto implements Controlador{
    // atributos
    private int volume;
    private boolean ligado;
    private boolean audivel;


    // metodos especiais
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setAudivel(true);
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getAudivel() {
        return this.audivel;
    }

    public void setAudivel(boolean audivel) {
        this.audivel = audivel;
    }


    // metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenuVolume() {
        System.out.println("---- MENU ----");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta audivel? " + this.getAudivel());
        System.out.print("Volume: " + this.getVolume() + " ");

        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenuVolume() {
        System.out.println("Fechando menu do volume...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getAudivel())) {
            this.setAudivel(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getAudivel()) {
            this.setAudivel(false);            
        }
    }

}
