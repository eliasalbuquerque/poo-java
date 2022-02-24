package aula09;

public class aula09 {    
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Maria", 25, "Feminino");

        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avancado", "Maria Candido", 800, p[0]);



        int livro = 2;

        System.out.println("-------- Detalhes --------");
        System.out.println(l[livro].detalhes());
        l[livro].abrir();
        l[livro].folhear(300);
        l[0].voltarPag();
        l[0].abrir();
        l[livro].avancarPag();
        l[livro].fechar();

    }
}