# Material 07 - Métodos default

## 🧩 O que são métodos `default` em Java

Um **método `default`** é um **método com implementação dentro de uma interface**.
Ele foi introduzido no **Java 8** para permitir que interfaces possam **evoluir** sem quebrar as classes que já as implementam.

---

### 🧠 Contexto antes do Java 8

Antes do Java 8, **interfaces** só podiam conter:

* Constantes (`public static final`)
* Métodos **abstratos** (sem corpo)

Ou seja:

```java
public interface Animal {
    void fazerSom(); // sem implementação
}
```

Qualquer classe que implementasse essa interface **precisava obrigatoriamente implementar todos os métodos**.

---

### ⚙️ A partir do Java 8

Com os **métodos `default`**, uma interface pode definir **um comportamento padrão**:

```java
public interface Animal {
    void fazerSom();

    default void dormir() {
        System.out.println("O animal está dormindo...");
    }
}
```

Agora, qualquer classe que implemente `Animal`:

* **precisa implementar** `fazerSom()`
* **pode usar ou sobrescrever** `dormir()`

---

### 🧪 Exemplo prático

```java
public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
```

Uso:

```java
Animal dog = new Cachorro();
dog.fazerSom(); // "Au au!"
dog.dormir();   // "O animal está dormindo..." (método default)
```

Se quisermos **modificar o comportamento**:

```java
public class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    @Override
    public void dormir() {
        System.out.println("O gato dorme enrolado...");
    }
}
```

---

## 🎯 Por que métodos `default` existem?

Eles permitem que **interfaces evoluam** sem quebrar implementações antigas.

Exemplo:
Se você tem uma interface usada por dezenas de classes, e quer adicionar um novo método, antes do Java 8 **todas precisariam ser alteradas**.
Com `default`, você pode adicionar o novo método **com uma implementação padrão**.

---

## 🔍 Diferença entre `default` e `abstract`

| Característica             | Método `default`         | Método `abstract`                         |
| -------------------------- | ------------------------ | ----------------------------------------- |
| Tem corpo (implementação)? | ✅ Sim                    | ❌ Não                                     |
| Pode ser sobrescrito?      | ✅ Sim                    | ✅ Sim                                     |
| Obrigatório implementar?   | ❌ Não                    | ✅ Sim                                     |
| Onde pode ser usado?       | Apenas em **interfaces** | Em **interfaces** e **classes abstratas** |

---

## ⚠️ Cuidados

1. **Conflitos de herança múltipla**
   Se uma classe implementar duas interfaces com o mesmo método `default`, é preciso **resolver o conflito** explicitamente:

   ```java
   public interface A { default void falar() { System.out.println("A"); } }
   public interface B { default void falar() { System.out.println("B"); } }

   public class C implements A, B {
       @Override
       public void falar() {
           A.super.falar(); // escolhe qual chamar
       }
   }
   ```

2. **Não confundir com método de instância comum**
   Métodos `default` pertencem a interfaces — não podem acessar estado interno de uma classe.

---

## 🧠 Em resumo

| Conceito                  | Descrição                                                          |
| ------------------------- | ------------------------------------------------------------------ |
| **O que é**               | Método com corpo dentro de uma interface                           |
| **Desde**                 | Java 8                                                             |
| **Objetivo**              | Permitir evolução de interfaces sem quebrar implementações antigas |
| **Pode ser sobrescrito?** | Sim                                                                |
| **Onde é usado**          | Apenas em interfaces                                               |

---

Perfeito 👌
Vamos então ver um **exemplo completo de herança múltipla com métodos `default` em interfaces**, mostrando como o Java lida com **conflitos de implementação**.

---

## 🧩 Cenário: Interfaces com o mesmo método `default`

Imagine duas interfaces diferentes — `Voador` e `Nadador` — que possuem um método `default` chamado `mover()`.

```java
public interface Voador {
    default void mover() {
        System.out.println("Voando pelos céus!");
    }
}
```

```java
public interface Nadador {
    default void mover() {
        System.out.println("Nadando pelo mar!");
    }
}
```

Agora criamos uma classe `Pato` que **implementa as duas interfaces**:

```java
public class Pato implements Voador, Nadador {

    // ⚠️ Conflito: as duas interfaces têm o mesmo método 'mover()'
    @Override
    public void mover() {
        // Precisamos decidir qual comportamento usar
        System.out.println("O pato pode se mover de várias formas:");
        Voador.super.mover();  // Chama o método default da interface Voador
        Nadador.super.mover(); // Chama o método default da interface Nadador
    }
}
```

---

### 🧪 Exemplo de uso

```java
public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.mover();
    }
}
```

**Saída:**

```
O pato pode se mover de várias formas:
Voando pelos céus!
Nadando pelo mar!
```

---

## ⚙️ Explicação passo a passo

1. As duas interfaces (`Voador` e `Nadador`) têm **métodos `default` com a mesma assinatura**.
2. Quando uma classe (`Pato`) implementa ambas, o Java **não sabe qual usar automaticamente** → isso gera um **erro de compilação** se o método não for sobrescrito.
3. Para resolver, é **obrigatório sobrescrever o método na classe** e, se desejado, chamar explicitamente o método de cada interface usando:

   ```java
   NomeDaInterface.super.nomeDoMetodo();
   ```

---

## ⚠️ Se o método não fosse sobrescrito

Se você tentasse compilar o código sem sobrescrever `mover()` em `Pato`, o compilador reclamaria com algo assim:

```
class Pato inherits unrelated defaults for mover() from types Voador and Nadador
```

Ou seja, o Java **exige que você resolva o conflito explicitamente**.

---

## 💡 Variação: escolhendo apenas uma interface

Você também pode escolher **um único comportamento padrão**:

```java
@Override
public void mover() {
    Voador.super.mover(); // apenas comportamento de Voador
}
```

Saída:

```
Voando pelos céus!
```

---

