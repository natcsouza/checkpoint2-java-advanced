# CHECKPOINT 2 - JAVA ADVANCED

## Integrantes

- Natalia Cristina de Souza – RM 564099
- Nickolas Davi Silva Souza – RM 564105
- Samara de Oliveira Vilela – RM 566133

---

# Sobre o Projeto

Projeto desenvolvido em Java utilizando Spring Boot para criação de uma API REST de gerenciamento de brinquedos.

A aplicação realiza operações de CRUD integradas ao banco de dados Oracle.

---

# Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Oracle Database
- Maven
- IntelliJ IDEA
- Postman
- Oracle SQL Developer

---

# Estrutura do Projeto

O projeto foi organizado utilizando arquitetura em camadas:

- Controller
- Service
- Repository
- Entity

Pacotes principais:

```text
controller
service
repository
entity
```

---

# Banco de Dados

Banco Oracle utilizado para persistência dos dados.

Tabela utilizada:

```sql
TDS_TB_BRINQUEDOS
```

---

# Configuração Oracle

Arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
spring.datasource.username=rm564099
spring.datasource.password=140599
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Operações CRUD da API

Foram realizados testes completos da API REST utilizando o Postman, contemplando todas as operações básicas de CRUD:

- CREATE → Cadastro de brinquedos (POST)
- READ → Consulta de brinquedos (GET)
- UPDATE → Atualização de brinquedos (PUT)
- DELETE → Exclusão de brinquedos (DELETE)

Todos os testes foram executados utilizando o endereço localhost na porta 8080, com persistência dos dados no banco Oracle SQL Developer.

---

Base URL utilizada nos testes:

```http
http://localhost:8080/brinquedos
```


Observação:

Durante os testes no Postman foram utilizados endpoints diferentes conforme a operação realizada no CRUD.

Exemplos:

```http
http://localhost:8080/brinquedos
```

Utilizado para:
- POST
- GET geral

```http
http://localhost:8080/brinquedos/1
```

Utilizado para:
- GET por ID
- PUT
- DELETE

Onde o número final representa o ID do brinquedo cadastrado no banco de dados Oracle.
```


# Endpoints da API

## POST - Cadastrar brinquedo

Endpoint:

```http
POST /brinquedos
```

JSON utilizado:

```json
{
  "nome": "Boneca",
  "tipo": "Boneca",
  "classificacao": "3 anos",
  "tamanho": "Médio",
  "preco": 89.90
}
```

### Evidência POST

<img width="1920" height="1080" alt="POST" src="https://github.com/user-attachments/assets/0fabe3e0-841e-457f-9f3f-d8dc28ed498c" />

---

## GET - Listar brinquedos

Endpoint:

```http
GET /brinquedos
```

### Evidência GET

<img width="1920" height="1080" alt="GET" src="https://github.com/user-attachments/assets/eb6a5fd9-be4c-4311-857d-6d881b244266" />

---

## PUT - Atualizar brinquedo

Endpoint:

```http
PUT /brinquedos/{id}
```

JSON utilizado:

```json
{
  "nome": "Boneca Barbie",
  "tipo": "Boneca",
  "classificacao": "4 anos",
  "tamanho": "Grande",
  "preco": 129.90
}
```

### Evidência PUT

<img width="1920" height="1080" alt="PUT" src="https://github.com/user-attachments/assets/db351480-627e-4891-a77f-05e4d74156f9" />

---

## DELETE - Remover brinquedo

Endpoint:

```http
DELETE /brinquedos/{id}
```

### Evidência DELETE

<img width="1920" height="1080" alt="DELETE" src="https://github.com/user-attachments/assets/92bbd9cb-9b87-4ef8-aa80-8fa32894bb99" />

---

# Evidências Oracle SQL Developer

## Estrutura da tabela

Comando utilizado:

```sql
DESC TDS_TB_BRINQUEDOS;
```

### Evidência DESC

<img width="1920" height="1080" alt="DESC TDS_TB_BRINQUEDOS" src="https://github.com/user-attachments/assets/088a5337-88c5-4822-b05c-eb8ac2c40bbd" />

---

## Consulta dos dados persistidos

Comando utilizado:

```sql
SELECT * FROM TDS_TB_BRINQUEDOS;
```

### Evidência SELECT

<img width="1920" height="1080" alt="SELECT  FROM TDS_TB_BRINQUEDOS" src="https://github.com/user-attachments/assets/322eef69-4c01-4224-8163-12c5ff6022b1" />

---

# Evidências IntelliJ IDEA

## Aplicação executando

Aplicação Spring Boot executada com sucesso na porta 8080.

### Evidência IntelliJ

<img width="1920" height="1080" alt="Started BrinquedosApplication - IntelliJ" src="https://github.com/user-attachments/assets/7dd0be27-32d8-4c53-a2c5-ed38913a8107" />

---

# Spring Initializr

Projeto criado utilizando Spring Initializr com dependências Spring Boot, Spring Web, Spring Data JPA e Oracle Driver.

### Evidência Spring Initializr

<img width="1920" height="1080" alt="Spring Initializr" src="https://github.com/user-attachments/assets/00d5fb1c-4733-4a20-b821-1b3a29373b98" />

---

# Repositório GitHub

Link do projeto:

```text
https://github.com/natcsouza/checkpoint2-java-advanced
```



