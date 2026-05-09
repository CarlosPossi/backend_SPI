# **💻 Backend SPI | SecurIT**

<div align="center">
  <img width="700" height="700" alt="image" src="https://github.com/user-attachments/assets/fd968372-0bb4-4c42-bd30-0bb599c24a46" />

</div>


## 📌 Descrição da API

O Backend SPI é uma API REST desenvolvida em Java utilizando Spring Boot com foco em monitoramento de segurança, ergonomia e condições de trabalho dentro de ambientes corporativos ou industriais.

O sistema permite o gerenciamento de colaboradores, ambientes, riscos, posturas e sessões de trabalho, possibilitando o armazenamento e consulta de informações relacionadas à segurança ocupacional e monitoramento operacional.

A aplicação segue uma arquitetura em camadas utilizando:

- Controller → gerenciamento das requisições HTTP
- Service → regras de negócio
- Repository → acesso ao banco de dados
- Model → entidades do sistema

Além disso, o projeto utiliza persistência de dados com JPA/Hibernate e comunicação via JSON através de endpoints RESTful.

---

<br>

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Banco de Dados H2
- JSON

---

<br>

## 🗂️ Entidades do Projeto

 🔹 **Colaborador**

Representa os colaboradores cadastrados no sistema.

* Endpoint base:

```
/colaboradores
```
<br>

🔹 **Ambiente**

Representa os ambientes monitorados.

* Endpoint base:

```
/ambientes
```
<br>

🔹 **IndicadorSeguranca**

Representa indicadores relacionados à segurança.

* Endpoint base:
```
/indicadores
```
<br>

🔹 **Postura**

Representa informações relacionadas à postura dos colaboradores.

* Endpoint base:

```
/posturas
```
<br>

🔹 **Risco**

Representa riscos identificados no ambiente.

* Endpoint base:

```
/riscos
```
<br>

🔹 **SessaoTrabalho**

Representa sessões ou períodos de trabalho monitorados.

* Endpoint base:

```
/sessoes
```
---

<br>

## 🚀 Endpoints Disponíveis

A API segue o padrão RESTful, permitindo operações completas de criação, consulta, atualização e remoção de dados para todas as entidades do sistema.

Os endpoints estão organizados por recurso e retornam respostas no formato JSON.
<br>

**🔹 Colaboradores**

Responsável pelo gerenciamento dos colaboradores cadastrados no sistema.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/colaboradores` | Lista todos os colaboradores |
| GET | `/colaboradores/{id}` | Retorna um colaborador específico |
| POST | `/colaboradores` | Cadastra um novo colaborador |
| PUT | `/colaboradores/{id}` | Atualiza os dados de um colaborador |
| DELETE | `/colaboradores/{id}` | Remove um colaborador |

<br>

**🔹 Ambientes**

Gerencia os ambientes monitorados pelo sistema.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/ambientes` | Lista todos os ambientes |
| GET | `/ambientes/{id}` | Busca um ambiente pelo ID |
| POST | `/ambientes` | Cria um novo ambiente |
| PUT | `/ambientes/{id}` | Atualiza um ambiente |
| DELETE | `/ambientes/{id}` | Remove um ambiente |

<br>


**🔹 Indicadores de Segurança**

Responsável pelos indicadores de segurança ocupacional.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/indicadores` | Lista todos os indicadores |
| GET | `/indicadores/{id}` | Retorna um indicador específico |
| POST | `/indicadores` | Cria um novo indicador |
| PUT | `/indicadores/{id}` | Atualiza um indicador |
| DELETE | `/indicadores/{id}` | Remove um indicador |

<br>

**🔹 Posturas**

Gerencia informações relacionadas à postura dos colaboradores.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/posturas` | Lista todas as posturas |
| GET | `/posturas/{id}` | Busca uma postura pelo ID |
| POST | `/posturas` | Cadastra uma nova postura |
| PUT | `/posturas/{id}` | Atualiza uma postura |
| DELETE | `/posturas/{id}` | Remove uma postura |

<br>

**🔹 Riscos**

Responsável pelo controle de riscos identificados no ambiente.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/riscos` | Lista todos os riscos |
| GET | `/riscos/{id}` | Busca um risco específico |
| POST | `/riscos` | Cria um novo risco |
| PUT | `/riscos/{id}` | Atualiza um risco |
| DELETE | `/riscos/{id}` | Remove um risco |

<br>

**🔹 Sessões de Trabalho**

Gerencia sessões de trabalho monitoradas pelo sistema.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/sessoes` | Lista todas as sessões |
| GET | `/sessoes/{id}` | Busca uma sessão específica |
| POST | `/sessoes` | Cria uma nova sessão |
| PUT | `/sessoes/{id}` | Atualiza uma sessão |
| DELETE | `/sessoes/{id}` | Remove uma sessão |

---

<br>

## **📦 Exemplos de JSON das Entidades**


***🔹 Colaborador***

Exemplo de JSON:

```json
{
  "id": 1,
  "nome": "João da Silva",
  "idade": 35,
  "cpf": "123.456.789-00",
  "dataContrato": "2024-05-10",
  "nrs": [
    "NR-6",
    "NR-17",
    "NR-35"
  ],
  "asos": [
    "ASO Admissional",
    "ASO Periódico"
  ],
  "sexo": "Masculino",
  "postura": {
    "id": 2
  },
  "sessaoTrabalho": {
    "id": 1
  },
  "risco": {
    "id": 3
  }
}
```

<br>

***🔹 Ambiente***

Exemplo de JSON:

```json
{
  "temperatura": 26.5,
  "ruido": 78.2,
  "luminosidade": 450.0,
  "presencaMaquina": true,
  "indicadorSeguranca": {
    "id": 1
  }
}
```

<br>

***🔹 IndicadorSeguranca***

Exemplo de JSON:

```json
{
  "usoCorretoEpi": true,
  "taxaIncidente": 2.5
}
```

<br>

***🔹 Postura***

Exemplo de JSON:

```json
{
  "angulo": 45.0,
  "classificacaoRiscoErgonomico": "Médio"
}
```

<br>

***🔹 Risco***

Exemplo de JSON:

```json
{
  "comportamento": "Seguro",
  "usoEpi": "Completo",
  "historico": [
    "Treinamento realizado",
    "Advertência registrada",
    "Avaliação positiva"
  ],
  "documentacaoEmDia": true
}
```

<br>

***🔹 SessaoTrabalho***

Exemplo de JSON:

```json
{
  "inicioTrabalho": "08:00:00",
  "fimTrabalho": "17:30:00",
  "tarefas": [
    "Inspeção de equipamentos",
    "Preenchimento de relatórios",
    "Organização do ambiente de trabalho",
    "Monitoramento de segurança"
  ]
}
```
---
<br>

## **▶️ Como Rodar o Projeto**

* ✅ Pré-requisitos

Antes de iniciar o projeto, você precisará ter instalado:

>Java 17+
><br>
>Maven
><br>
>Git
><br>
>IntelliJ, Eclipse ou VS Code

---

* 📥 Clonando o Repositório
> git clone https://github.com/CarlosPossi/backend_SPI.git

---

* 📂 Entrando na Pasta do Projeto
> cd backend_SPI

---

* ▶️ Executando o Projeto
<br>

```
-> Windows
mvnw.cmd spring-boot:run
```
```
-> Linux / Mac**
./mvnw spring-boot:run
```

---

* 🌐 Acessando a API
Após iniciar o projeto:
>http://localhost:8080

---

<br>

## **📁 Estrutura do Projeto**

src/main
<br>
 ├── controller
 <br>
 ├── service
 <br>
 ├── repository
 <br>
 ├── model
 <br>
 └── resources
 

 <br>
 
##  **👨‍💻 Autor**

**Grupo SecurIT ©**
