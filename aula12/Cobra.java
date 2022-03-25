package aula12;

public class Cobra extends Reptil {
    
    @Override
    public void alimentar() {
        System.out.println("Comendo outros animais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nao emite som");
    }
}
