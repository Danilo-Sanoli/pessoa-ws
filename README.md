# Serviços relacionados à pessoa

## Serviços

- `pessoas/salvar`: Serviço responsável por salvar uma pessoa
- `pessoas/cpf{CPF}`: Serviço responsável por buscar pessoa através de um CPF


## Descrição

	Foi construído um projeto específico para pessoas, visando reutilizar a entidade pessoa para demais operações. Dessa forma, a pessoa foi desvinculada de toda e qualquer informação de taxas, sendo assim, o projeto é responsável apenas por ações que da entidade pessoa.
	
## Execução

- `Porta`: 8080

## Banco de Dados

- `URL`: http://localhost:8080/h2
- `Base de Dados`: jdbc:h2:file:~/pessoas_bd
- `Usuário`: admin
- `Senha`: admin