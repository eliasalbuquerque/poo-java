package aula03;

public class Aula03 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80; //** Atributo protegido
        // c1.tampada = false; //** Atributo privado: Apenas os metodos da classe Caneta tem acesso para modificar esse atributo
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}

