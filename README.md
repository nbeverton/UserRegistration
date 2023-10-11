# UserRegistration

O projeto **UserRegistration** é uma aplicação desenvolvida em Java com a utilização do framework Spring, que permite realizar operações de CRUD (Create, Read, Update, Delete) de pessoas (usuários) e seus endereços. A aplicação foi construída com a finalidade de demonstrar a utilização de tecnologias populares no desenvolvimento de sistemas, tais como Hibernate, JPA, MySQL, e a implementação de um serviço RESTful.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Framework: Spring e Hibernate
- Persistência de Dados: JPA (Java Persistence API)
- Banco de Dados: MySQL

## Funcionalidades

O sistema **UserRegistration** oferece as seguintes funcionalidades:

- **Cadastro de Usuários (User)**: Permite a criação de registros de usuários com informações como nome, e-mail e telefone.

- **Cadastro de Endereços (Adress)**: Além dos usuários, a aplicação possibilita o cadastro de endereços associados aos usuários. O relacionamento entre as classes User e Adress é do tipo "one-to-many", o que significa que um usuário pode possuir vários endereços.

- **Visualização de Informações**: É possível listar todos os usuários e seus endereços associados.

- **Edição de Usuários**: Permite a atualização dos dados dos usuários, como nome, e-mail, data de nascimento e gênero.

- **Exclusão de Registros**: A aplicação oferece a funcionalidade de exclusão de usuários e seus endereços associados.

## Tecnologias de Persistência

Para garantir a persistência dos dados, o projeto utiliza o framework Hibernate em conjunto com o JPA (Java Persistence API). Isso permite mapear objetos Java para as tabelas do banco de dados MySQL de forma eficiente e simplificada.

## Padrão REST

A aplicação segue o padrão REST (Representational State Transfer) para a criação de serviços web RESTful. Os métodos CRUD (Create, Read, Update, Delete) são mapeados para as operações HTTP correspondentes:

- **POST**: Criação de novos registros (usuários e endereços).
- **GET**: Recuperação de informações.
- **PUT**: Atualização de registros.
- **DELETE**: Exclusão de registros.

## Teste da API

Para garantir o correto funcionamento da aplicação, todos os métodos REST foram testados utilizando o programa Postman. Isso assegura que a API seja robusta e capaz de lidar com todas as operações de forma consistente.

## Considerações Finais

O projeto **UserRegistration** oferece uma visão prática de como desenvolver uma aplicação Java com Spring que realiza operações de CRUD em um banco de dados MySQL. Além disso, a utilização do Hibernate e JPA simplifica a interação com o banco de dados, enquanto a adoção do padrão REST torna a API mais acessível e fácil de usar.

Fique à vontade para explorar o código-fonte e os recursos deste projeto no repositório do GitHub. Qualquer dúvida ou sugestão é bem-vinda para aprimorar esta aplicação.

