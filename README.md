# 🪙 Conversor de Moedas - Java Challenge

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Gson](https://img.shields.io/badge/Library-Gson-blue)

Este projeto consiste em um **Conversor de Moedas** robusto, desenvolvido em Java. A aplicação consome dados em tempo real de uma API externa, manipula informações no formato JSON e oferece uma interface interativa e amigável via console.

## 🎯 Objetivo
O desafio foi construir uma ferramenta que realizasse conversões dinâmicas entre moedas internacionais, focando na aplicação de conceitos de Engenharia de Software para garantir um código limpo, modular e fácil de manter.

## 🚀 Funcionalidades
* **Consultas Dinâmicas:** Requisições em tempo real para obter taxas de câmbio atualizadas.
* **Menu de Conversão:** Interface textual com 6 opções de conversões pré-definidas.
* **Tratamento de Dados:** Utilização da biblioteca **Gson** para desserialização de objetos JSON.
* **Formatação Financeira:** Exibição de resultados com duas casas decimais para maior precisão visual.

## 🛠️ Tecnologias e Boas Práticas
Para este projeto, priorizei a qualidade do código seguindo padrões de mercado:
* **Java 17 (Records):** Uso de `records` para simplificar a criação de DTOs e garantir imutabilidade.
* **Single Responsibility Principle (SRP):** Divisão clara de responsabilidades entre as classes.
* **Custom Exceptions:** Criação de exceções personalizadas para um tratamento de erros mais descritivo e seguro.
* **Modularização:** Extração de lógicas complexas em métodos auxiliares, mantendo o método `main` limpo e legível.

## 📂 Estrutura do Projeto

```text
src/
├── Moeda.java                 # Record (DTO) para mapear o JSON da API
├── ConsultaCotacao.java       # Service responsável pela conexão HTTP
├── ErroConsultaApiException.java # Exceção personalizada
└── Principal.java             # Classe principal com o Menu e lógica de exibição
````
## ⚙️ Como Executar
1. Clone o repositório.
2. Certifique-se de ter o **JDK 17** ou superior instalado.
3. Adicione a biblioteca **Gson 2.10.1** ao seu projeto.
4. Insira sua chave da **ExchangeRate-API** no código.
5. Execute a classe `Principal.java`.
   
## 📸 Demonstração em Vídeo
Confira o funcionamento do conversor

![Demonstração do Conversor](img/demonstracao.gif)
---
Desenvolvido por **Raul Douglas Oliveira Barbosa** como parte da minha jornada de aprendizado em Engenharia de Software.
