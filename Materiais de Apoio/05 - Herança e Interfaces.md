# Material 05 - Herança e Interface

---

## 1️⃣ Revisão Rápida de Conceitos

* **Classe**: estrutura que define atributos (estado) e métodos (comportamentos).
* **Objeto**: instância de uma classe.
* **Encapsulamento**: proteger dados internos e expor apenas o necessário.

---

## 2️⃣ Herança

A **herança** permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse).

👉 Usada quando há uma **relação de especialização**:

* Um **Cachorro** é um **Animal**.
* Um **Carro** é um **Veículo**.

### Exemplo em Java:

```java
class Animal {
    void emitirSom() {
        System.out.println("O animal emite um som...");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        a.emitirSom(); // O cachorro late: Au Au!
    }
}
```

✔️ Aqui o `Cachorro` **herda** de `Animal` e redefine o comportamento.

---

## 3️⃣ Interfaces

Uma **interface** define um **contrato**: quais métodos uma classe deve implementar.

* Não possui implementação (apenas assinatura dos métodos).
* Uma classe pode implementar várias interfaces.
* Usada para **padronizar comportamentos**.

### Exemplo em Java:

```java
interface FormaGeometrica {
    double calcularArea();
}

class Quadrado implements FormaGeometrica {
    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo implements FormaGeometrica {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        FormaGeometrica f1 = new Quadrado(4);
        FormaGeometrica f2 = new Circulo(3);

        System.out.println(f1.calcularArea()); // 16.0
        System.out.println(f2.calcularArea()); // 28.27...
    }
}
```

✔️ Aqui tanto `Quadrado` quanto `Circulo` implementam a interface `FormaGeometrica`.

---

## 4️⃣ Diferenças entre Herança e Interface

| Característica   | Herança (`extends`)        | Interface (`implements`)               |
| ---------------- | -------------------------- | -------------------------------------- |
| Relação          | "É um(a)"                  | "Sabe fazer" ou "Tem comportamento de" |
| Quantidade       | Apenas **uma** superclasse | Pode implementar **múltiplas**         |
| Conteúdo herdado | Atributos e métodos        | Apenas métodos (contratos)             |
| Flexibilidade    | Menor (forte acoplamento)  | Maior (desacoplamento)                 |

---

## 5️⃣ Quando Usar?

* **Herança**: quando existe uma relação natural de **especialização**.
  Ex: `Gato` é um `Animal`.
* **Interface**: quando diferentes classes devem compartilhar **comportamentos comuns**, mas não têm relação direta.
  Ex: `Imprimível` pode ser implementado por `Relatório`, `NotaFiscal` e `Contrato`.

---

## 6️⃣ Exemplo Combinando Interface e Herança

```java
interface Voavel {
    void voar();
}

class Animal {
    void comer() {
        System.out.println("O animal está comendo...");
    }
}

class Pato extends Animal implements Voavel {
    @Override
    public void voar() {
        System.out.println("O pato está voando baixo...");
    }
}
```

✔️ O **Pato** herda atributos de **Animal** e ainda implementa o contrato de **Voável**.

---

## 7️⃣ Exercícios Propostos

1. Crie uma classe `Funcionario` com atributos `nome` e `salario`.

   * Crie subclasses `Gerente` e `Desenvolvedor` que herdam de `Funcionario`.
   * Sobrescreva um método `calcularBonus()` em cada uma.

2. Crie uma interface `Autenticavel` com o método `login(String senha)`.

   * Implemente em uma classe `Usuario`.
   * Faça um programa que simula o login.

3. Modele um exemplo com **herança + interface**:

   * Classe base `Veiculo`.
   * Subclasse `Carro`.
   * Interface `Eletrico` (com método `carregarBateria()`).
   * `CarroEletrico` herda de `Carro` e implementa `Eletrico`.

---


## 📚 Referências

* **Herança e Polimorfismo em Java** – Deitel, *Java: How to Program*.
* **Effective Java** – Joshua Bloch.
* **Head First Java** – Kathy Sierra, Bert Bates.
