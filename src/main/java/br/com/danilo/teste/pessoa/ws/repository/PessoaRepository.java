package br.com.danilo.teste.pessoa.ws.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.danilo.teste.pessoa.ws.entity.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	Pessoa findByCpf(String cpf);
	
}
