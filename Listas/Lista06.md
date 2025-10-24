## Lista de Exercícios 06 - Interface & Herança Múltipla com métodos DEFAULT

---

### **1. Sistema de Filtragem de Produtos**

Crie as interfaces:

* `FiltravelPorPreco` (com método `default` que filtra produtos abaixo de um valor);
* `FiltravelPorCategoria` (com método `default` que filtra produtos por categoria).

Crie uma classe `Produto` com `nome`, `preco` e `categoria`, e uma classe `Estoque` que implementa ambas as interfaces.
Implemente lógica para aplicar múltiplos filtros sobre um `List<Produto>`.

> 💡 **Desafio:** combinar filtros em sequência (ex: filtrar por preço e depois por categoria).
> **Conceitos:** stream, listas, múltiplas interfaces com comportamento funcional.

---

### **2. Sistema de Pontuação de Jogadores**

Crie interfaces:

* `Pontuavel` (método `default` que soma pontos);
* `Penalizavel` (método `default` que aplica penalidades negativas).

Classe `Jogador` com `nome`, `pontuacao`.
Classe `Partida` mantém uma lista de jogadores e aplica ações diversas (pontos e penalidades) usando ambas as interfaces.

> 💡 **Desafio:** simular várias rodadas manipulando o estado dos objetos via métodos `default`.
> **Conceitos:** encapsulamento + regras de negócio sobre listas.

---

### **3. Processamento de Dados de Sensores**

Interfaces:

* `Conversor` (método `default` converte leitura bruta em valor real);
* `Filtrador` (método `default` remove valores fora de faixa).

Classe `Sensor` armazena uma lista de leituras (`double[]`) e aplica os métodos herdados para normalizar e filtrar dados.

> 💡 **Desafio:** encadear transformações sobre arrays numéricos.
> **Conceitos:** arrays, loops, transformação funcional com `default`.

---

### **4. Sistema de Notas de Alunos**

Interfaces:

* `CalculavelMedia` (método `default` calcula média de um vetor);
* `Aprovavel` (método `default` verifica aprovação pela média).

Classe `Aluno` com `nome` e `notas[]`.
Classe `Turma` com lista de alunos.
Implemente lógica para calcular aprovados e gerar relatório usando os métodos `default`.

> 💡 **Desafio:** criar métodos default genéricos que operam sobre diferentes tipos de coleções.
> **Conceitos:** herança múltipla + regras condicionais.

---

### **5. Catálogo de Filmes com Avaliações**

Interfaces:

* `Avaliavel` (método `default` para calcular média de avaliações);
* `FiltravelPorGenero` (método `default` para retornar filmes por gênero).

Classe `Filme` com atributos (`titulo`, `genero`, `avaliacoes[]`).
Classe `CatalogoFilmes` implementa ambas as interfaces e fornece busca e estatísticas.

> 💡 **Desafio:** operar com listas e médias, simulando funcionalidades reais de recomendação.
> **Conceitos:** composição de interfaces funcionais.

---

### **6. Sistema de Contas Bancárias**

Interfaces:

* `Depositavel` (método `default` adiciona saldo);
* `Sacavel` (método `default` reduz saldo);
* `Transferivel` (herda ambas e adiciona método `default` `transferir()` entre contas).

Classe `Conta` com `saldo` e `titular`.
Classe `Banco` gerencia várias contas e usa os métodos `default` para movimentações e extratos.

> 💡 **Desafio:** lógica transacional entre objetos.
> **Conceitos:** múltiplas interfaces em cadeia, regras de negócio e atualização de estado.

---

### **7. Sistema de Recomendação de Produtos**

Interfaces:

* `Classificavel` (método `default` classifica itens por nota);
* `Recomendavel` (método `default` retorna top N produtos recomendados).

Classe `Produto` e `Recomendador` que implementa ambas, manipulando listas com ordenação e seleção.

> 💡 **Desafio:** implementar ordenação manual (bubble sort ou selection sort) ou via `Comparator`.
> **Conceitos:** lógica de ordenação e interface funcional combinada.

---

### **8. Sistema de Controle de Frota**

Interfaces:

* `Abastecivel` (método `default` atualiza combustível);
* `Monitoravel` (método `default` calcula autonomia restante com base em consumo médio).

Classe `Veiculo` com `tanque`, `consumo` e `kmRodados`.
Classe `Frota` mantém uma lista de veículos e gera relatórios.

> 💡 **Desafio:** aplicar métodos default sobre todos os veículos e gerar estatísticas agregadas.
> **Conceitos:** processamento de listas, acúmulo de valores, abstração de comportamento.

---

### **9. Sistema de Votação Online**

Interfaces:

* `RegistravelVoto` (método `default` adiciona voto);
* `CalculavelResultado` (método `default` calcula percentual).

Classe `Candidato` com `nome` e `votos`;
Classe `UrnaEletronica` implementa ambas, manipula um vetor de candidatos e gera ranking.

> 💡 **Desafio:** somar votos e calcular percentuais dinamicamente.
> **Conceitos:** manipulação de vetores, agregação de dados.

---

### **10. Sistema de Gestão de Tarefas (Kanban)**

Interfaces:

* `FiltravelPorStatus` (método `default` que retorna tarefas por status);
* `OrdenavelPorPrioridade` (método `default` ordena por prioridade);
* `Exportavel` (método `default` gera texto de exportação).

Classe `Tarefa` com `titulo`, `status`, `prioridade`.
Classe `QuadroKanban` implementa todas as interfaces e oferece filtros, ordenação e exportação para um relatório simples (String formatada).

> 💡 **Desafio:** integração de múltiplas operações em sequência — filtrar, ordenar e exportar.
> **Conceitos:** herança múltipla real, manipulação de listas, encadeamento de métodos.

---
