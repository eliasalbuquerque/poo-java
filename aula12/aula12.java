package aula12;

public class aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        System.out.println("---------\n- Manifero");
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println("---------\n- Peixe");
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        System.out.println("---------\n- Ave");
        a.setPeso(.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        System.out.println("---------\n- Canguru");
        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        System.out.println("---------\n- Cachorro");
        k.setPeso(.89f);
        k.setIdade(2);
        k.setMembros(2);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
    }
    
}
