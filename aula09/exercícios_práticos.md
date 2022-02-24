# Exercício Prático

De acordo com o diagrama proposto, monte o programa a seguir e suas respectivas classes:

![diagramaUML](C:\workspace\poo-java\aula09\diagramaUML.png "Fonte: Curso em Vídeo (Youtube)")


### Passo a passo:

- Criar as classes: Pessoa, Livro
- Criar a interface: Publicacao
- A *Interface Publicacao* deve *publica* do tipo *abstract*
- Na *Clase Pessoa*:
    - Montar atributos *privados*
    - Montar o *Construtor Pessoa* (nome, idade, sexo) 
    - Getters e Setters
- Na *Classe Livro*
    - Montar atributos *privados* + atributo *leitor* da Classe Pessoa
    - Montar o *Construtor Livro* (titulo, autor... etc.) 
        - o livro sempre comeca *fechado*
        - a pag atual sempre inicia em zero
    - Getters e Setters
    - Escrever os metodos abstratos
        - no metodo *folhear()* é esperado um valor de pag como parametro