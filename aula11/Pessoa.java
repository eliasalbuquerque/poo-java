package aula11;

abstract class Pessoa {
    private String nome, sexo;
    private int idade;

    
    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Dados [nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + "]";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
 
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }    
}

