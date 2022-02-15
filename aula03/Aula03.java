package aula03;

public class Aula03 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 10.6 f;
        c1.tampar();
        // c1.destampar();
        c1.status(); 
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.modelo = "Merchandizing";
        c2.cor = "Vermelho";
        c2.destampar();
        c2.status(); 
        c2.rabiscar();
    }
}

