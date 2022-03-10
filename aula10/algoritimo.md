# Classe Pessoa

```
classe Pessoa
    // atributos
    privado nome: caractere
    privado idade: inteiro
    privado sexo: caractere

    // metodos
    publico Metodo fazerAniv()
        setIdade(getIdade + 1)
    fimMetodo

    // matodos acessores
    publico Metodo getNome()
        retorna nome
    fimMetodo

    publico Metodo setNome(nome: caractere)
        nome = nome
    fimMetodo

    publico Metodo getIdade()
        retorna idade
    fimMetodo

    publico Metodo setIdade(idade: inteiro)
        idade = idade
    fimMetodo

    publico Metodo getSexo()
        retorna sexo
    fimMetodo

    publico Metodo setSexo(sexo: caractere)
        sexo = sexo
    fimMetodo
fimClasse
```

## Classe Aluno

```
Classe Aluno estende Pessoa
    // atributos
    privado matricula: booleano
    privado curso: caractere

    // metodos
    publico Metodo cancelarMatr()
        setMatricula(falso)
    fimMetodo

    // metodos acessores
    publico Metodo getMatricula()
        retorna matricula
    fimMetodo

    publico Metodo setMatricula(matricula: booleano)
        matricula = matricula
    fimMetodo

    publico Metodo getCurso()
        retorna curso
    fimMetodo

    publico Metodo setCurso(curso: caractere)
        caractere = caractere
    fimMetodo
fimClasse
```

## Classe Funcionario

```
Classe Funcionario estende Pessoa
    // atributos
    privado setor: caractere
    privado trabalhando: booleano

    // metodos
    publico Metodo mudarTrabalho()
        setTrabalhando(falso)
    fimMetodo

    publico Metodo getSetor()
        retorna setor
    fimMetodo

    publico Metodo setSetor(setor: caractere)
        setor = setor
    fimMetodo

    publico Metodo getTrabalhando()
        retorna trabalhando
    fimMetodo

    publico Metodo setTrabalhando(trabalhando: booleano)
        trabalhando = trabalhando
    fimMetodo
fimClasse
```

## Classe Professor

```
Classe Professor estende Pessoa
    // atributos
    privado especialidade: caractere
    privado salario: float

    // metodos
    publico Metodo receberAumento(aumento: float)
        setSalario(getSalario + aumento)
    fimMetodo

    publico Metodo getEspecialidade()
        retorna especialidade
    fimMetodo

    publico Metodo setEspecialidade(especialidade: caractere)
        especialidade = especialidade
    fimMetodo

    publico Metodo getSalario()
        retorna salario
    fimMetodo

    publico Metodo setSalario(salario: float)
        salario = salario
    fimMetodo
fimClasse
```