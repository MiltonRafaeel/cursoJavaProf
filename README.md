# 🚀 Projeto DSCommerce - Java Spring Professional

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Postman Docs](https://img.shields.io/badge/Postman-Documenta%C3%A7%C3%A3o-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://documenter.getpostman.com/view/51167813/2sBXqDtNzZ)

Este repositório reúne os projetos desenvolvidos ao longo do curso **Java Spring Professional**, ministrado por **Nelio Alves** na [DevSuperior](https://devsuperior.com.br/).

Entre os projetos presentes neste repositório, o principal é o **DSCommerce**, uma aplicação desenvolvida com foco na construção de uma **API REST robusta**, aplicando boas práticas com **Java**, **Spring Boot** e tecnologias do ecossistema Spring.

## 📚 Sobre o Repositório

Durante o curso, foram desenvolvidos diversos projetos práticos e desafios para consolidar o aprendizado em cada módulo.

Cada etapa teve como objetivo aplicar na prática os conceitos estudados, evoluindo gradualmente até a construção do projeto principal **DSCommerce**, que reúne os principais recursos e padrões abordados ao longo da formação.

## 🎯 Objetivo do Projeto

Construir uma API REST completa com:

- Arquitetura em camadas
- CRUD completo
- Validações
- Tratamento de exceções
- Segurança com autenticação e autorização
- Integração com banco de dados
- Preparação para deploy e CI/CD

## 🧠 Conteúdos Aplicados

### 🔹 Componentes e Injeção de Dependência
- Uso de `@Component`, `@Service` e `@Repository`
- Inversão de controle (IoC)
- Injeção de dependência com Spring

### 🔹 Modelo de Domínio e ORM
- Mapeamento de entidades com JPA
- Relacionamentos entre entidades
- Boas práticas de modelagem orientada a objetos

### 🔹 API REST
- Endpoints RESTful
- Operações CRUD
- Organização em camadas: Controller, Service e Repository

### 🔹 Validações e Exceções
- Bean Validation com `@Valid`, `@NotNull`, entre outras
- Tratamento global de exceções
- Respostas padronizadas para erros da API

### 🔹 JPA e Consultas
- Consultas com JPQL
- Queries customizadas
- Paginação e ordenação de resultados

### 🔹 Segurança
- Login e autenticação
- Controle de acesso por perfil de usuário
- Proteção de rotas com Spring Security

### 🔹 Deploy e CI/CD
- Preparação da aplicação para produção
- Integração contínua
- Boas práticas de publicação da aplicação

## 📝 Desafios Desenvolvidos

| Desafio | Conteúdo Abordado |
|--------|-------------------|
| desafio1 | Componentes e Injeção de Dependência |
| desafio2 | Modelo de Domínio e ORM |
| desafio3 | API REST, Camadas, CRUD, Exceções e Validações |
| desafio4 | JPA, Consultas SQL e JPQL |

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- Hibernate
- Maven
- H2 Database
- PostgreSQL
- Postman

## 📬 Documentação da API

A documentação da API foi publicada no Postman e pode ser acessada pelo link abaixo:

[![Postman Docs](https://img.shields.io/badge/Acessar-Documenta%C3%A7%C3%A3o%20da%20API-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://documenter.getpostman.com/view/51167813/2sBXqDtNzZ)

Ou, se preferir, acesse diretamente por este link:

🔗 [Documentação pública da API no Postman](https://documenter.getpostman.com/view/51167813/2sBXqDtNzZ)

## ▶️ Como Executar o Projeto

```bash
# Clonar o repositório
git clone https://github.com/MiltonRafaeel/cursoJavaProf.git

# Entrar na pasta do projeto principal
cd dscommerce

# Executar o projeto
./mvnw spring-boot:run
