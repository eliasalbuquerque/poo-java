package aula05;


public class Aula05 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(123456);
        pessoa1.setDono("Guanabara");
        pessoa1.abrirConta("cc");
        pessoa1.depositar(100);
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(987654);
        pessoa2.setDono("Maria");
        pessoa2.abrirConta("cp");
        pessoa2.sacar(500);

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}
