#Crie uma aplicação utilizando servlets  e jsp com as seguintes características:
- Deve existir um arquivo chamado login.jsp que receberá os dados de login e password de um usuário (1.0);
- O servlet ValidadorLogin fará o controle de acesso, verificando via banco de dados se o login e password do usuário são válidos. Se não forem, a aplicação deve redirecionar o usuário para a tela inicial (2.0);
- Este servlet deverá criar uma variável de sessão (vida útil de 2 semanas) com um objeto Usuário (nome, login e email), caso o login seja válido (1.0);
- O mesmo servlet criará um cookie (vida útil de um ano)  contendo o nome do usuário (1.0);
- Após a criação do cookie, o servlet deverá ser redirecionado para uma página chamada continuacao.jsp. Essa página fará uma verificação de sessão e caso exista a sessão o conteúdo do cookie deve ser exibido (1.0);
- Caso não exista a sessão, o usuário deverá ser redirecionado para a página de login (1.0);
- O DAO do usuário somente precisa trazer o usuário pelo login e senha (1.0);
- O script de criação da tabela Usuário (id, nome, login e email) deve estar dentro do projeto do netbeans (1.0);


#Script de criaçao da base sql: 

```SQL

create database parcialii;

use parcialii;

create table users(
  id int not null primary key,
  username varchar(255),
  keypass varchar(60),
  userFirstName varchar(255),
  email varchar(255)
);
  
```