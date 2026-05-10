# CHECKPOINT 2 - JAVA ADVANCED

## Integrantes

- Natalia Cristina de Souza - RM 564099
- Nickolas Davi Silva Souza - RM 564105
- Samara de Oliveira Vilela - RM 566133

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

---

# Estrutura do Projeto

```text
controller
entity
repository
service
resources
```

---

# Funcionalidades

## POST - Cadastrar brinquedo

```http
POST /brinquedos
```

### Exemplo JSON

```json
{
  "nome": "Boneca Barbie",
  "tipo": "Boneca",
  "classificacao": "4 anos",
  "tamanho": "Grande",
  "preco": 129.90
}
```

---

## GET - Listar brinquedos

```http
GET /brinquedos
```

---

## PUT - Atualizar brinquedo

```http
PUT /brinquedos/{id}
```

### Exemplo JSON

```json
{
  "nome": "Boneca Barbie",
  "tipo": "Boneca",
  "classificacao": "4 anos",
  "tamanho": "Grande",
  "preco": 129.90
}
```

---

## DELETE - Excluir brinquedo

```http
DELETE /brinquedos/{id}
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
spring.datasource.username=RMXXXXXX
spring.datasource.password=XXXXXX
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Evidências

O projeto foi testado utilizando o Postman com os seguintes endpoints:

- POST
- GET
- PUT
- DELETE

Também foram realizados testes no Oracle SQL Developer para validação da criação da tabela e persistência dos dados.

---
