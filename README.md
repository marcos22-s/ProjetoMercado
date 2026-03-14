# 🛒 Sistema de Gestão de Vendas - "Mercadinho do Seu Zé"

Este é um projeto prático desenvolvido em **Java** para consolidar conceitos fundamentais de lógica de programação, manipulação de coleções e formatação de dados. O sistema simula o fechamento de um caixa de supermercado via console.

## 🚀 Funcionalidades

- **Entrada Dinâmica:** Permite a inserção de múltiplos produtos (nome e preço) até que o usuário decida encerrar.
- **Armazenamento:** Utiliza `ArrayList` para manter o histórico dos itens comprados.
- **Cálculos Automáticos:**
    - Soma total da compra acumulada em tempo real.
    - Cálculo da média de preço por item.
    - Sistema de desconto (10% de desconto para compras acima de R$ 100,00).
- **Formatação Profissional:** Uso da classe `DecimalFormat` para exibir valores monetários no padrão de duas casas decimais.
- **Cupom Fiscal:** Exibição de um relatório final detalhado com todos os itens e o fechamento da conta.

## 🛠️ Tecnologias Utilizadas

* **Java JDK 11+**
* **Scanner:** Para entrada de dados do usuário.
* **ArrayList:** Para gerenciamento de listas dinâmicas.
* **Estruturas de Repetição:** `while` para o fluxo principal e `for-each` para o relatório final.

## 📝 Como Rodar o Projeto

1. Certifique-se de ter o Java instalado em sua máquina.
2. Copie o código do arquivo `ProjetoGestaoVendas.java`.
3. Compile o arquivo:
   ```bash
   javac ProjetoGestaoVendas.java
