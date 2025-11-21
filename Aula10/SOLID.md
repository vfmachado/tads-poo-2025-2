
SOLID - principios 


S R P
    principio da responsabilidade unica
    Single Resposability Principle

    Uma classe/modulo/coponente deve ter apenas uma unica responsabilidade bem definida
    apenas um motivo para mudar


O C P
    Open/Closed Principle

    classes devem estar abertas para extensão e fechadas para modificação
     + adiciono mas nao altero


    A quem a interface serve?
        1 - a quem usa  ?   <- ganha e muito!!!
        2 - a quem implementa ?

    SISTEMA DE ECOMMERCE
        IENTREGA - TIPOS DE ENTREGA
        quem usa a interface entrega esta ganhando pq sabe qual o contrato(interface) e quais métodos estao disponiveis e que OBRIGATORIAMENTE as implementações devem seguir    

L 
    LISKOV SUBSTITUTION PRINCIPLE
    PRINCIPIO DA SUBSTITUICAO DE LISKOV

    Objetos de uma classe "filha" devem poder substituir objetos da classe "base"  sem quebrar o comportamento


I
    INTERFACE SEGREGATION PRINCIPLE
    PRINCIPIO DA SEGREGAÇÃO DE INTERFACE
        + INTERFACES DEVEM SER ESPECIFICAS
        + FAZERDEFINIR/POUCAS COISAS 

    diminuir o tamanho das interfaces!

    Situacao onde a classe que implementa a interface NAO PRECISA daquele metodo

D
    DEPENDENCY INVERSION PRINCIPLE
    PRINCIPIO DA INVERSAO DE DEPENDENCIAS

    classes de alto nivel nao devem depender de classes de baixo nivel
    