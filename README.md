## Automação para pesquisar na Brasil API

# Objetivos
## Projeto Guiado Para a Execução de uma Automatização que retorna os Resultados de busca por cep.

# Recursos Utilizados:
## ● Versão do Java 11
## ● Utilizar o HttpClient nativo do Java
## ● MySQL 8
## Boas Práticas de Commits para você entender como o código foi desenvolvido

## Antes de Iniciar o Projeto é importante que você tenha o ambiente java configurado em sua máquina
## Recomendação:
### link de um vídeo que foi utilizado como orientação para configurar o ambiente de desenvolvimento desse projeto: https://www.youtube.com/watch?v=I4WMPt6mBYs&list=PLWXw8Gu52TRI0usqoSTLrioF6NPp-3msb&index=2
### https://www.youtube.com/watch?v=RJCddOFCnVc
### https://www.youtube.com/watch?v=FmQeg7oj6Io&t=106s

## Para uma experiência melhor, esse o banco de dados desse projeto está na núvem, para você conseguir acessar esse recurso e analisar melhor como está sendo inserido os resultados, estou compartilhando as informações de acesso
## link: http://www.phpmyadmin.co 
## Server: sql8.freemysqlhosting.net
### Name: sql8702038
### Username: sql8702038
### Password: 4kELkyTPnX
### Port number: 3306


### Inicialmente o projeto começou com uma versão diferente ao do java 11, então foi seguido esse recurso do forum para mudar a versão: https://cursos.alura.com.br/forum/topico-mudando-a-versao-do-java-1-5-ou-outras-versoes-para-o-11-124472

## Iniciando Instruções do Projeto:
### Primeiramente você precisa baixar o projeto com esse link da sua máquina
![image](https://github.com/Samanta00/api_ceps/assets/80990432/403eaa5e-4756-4d1e-84df-1be9652ea4d8)

### insira git clone com esse link no terminar do seu github, caso você não conheça esse comando recomendo esse vídeo: https://www.youtube.com/watch?v=WEPB5pDSEIg
### o projeto vai abrir na sua máquina, após isso, encontre essa paste:
![image](https://github.com/Samanta00/api_ceps/assets/80990432/ecd9321d-3322-4cd2-8fdc-e681babdafa0)

## inicie a aplicação clicando no botão de executar
![image](https://github.com/Samanta00/api_ceps/assets/80990432/fa41950d-a214-4d6d-b335-f332d7e12cbc)

## No seu terminal será exibido essa pergunta:
![image](https://github.com/Samanta00/api_ceps/assets/80990432/70413900-a0de-476b-8871-0c61b457b173)

## com.api_ceps.MySQLConnection@4aa298b7, está sendo exibido pois ele está informando que a conexão com o banco de dados foi bem sucesidada
## agora insira no seu terminal o cep em que deseja fazer uma busca
## se tudo ocorrer bem a resposta exibida será essa: ![image](https://github.com/Samanta00/api_ceps/assets/80990432/2e6f128d-a9ce-4877-a51f-eee125926aea)

## se você passar algum cep inválido, é esperado que tenha esse retorno: ![image](https://github.com/Samanta00/api_ceps/assets/80990432/fef2d202-2cd9-43bd-ab2b-0b55b7b23a53)

## agora vamos analisar como essas informações ficaram no banco de dados
## temos todas as informações salvas em nosso banco: ![image](https://github.com/Samanta00/api_ceps/assets/80990432/b3a00d77-7bf7-416e-8bcb-29dc8ac135bb)

## Dúvidas? entre em contato comigo por email: ellen.samanta@outlook.com





