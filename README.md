# 💸 Simulador de Saque Bancário (ATM Notes Calculator)

<strong>Este projeto foi retirado de um exercício:</strong> <br>
   Faça um programa que simula um caixa eletrônico. O usuário deve informar o valor(inteiro) e o programa
   vai mostras quantas notas de R$100, R$50, R$20, R$10, R$5, R$2 são necessárias para compor esse valor:



<strong> Regras:</strong> <br>
- Sempre usar o menor número de notas possíveis. <br>
- Usar somente if, while e atributos

---

## 🎯 Objetivo

Simular a lógica de um caixa eletrônico que distribui o valor solicitado utilizando o menor número possível de notas, considerando os seguintes valores disponíveis: R$100, R$50, R$20, R$10, R$5, R$2



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
   
<br>
2. Executo o Main: <br>
   
      Navegue, já dentro do pasta clonada, até src/CashWithDrawSystem/Main e execute Main.
   
📌 Exemplo de uso:

insira um valor
376

Verificando valor...
Seu valor guarda: 3 notas de 100
Seu valor guarda: 1 notas de 50
Seu valor guarda: 1 notas de 20
Seu valor guarda: 1 notas de 5
