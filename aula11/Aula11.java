package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        Bolsista p2 = new Bolsista();
        Visitante p3 = new Visitante();

        p1.setNome("Claudio");
        p1.setMatricula(true);
        p1.setCurso("Iformatica");
        p1.setIdade(16);
        p1.setSexo("Masculino");
        p1.pagarMensalidade();
        
        p2.setNome("Jubileu");
        p2.setMatricula(true);
        p2.setBolsa(12.5f);
        p2.setSexo("Masculino");
        p2.pagarMensalidade();
        
        p3.setNome("Juvenal");
        p3.setIdade(22);
        p3.setSexo("Masculino");

        
        
        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        // System.out.println("verificacao de teste!!");
    }
}

