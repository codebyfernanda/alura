# 🏦 Desafio: Simulador de Operações Bancárias

Este projeto foi desenvolvido como um desafio prático para consolidar conceitos fundamentais da linguagem **Java**. A aplicação simula o gerenciamento de uma conta bancária via console (CLI), que simula o funcionamento simplificado de operações financeiras básicas em um loop contínuo. O foco principal é a prática de Lógica de Programação, Controle de Fluxo e Interação com o Usuário.

## 📋 Sobre o Projeto

O objetivo principal foi criar um sistema que gerencia os dados de um cliente e permite interações em tempo real. O foco foi aplicar lógica de programação, controle de fluxo e manipulação de entrada de dados.

### Objetivos implementados:
* **Cabeçalho Dinâmico:** Exibição dos dados do cliente (Nome, Tipo de Conta e Saldo Inicial).
* **Menu de Operações:** Interface via terminal com 4 opções principais.
* **Gestão de Saldo:**
    * `Consultar Saldo`: Visualização rápida do montante atual.
    * `Enviar PIX (Saída)`: Verificação de saldo suficiente antes da transação.
    * `Receber PIX (Entrada)`: Incremento automático ao saldo.
* **Controle de Loop:** O menu permanece ativo até que o usuário escolha a opção de saída.
* **Validação:** Mensagens de erro para opções inválidas no menu.

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Scanner API:** Para leitura e interação com o usuário via console.
* **Estruturas de Repetição e Condicionais:** `while`, `if/else` e `switch case` (na versão 2 do desafio, presente nesta pasta)

## 🧠 Aprendizados

Durante o desenvolvimento deste desafio, pude reforçar:
* A importância da **tipagem de dados** em Java (especialmente `double` para operações financeiras).
* Manipulação do buffer do `Scanner` para evitar erros de leitura.
* Lógica de acumulação de valores (`+=` e `-=`).

---
⭐ *Projeto desenvolvido como um reforço dos estudos em Análise e Desenvolvimento de Sistemas.*

---
