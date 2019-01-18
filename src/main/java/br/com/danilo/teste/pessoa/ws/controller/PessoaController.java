package br.com.danilo.teste.pessoa.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.teste.pessoa.ws.entity.Pessoa;
import br.com.danilo.teste.pessoa.ws.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin(origins = "http://localhost:3000")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repository;
	
    @PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
		return repository.save(pessoa);
	}
    
    @GetMapping(value = "/cpf/{cpf}")
    public Pessoa findByCpf(@PathVariable("cpf") String cpf) {
    	return repository.findByCpf(cpf);
    }

}
