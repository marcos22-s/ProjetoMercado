<h1 align="center">🛒 Mercadinho do Seu Zé</h1>

<h3 align="center">
Sistema de Gestão de Vendas desenvolvido em Java
</h3>

<p align="center">
Simulação de um caixa de supermercado via terminal (console)
</p>

<p align="center">

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>

<img src="https://img.shields.io/badge/Console%20Application-gray?style=for-the-badge"/>

<img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge"/>

</p>

<hr>

<h2>📘 Sobre o Projeto</h2>

<p>
O <strong>Mercadinho do Seu Zé</strong> é uma aplicação desenvolvida em <strong>Java</strong> que simula o funcionamento de um caixa de supermercado diretamente pelo terminal.
</p>

<p>
O sistema permite registrar produtos, calcular automaticamente o valor total da compra, aplicar descontos e gerar um relatório final semelhante a um cupom fiscal.
</p>

<p>
Este projeto foi desenvolvido para praticar conceitos fundamentais de programação como:
</p>

<ul>
<li>Lógica de programação</li>
<li>Manipulação de coleções</li>
<li>Entrada e processamento de dados</li>
<li>Cálculos automáticos</li>
<li>Formatação de valores monetários</li>
</ul>

<hr>

<h2>🎯 Objetivos do Projeto</h2>

<ul>
<li>Praticar programação em Java</li>
<li>Trabalhar com entrada de dados no console</li>
<li>Utilizar estruturas de repetição</li>
<li>Manipular listas dinâmicas</li>
<li>Realizar cálculos automáticos</li>
<li>Aplicar organização básica de código</li>
</ul>

<p>
O projeto simula um cenário real de registro de compras em um mercado.
</p>

<hr>

<h2>🚀 Funcionalidades</h2>

<h3>📥 Registro de Produtos</h3>

<p>O usuário pode registrar diversos produtos informando:</p>

<ul>
<li>Nome do produto</li>
<li>Preço do produto</li>
</ul>

<p>O sistema continuará solicitando novos produtos até que o usuário finalize a compra.</p>

<h3>🗂️ Armazenamento Dinâmico</h3>

<p>Os produtos são armazenados utilizando:</p>

<pre>
ArrayList
</pre>

<p>Isso permite armazenar uma quantidade ilimitada de itens.</p>

<h3>🧮 Cálculos Automáticos</h3>

<p>Durante a execução o sistema calcula automaticamente:</p>

<ul>
<li>Total da compra</li>
<li>Média de preço por item</li>
<li>Atualização do valor total em tempo real</li>
</ul>

<h3>💰 Sistema de Desconto</h3>

<p>Se o valor total da compra ultrapassar:</p>

<pre>
R$100,00
</pre>

<p>O sistema aplica automaticamente:</p>

<pre>
10% de desconto
</pre>

<h3>🧾 Cupom Fiscal</h3>

<p>Ao finalizar a compra o sistema exibe um relatório contendo:</p>

<ul>
<li>Lista de produtos</li>
<li>Preço de cada item</li>
<li>Total da compra</li>
<li>Desconto aplicado</li>
<li>Valor final</li>
</ul>

<hr>

<h2>🛠 Tecnologias Utilizadas</h2>

<p align="left">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="60"/>
</p>

<ul>
<li><strong>Java JDK 11+</strong></li>
<li>Scanner (entrada de dados)</li>
<li>ArrayList (armazenamento de produtos)</li>
<li>Estruturas de repetição</li>
<li>Formatação com DecimalFormat</li>
</ul>

<hr>

<h2>📂 Estrutura do Projeto</h2>

<pre>
Mercado
│
├── Mercado.java
└── README.md
</pre>

<p>Arquivo principal:</p>

<pre>
Mercado.java
</pre>

<p>Responsável por:</p>

<ul>
<li>Receber dados do usuário</li>
<li>Armazenar produtos</li>
<li>Calcular valores</li>
<li>Gerar relatório final</li>
</ul>

<hr>

<h2>▶️ Como Executar</h2>

<h3>1️⃣ Verificar instalação do Java</h3>

<pre>
java -version
</pre>

<h3>2️⃣ Clonar o repositório</h3>

<pre>
git clone https://github.com/marcos22-s/ProjetoMercado.git
</pre>

<h3>3️⃣ Entrar na pasta</h3>

<h3>4️⃣ Compilar o projeto</h3>

<pre>
javac ProjetoGestaoVendas.java
</pre>

<h3>5️⃣ Executar o programa</h3>

<pre>
java ProjetoGestaoVendas
</pre>

<hr>

<h2>🧪 Exemplo de Execução</h2>

<pre>
Digite o nome do produto:
Arroz

Digite o preço do produto:
25.90

Deseja adicionar outro produto? (s/n)
s

Digite o nome do produto:
Feijão

Digite o preço do produto:
8.50

Deseja adicionar outro produto? (s/n)
n

Resumo da Compra
------------------------
Arroz - R$ 25.90
Feijão - R$ 8.50

Total da compra: R$ 34.40
Média por item: R$ 17.20
</pre>

<hr>

<h2>📚 Conceitos de Programação Aplicados</h2>

<ul>
<li>Variáveis e tipos de dados</li>
<li>Estruturas condicionais (if)</li>
<li>Estruturas de repetição (while)</li>
<li>Manipulação de listas (ArrayList)</li>
<li>Entrada de dados com Scanner</li>
<li>Iteração com for-each</li>
<li>Formatação de números com DecimalFormat</li>
</ul>

<hr>

<h2>👨‍💻 Autor</h2>

<p><strong>Marcos Firmino Rodrigues</strong></p>

<p>
🎓 Estudante de Desenvolvimento de Software Multiplataforma <br>
🏫 Fatec Araras
</p>

<p>
Interesses na área:
</p>

<ul>
<li>Desenvolvimento Back-End</li>
<li>Estruturas de Dados</li>
<li>Sistemas Web</li>
<li>Programação em Java e Python</li>
</ul>

<hr>

<h2>📜 Licença</h2>

<p>
Este projeto foi desenvolvido para fins educacionais e aprendizado em programação.
</p>

<p>
Seu uso é livre para estudos, melhorias e experimentação.
</p>
