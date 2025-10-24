# Material 06 - Herança Múltipla

## 🧩 1. O que é Herança Múltipla

**Herança múltipla** ocorre quando uma classe **herda de mais de uma superclasse**.

Em linguagens que permitem isso (como C++), ficaria assim:

```cpp
class A { ... }
class B { ... }
class C : public A, public B { ... }
```

A classe `C` herda **atributos e métodos** de `A` e `B`.

---

## 🚫 2. Java **não permite herança múltipla de classes**

Em Java, **uma classe só pode herdar de uma única classe base**:

```java
public class Filho extends Pai { ... } // ✅ permitido
public class Filho extends Pai1, Pai2 { ... } // ❌ proibido
```

---

### 💡 Por quê?

Porque **herança múltipla de classes gera ambiguidade** — especialmente no caso de métodos com o mesmo nome herdados de diferentes superclasses.

Esse é o famoso **“problema do diamante”**:

```
    A
   / \
  B   C
   \ /
    D
```

Se `A` define um método `falar()` e `B` e `C` o sobrescrevem, quando `D` herda de ambos, **qual versão de `falar()` deve ser usada?**

➡️ Java evita esse problema **proibindo** herança múltipla de classes.

---

## ✅ 3. Mas Java permite **herança múltipla de interfaces**

Em Java, **interfaces podem herdar de múltiplas outras interfaces**, e **classes podem implementar várias interfaces**.

```java
public interface A {
    void metodoA();
}

public interface B {
    void metodoB();
}

public class C implements A, B {
    @Override
    public void metodoA() {
        System.out.println("Implementação de A");
    }

    @Override
    public void metodoB() {
        System.out.println("Implementação de B");
    }
}
```

👉 Aqui, `C` tem herança múltipla de **comportamentos (contratos)**, mas **não de implementação** — ou seja, sem conflitos de código.

---

## 🧠 4. O papel dos métodos `default`

A partir do **Java 8**, interfaces podem ter **métodos com implementação (`default`)**, o que **introduz herança múltipla de comportamento**.

Isso permite que uma classe implemente **múltiplas interfaces com métodos prontos**, e se houver conflito, ela **decide qual usar** (como vimos no exemplo do *Pato*).

---

### 🧩 Exemplo de herança múltipla com `default`

```java
public interface A {
    default void falar() {
        System.out.println("A falando");
    }
}

public interface B {
    default void falar() {
        System.out.println("B falando");
    }
}

public class C implements A, B {
    @Override
    public void falar() {
        System.out.println("Resolvendo conflito:");
        A.super.falar(); // ou B.super.falar()
    }
}
```

Saída:

```
Resolvendo conflito:
A falando
```

---

## 🏗️ 5. Herança múltipla + classe base abstrata

Você pode combinar uma **classe abstrata (com estado e comportamento base)** com **interfaces (contratos e comportamentos opcionais)**:

```java
public abstract class Animal {
    public abstract void emitirSom();
}

public interface Voador {
    default void mover() {
        System.out.println("Voando...");
    }
}

public interface Nadador {
    default void mover() {
        System.out.println("Nadando...");
    }
}

public class Pato extends Animal implements Voador, Nadador {
    @Override
    public void emitirSom() {
        System.out.println("Quack!");
    }

    @Override
    public void mover() {
        System.out.println("O pato pode:");
        Voador.super.mover();
        Nadador.super.mover();
    }
}
```

---

## 🧾 6. Resumo

| Tipo de Herança                  | Permitido em Java | Exemplo                         | Observações                         |
| -------------------------------- | ----------------- | ------------------------------- | ----------------------------------- |
| **De classe**                    | ❌                 | `class A extends B, C`          | Proibida (evita ambiguidade)        |
| **De interface**                 | ✅                 | `class X implements A, B`       | Pode implementar várias interfaces  |
| **De comportamento (`default`)** | ✅                 | Métodos `default` em interfaces | Deve resolver conflitos manualmente |
| **De estado (atributos)**        | ❌                 | Apenas via uma superclasse      | Interfaces não têm estado           |

---

## 🎯 7. Em resumo

* Java **não permite herança múltipla de classes**, mas **permite herança múltipla de interfaces**.
* Interfaces podem conter **métodos `default`** para fornecer implementação comum.
* Em caso de conflito entre métodos `default`, a classe **precisa sobrescrever e resolver**.
* Esse modelo combina o melhor dos dois mundos: **flexibilidade** e **segurança**.

