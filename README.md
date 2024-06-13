# Sistema Bancário Digital

Este projeto é uma implementação de um sistema bancário digital em Java, utilizando os conceitos de Orientação a Objetos (OO). Ele permite a criação de contas correntes e poupança, realização de depósitos, saques e transferências, além de gerenciar clientes e contas em um banco.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes e interface:

- **Banco**
  - Gerencia os clientes e suas contas.
- **Cliente**
  - Representa um cliente do banco.
- **Conta (abstrata)**
  - Implementa a interface `IConta` e serve como base para `ContaCorrente` e `ContaPoupanca`.
- **ContaCorrente**
  - Especialização de `Conta` com funcionalidade de taxa de operação.
- **ContaPoupanca**
  - Especialização de `Conta` com funcionalidade de rendimento de juros.
- **IConta (interface)**
  - Define os métodos comuns a todas as contas.
- **Main**
  - Classe principal para execução do programa.

## Funcionalidades

- **Conta**
  - Depósito
  - Saque
  - Transferência
- **ContaCorrente**
  - Saque e transferência com taxa de operação
- **ContaPoupanca**
  - Rendimento de juros
- **Banco**
  - Adição de clientes
  - Busca de clientes por CPF
