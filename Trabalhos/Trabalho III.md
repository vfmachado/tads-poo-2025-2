# Trabalho III: “Fuga dos Inimigos”

## DATA DE ENTREGA - APRESENTAÇÃO 28/11/2025

## Objetivo Geral
Desenvolver um jogo simples com múltiplas fases, onde o jogador deve alcançar um objetivo enquanto evita inimigos que se movimentam aleatoriamente. A cada nova fase, o número de inimigos e a velocidade do jogo aumentam.

---

## Requisitos Funcionais

- **Personagem Jogador:**
  - Controlado pelo usuário via teclado.
  - Começa em uma posição aleatória ou pré-definida.
  - A velocidade aumenta a cada fase.

- **Objetivo:**
  - Ponto de chegada do jogador.
  - Possui posição aleatória (diferente do jogador).

- **Inimigos:**
  - Aumentam em quantidade a cada fase.
  - Movimentam-se de forma aleatória.
  - Velocidade também aumenta com o avanço das fases.

- **Fases:**
  - Cada fase tem:
    - Mais inimigos.
    - Maior velocidade para todos os personagens.
  - Avanço de fase ocorre ao alcançar o objetivo.
  - Game Over se o jogador colidir com um inimigo.

- **Sistema de Jogo:**
  - Detecta colisões entre jogador e inimigos.
  - Detecta colisão entre jogador e objetivo.
  - Reinicia o jogo ou exibe "Game Over" em caso de colisão.
  - Avança para próxima fase ao atingir o objetivo.

---

## Estrutura Orientada a Objetos Sugerida

- `Jogo`: gerencia as fases, início e fim do jogo.
- `Fase`: representa uma fase, com informações de dificuldade.
- `Personagem` (classe base):
  - `Jogador`: controlado pelo usuário.
  - `Inimigo`: movimentação aleatória.
- `Objetivo`: representa o ponto final da fase.
- `Movimento`: lógica de movimentação dos personagens.


## Avaliação

| Critério                        | Peso |
|-------------------------------|------|
| Implementação da lógica do jogo | 3.0  |
| Uso correto de conceitos POO   | 3.0  |
| Organização e clareza do código| 2.0  |
| Criatividade e desafios extras | 1.0  |
| Apresentação                   | 1.0  |


## 💡 Sugestões de Desafios Extras

### 🧠 Inteligência dos Inimigos
- Fazer com que os inimigos persigam o jogador em vez de se moverem de forma aleatória (IA simples).
- Criar diferentes tipos de inimigos com comportamentos distintos:
  - Um persegue o jogador.
  - Outro se move mais rápido.
  - Outro teleporta entre pontos do mapa.

---

### 🔁 Sistema de Vida ou Continuação
- Adicionar um sistema de vidas ao jogador (ex: 3 vidas).
- Permitir que o jogador continue do início da fase atual após perder.

---

### 💥 Poderes ou Itens
- Criar itens no mapa que o jogador pode coletar, como:
  - Aumento de velocidade temporário.
  - Paralisação dos inimigos por alguns segundos.
  - Invisibilidade/invulnerabilidade temporária.

---
### 🔊 Sons e Efeitos Visuais
- Adicionar efeitos sonoros para eventos do jogo:
  - Colisão com inimigo.
  - Vitória de fase.
  - Coleta de item.
- Incluir efeitos visuais, como:
  - Alterações de cor.
  - Animações de explosão.
  - Flash de alerta ao aproximar-se de um inimigo.

---

### 🌐 Salvar Progresso
- Permitir salvar e carregar o progresso entre sessões.
- Gravar a fase atual, pontuação e vidas restantes.

---