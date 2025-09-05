# TRABALHO 01

## DATA APRESENTAÇÃO 19/09/2025 - ONLINE

DESENVOLVER OS 4 EXERCICIOS ABAIXO, CADA UM EM UMA PASTA DIFERENTE.
SE PREPARE PARA PERGUNTAS DO TIPO:
    - COMO VOCÊ IMPLEMENTOU DETERMINADA LÓGICA?
    - COMO PODERIA FAZER PARA MODIFICAR O COMPORTAMENTO DE DETERMINADO MÉTODO?


## Exercicio 1 // Máquina D'água


Implementar respeitando os fundamentos de Orientação a Objetos.

**Tópicos desta atividade:** abstrações, classes, objetos, construtores, validade, atributos, estado, comportamento, comandos e consultas, excepcionalidades e especificações.

---

Considere um máquina de água sofisticada. Ela é abastecida com uma Bombona de _20L_ e sempre que isso é realizado, um botão _abastecer água_ é pressionado, efetuando o _reset_ do contador para _20L_ (ou _20000mL_) disponíveis. A máquina também armazena internamente os copos descartáveis, com capacidades para _200mL_ e _300mL_, com um repositório de 100 unidades para cada. Feito os abastecimentos, os usuários servem-se de água pressionando os botões que servem _200mL_ ou _300mL_. A máquina automaticamente saca um copo e o enche de água. A máquina mostra no painel a quantidade de água e copos disponíveis. O pedido não é atendido quando um botão _servir_ é pressionado e não há água ou copo.

Dada esta especificação nosso analista projetou a seguinte interação conforme os Casos de Teste a seguir:

```java
MaquinaAgua maq = new MaquinaAgua();
System.out.println(maq.agua() == 0); // mL
System.out.println(maq.copos200() == 0);
System.out.println(maq.copos300() == 0);

maq.servirCopo200(); // não efetua, pois não há copo nem água

System.out.println(maq.agua() == 0); // mL
System.out.println(maq.copos200() == 0); // unidades
System.out.println(maq.copos300() == 0); // unidades

maq.abastecerAgua(); // inicializa 20000mL
System.out.println(maq.agua() == 20000); // mL

maq.abastecerAgua(); // mantém consistente
System.out.println(maq.agua() == 20000); // mL

maq.servirCopo200(); // não efetua, sem copo
System.out.println(maq.agua() == 20000); // mL

System.out.println(maq.copos200() == 0);
maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200
System.out.println(maq.copos200() == 100);

maq.servirCopo200(); // -200
maq.servirCopo200(); // -200
maq.servirCopo200(); // -200
maq.servirCopo200(); // -200
maq.servirCopo200(); // -200, isto é, -1000ml e 5 copos de 200

System.out.println(maq.agua() == 19000);
System.out.println(maq.copos300() == 0);
System.out.println(maq.copos200() == 95);
maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200 novamente
System.out.println(maq.copos200() == 100);

maq.servirCopo200(); // -200ml e 1 copo de 200
System.out.println(maq.agua() == 18800);
System.out.println(maq.copos200() == 99);

System.out.println(maq.copos300() == 0);
maq.servirCopo300(); // não efetua, não há copo 300
maq.abastecerCopo300(); // agora a máquina possui 100 copos de 300
System.out.println(maq.copos300() == 100);
maq.servirCopo300(); // agora efetua
System.out.println(maq.agua() == 18500);
System.out.println(maq.copos200() == 99);
System.out.println(maq.copos300() == 99);

// servir 50 copos de 300 = -15000ml
for (int i = 0; i < 50; i++) maq.servirCopo300();

System.out.println(maq.agua() == 3500);
System.out.println(maq.copos200() == 99);
System.out.println(maq.copos300() == 49);

// servir 17 copos de 200 = 3400ml
for (int i = 0; i < 17; i++) maq.servirCopo200();

System.out.println(maq.agua() == 100);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 49);

// não há água para atender o pedido
maq.servirCopo300();
System.out.println(maq.agua() == 100);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 49);

// não há água para atender o pedido
maq.servirCopo200();
System.out.println(maq.agua() == 100);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 49);

maq.abastecerAgua(); // inicializa 20000mL
System.out.println(maq.agua() == 20000);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 49);

// servir os 49 copos de 300 restantes = 14700ml
while (maq.copos300() > 0) maq.servirCopo300();

System.out.println(maq.agua() == 5300);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 0);

// não há copo para atender o pedido
maq.servirCopo300();
System.out.println(maq.agua() == 5300);
System.out.println(maq.copos200() == 82);
System.out.println(maq.copos300() == 0);

maq.servirCopo200(); // de 200 ok
maq.servirCopo200(); // de 200 ok

System.out.println(maq.agua() == 4900);
System.out.println(maq.copos200() == 80);
System.out.println(maq.copos300() == 0);

maq.abastecerCopo300(); // 100 copos de 300
System.out.println(maq.agua() == 4900);
System.out.println(maq.copos200() == 80);
System.out.println(maq.copos300() == 100);

// servir 3 copos de 300
maq.servirCopo300(); maq.servirCopo300(); maq.servirCopo300();

System.out.println(maq.agua() == 4000);
System.out.println(maq.copos200() == 80);
System.out.println(maq.copos300() == 97);
```

---
Obs.: os casos de teste não podem ser alterados, mas outros podem ser adicionados. Fique a vontade para adicionar códigos que imprimem ou separam os testes, por exemplo.



## Exercício 2 // Forno


Implementar respeitando os fundamentos de Orientação a Objetos.

**Tópicos desta atividade:** abstrações, classes, objetos, construtores, validade, atributos, estado, comportamento, comandos e consultas, excepcionalidades e especificações.

---

Considere um Forno sofisticado de controle via app Android/iOS. É possível ligar, desligar, ajustar temperatura e outros detalhes. Os modelos variam segundo seu volume, tensão, potência e dimensões (na forma largura, altura e profundidade em `cm`). Então, implemente conforme especificação a seguir.

Casos de Teste:

```java
Forno f = new Forno(45, 220, 1700, 66, 40, 54);
System.out.println(f.volume == 45);
System.out.println(f.tensao == 220);
System.out.println(f.potencia == 1700);
System.out.println(f.largura == 66);
System.out.println(f.altura == 40);
System.out.println(f.profundidade == 54);
// todos esses atributos devem ser constantes, as atribuções a seguir não podem compilar,
// verifique se estão protegidas e então comente estas linhas:
f.volume = 450;
f.tensao = 2200;
f.potencia = 17000;
f.altura = 400;
f.largura = 660;
f.profundidade = 540;

// Novo Forno
Forno forno = new Forno(84, 220, 1860, 61, 58, 58);
System.out.println(forno.volume == 84);
System.out.println(forno.tensao == 220);
System.out.println(forno.potencia == 1860);
System.out.println(forno.altura == 58);
System.out.println(forno.largura == 61);
System.out.println(forno.profundidade == 58);

// métodos para consulta
System.out.println(forno.temperatura()); // 0 (de 50 a 300)
System.out.println(forno.ligado()); // false
// os atributos temperatura e ligado devem ser inacessíveis (privados)
// não deve compilar, verifique e depois comente as seguintes linhas
System.out.println(forno.temperatura);
System.out.println(forno.ligado);

// interagindo com o forno (submetendo comandos ao objeto)
System.out.println(forno.ligado() == false);
forno.aumentarTemperatura(); // liga e vai para 50
System.out.println(forno.ligado() == true);
System.out.println(forno.temperatura() == 50); // 50
forno.aumentarTemperatura();
System.out.println(forno.temperatura() == 100); // 100
forno.aumentarTemperatura();
System.out.println(forno.temperatura() == 150); // 150
forno.aumentarTemperatura();
System.out.println(forno.temperatura() == 200); // 200
forno.aumentarTemperatura();
// é isso mesmo, há um step intermediário entre 200 e 250
System.out.println(forno.temperatura() == 220); // 220
forno.aumentarTemperatura();
System.out.println(forno.temperatura() == 250); // 250
forno.aumentarTemperatura();
System.out.println(forno.temperatura() == 300); // 300

forno.aumentarTemperatura(); // já está no máximo
System.out.println(forno.temperatura() == 300); // 300
System.out.println(forno.ligado() == true);

// reduzindo
forno.diminuirTemperatura();
forno.diminuirTemperatura();
forno.diminuirTemperatura();
System.out.println(forno.temperatura() == 200); // 200

// desligando direto
forno.desligar();
System.out.println(forno.ligado() == false);
System.out.println(forno.temperatura() == 0);

// já está desligado
forno.diminuirTemperatura();
System.out.println(forno.ligado() == false);
System.out.println(forno.temperatura() == 0);

// timer de 1 a 120 minutos
forno.setTimer(15); // minutos

forno.aumentarTemperatura();
forno.aumentarTemperatura();
forno.aumentarTemperatura();

System.out.println(forno.ligado() == true);
System.out.println(forno.temperatura() == 150);
System.out.println(forno.tempoRestante() == 15);

forno.tick(); // tick do timer (baixa 1min)
System.out.println(forno.tempoRestante() == 14);

// +4 ticks
forno.tick(); forno.tick(); forno.tick(); forno.tick();
System.out.println(forno.tempoRestante() == 10);
System.out.println(forno.ligado() == true);
System.out.println(forno.temperatura() == 150);

// +10 ticks e o forno é desligado ao fim do timer
forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
System.out.println(forno.tempoRestante() == 0);
System.out.println(forno.temperatura() == 0);
System.out.println(forno.ligado() == false);

// novo timer
forno.setTimer(120);
forno.aumentarTemperatura(); forno.aumentarTemperatura();
System.out.println(forno.ligado() == true);
System.out.println(forno.temperatura() == 100);
System.out.println(forno.tempoRestante() == 120);

while (forno.ligado()) forno.tick(); // tick até desligar

System.out.println(forno.tempoRestante() == 0);
System.out.println(forno.ligado() == false);
System.out.println(forno.temperatura() == 0);
```

---
Obs.: os casos de teste não podem ser alterados, mas outros podem ser adicionados. Fique a vontade para adicionar códigos que imprimem ou separam os testes, por exemplo.


## Exercicio 3 // Conta Bancaria & Transações

Uma conta bancária deve permitir depósitos, saques e consultas de saldo. Implemente uma classe `ContaBancaria` com os seguintes métodos:
- **depositar(double valor)**: Adiciona o valor ao saldo.
- **sacar(double valor)**: Remove o valor do saldo, se houver saldo suficiente.
- **consultarSaldo()**: Retorna o saldo atual.

Além disso, cada transação feita, deve ser registrada em um histórico. Implemente um método `getHistorico()` que retorna a lista de transações realizadas (depósitos e saques).

A transação também deve ser uma classe, chamada `Transacao`, com os seguintes atributos:
- `tipo` (String): "depósito" ou "saque"
- `valor` (double)
- `data` (LocalDateTime)


## Exercicio 4 // Biblioteca

### Classe `Biblioteca` com Listas de Objetos

**Descrição:**
Crie uma classe `Livro` com os seguintes atributos e respectivo métodos getters e setters:
- `titulo` (String)
- `autor` (String)
- `disponivel` (boolean)

Crie uma classe `Biblioteca` que tenha uma lista de livros como atributo. Implemente os seguintes métodos na classe `Biblioteca`:
- **AdicionarLivro(Livro livro)**: Adiciona um livro à lista.
- **EmprestarLivro(String titulo)**: Marca o livro como indisponível.
- **DevolverLivro(String titulo)**: Marca o livro como disponível.
- **ListarLivros()**: Exibe a lista de livros com seu status (disponível ou não).

**Tarefa:**
Crie um arquivo Main.java que teste a classe biblioteca. Adicione livros à biblioteca, empreste e devolva alguns, e exiba o estado dos livros usando o método `ListarLivros()`.
