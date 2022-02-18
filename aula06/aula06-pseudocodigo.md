# Interface Controlador

// metodos abstratos
interface Controlador
    publico abstrato Metodo ligar()
    publico abstrato Metodo desligar()
    publico abstrato Metodo abrirMenu()
    publico abstrato Metodo fecharMenu()
    publico abstrato Metodo maisVolume()
    publico abstrato Metodo menosVolume()
    publico abstrato Metodo ligarMudo()
    publico abstrato Metodo desligarMudo()
    publico abstrato Metodo play()
    publico abstrato Metodo pause()
FimInterface

# Classe Controle Remoto

Classe ControleRemoto
    // atributos
    privado inteiro volume
    privado logico ligado
    privado logico audivel

    // metodos especiais
    publico Metodo Construtor()
        volume = 50
        ligado = true
        audivel = true

    privado Metodo getVolume()
    privado Metodo setVolume()

    privado Metodo getLigado()
    privado Metodo setLigado()

    privado Metodo getAudivel()
    privado Metodo setAudivel()

    // sobrescrevendo metodos (metodos abstratos)
    publico Metodo ligar()
        setLigado(verdadeiro)
    publico Metodo desligar()
        setLigado(falso)

    publico Metodo abrirMenuVolume()
        Escreva(getLigado())
        Escreva(getVolume())
        Para i = 0 ate getVolume() passo 10 faca
            Escreva("|")
        FimPara
        Escreva(getAudivel())
    FimMetodo

    publico Metodo fecharMenuVolume()
        Escreva("Fechando Menu...")
    FimMetodo

    publico Metodo maisVolume()
        se (getLigado()) entao
            setVolume(getVolume() + 1)
        FimSe
    FimMetodo

    publico Metodo menosVolume()
        se (getLigado()) entao
            setVolume(getVolume() - 1)
        FimSe
    FimMetodo

    publico Metodo ligarMudo()
        se (getLigado()) e getVolume() > 0) entao
            setVolume(0)
        FimSe
    FimMetodo

    publico Metodo desligarMudo()
        se (getLigado() e getVolume() = 0) entao
            setVolume(50)
        FimSe
    FimMetodo

    publico Metodo play()
        se (getLigado() e !getAudivel) entao
            setAudivel(verdadeiro)
        FimSe
    FimMetodo

    publico Metodo pause()
        se (getLigado() e getAudivel) entao
            setAudivel(falso)
        FimSe
    FimMetodo

FImClasse