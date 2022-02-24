# Exercício Prático

De acordo com o diagrama proposto, monte o programa a seguir e suas respectivas classes:

<!-- ![Diagrama UML do Exercício. Fonte: Curso em Vídeo (Youtube)](https://github.com/eliasalbuquerque/poo-java/blob/main/aula09/diagramaUML.png "Curso em Vídeo") -->

![diagramaUML](https://user-images.githubusercontent.com/78819295/155617840-773b9e90-4d1f-4d02-99f6-79a441074edb.png)


### Passo a passo:

- Criar as classes: Pessoa e Livro
- Criar a interface: Publicacao
- A Interface Publicacao deve ser *publica* do tipo *abstract*
- Na Clase Pessoa:
    - Montar atributos *privados*
    - Montar o *Construtor Pessoa* (nome, idade, sexo) 
    - Getters e Setters
    - O metodo *fazerAniver( )* náo é necessário implementar no projeto
- Na Classe Livro
    - Montar atributos *privados* + atributo *leitor* da Classe Pessoa
    - Montar o *Construtor Livro* (titulo, autor... etc.) 
        - o livro sempre comeca *fechado*
        - a pag atual sempre inicia em zero
    - Getters e Setters
    - No metodo *detalhes( )* apresentar todas as informacoes do livro, inclusive quem os lê
    - Escrever os metodos abstratos
        - no metodo *folhear( )* é esperado um valor de página como parametro
