| Classe ContaBanco |
| --- |
| + numConta |
| # tipo | <!-- cc = corrente; cp = poupanca; -->
| - dono |
| - saldo |
| - status | <!-- true = conta aberta; false = sem conta aberta; -->
| + abrirConta() | 
| + fecharConta() | <!-- nao pode ter saldo na conta -->
| + depositar() |
| + sacar() | <!-- tem que ter saldo -->
| + pagarMensalidade() | <!-- cc = -R$12; cp = -R$20 -->
| getnumConta() |
| setnumConta() |
| getTipo() |
| setTipo() |
| getDono() |
| setDono() |
| getSaldo() |
| setSaldo() |

---

```
Classe ContaBanco

    // atributos
    publico numConta: inteiro
    protegido tipo: caractere
    privado dono: caractere
    privado saldo: real
    privado status: logico


    // metodos
    publico Metodo abrirConta(t: caractere)
        setTipo(t)
        setStatus(verdadeiro)

        se (t = "cc") entao
            setSaldo(50)
        senao se (t = "cp") entao
            setSaldo(150)
        FimSe
    FimMetodo

    publico Metodo fecharConta()
        se (saldo > 0) entao
            Escreva ("Conta com dinheito)"
        senao se (saldo < 0) entao
            Escreva ("Conta em débito")
        senao
            setStatus(false)
    FimMetodo

    publico Metodo depositar(v: real)
        se (status = verdadero) entao
            setSaldo(getSaldo() + v)
        senao
            Escreva("Impossivel depositar")
    FimMetodo

    publico Metodo sacar()
        se getStatus(verdadeiro) entao
            se (saldo > v) entao
                setSaldo(getSaldo - v)
            senao
                Escreva ("Saldo insuficiente")
            FimSe
        senao
            Escreva ("Impossivel sacar")
        FimSe
    FimMetodo

    publico Metodo pagarMensalidade()
        // definir o valor da taxa
        vavr v: real
        se getTipo("cc") entao
            v = 12
        senao se (tipo = "cp") entao
            v = 20
        FimSe

        se getStatus(verdadeiro) entao
            se (saldo > v) entao
                getTipo() - v
            senao
                Escreva ("Saldo insuficiente")
            FimSe
        senao
            Escreva ("Impossivel pagar")
        FimSe            
    FimMetodo


    // metodos especiais
    publico Metodo Construtor()
        saldo = 0
        status = falso
    FimMetodo

    publico Metodo getnumConta()
        retorne numConta
    FimMetodo
    publico Metodo setnumConta(n: inteiro)
        numConta = n
    FimMetodo

    publico Metodo getTipo()
        retorne tipo
    FimMetodo
    publico Metodo setTipo(t: caractere)
        tipo = t
    FimMetodo

    publico Metodo getDono()
        retorne Dono
    FimMetodo
    publico Metodo setDono(d: caractere)
        dono = d
    FimMetodo

    publico Metodo getSaldo()
        retorne Saldo
    FimMetodo
    publico Metodo setSaldo(s: real)
        saldo = s
    FimMetodo

FimClasse
```
