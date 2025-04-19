# 💸 Simulador de Saque Bancário (ATM Notes Calculator)

Este projeto foi retirado de um exercício:
Faça um programa que simula um caixa eletrônico. O usuário deve informar o valor(inteiro) e o programa
vai mostras quantas notas de R$100, R$50, R$20, R$10, R$5, R$2 são necessárias para compor esse valor:

Regras:
Sempre usar o menor número de notas possíveis.
Usar somente if, while e atributos

Simulador de saque bancário, desenvolvido em Java, com o objetivo de calcular a menor quantidade possível de cédulas necessárias para um valor inserido pelo usuário.

---

## 🎯 Objetivo

Simular a lógica de um caixa eletrônico que distribui o valor solicitado utilizando o menor número possível de notas, considerando os seguintes valores disponíveis:



O sistema também verifica se o valor inserido é válido (positivo e múltiplo de 2).

---

## ⚙️ Funcionalidades

- Inserção de valor pelo console.
- Verificação se o valor é válido.
- Cálculo de quantidade de cédulas por valor.
- Exibição de quantas cédulas de cada tipo são utilizadas.
- Separação da lógica de verificação, exibição e cálculo.

---

## 🧠 Boas práticas aplicadas

- Princípio da Responsabilidade Única (SRP)
- Uso de interfaces para abstração de comportamento
- Separação entre entrada, validação, processamento e saída
- Organização em múltiplas classes reutilizáveis
- Código limpo e modular

---

## ▶️ Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

📌 Exemplo de uso:

insira um valor
376

Verificando valor...
Seu valor guarda: 3 notas de 100
Seu valor guarda: 1 notas de 50
Seu valor guarda: 1 notas de 20
Seu valor guarda: 1 notas de 5
