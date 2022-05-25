package br.com.alura.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.orm.UnidadeTrabalho;

/**
 * Criação do crud para trabalhar com cargo . O crudRepository deve receber o cargo e o 
 * tipo do Id que é Integer
 * @author leojr
 *
 */
@Repository
public interface UnidadeTrabalhoRepository extends CrudRepository<UnidadeTrabalho, Integer>{
	
}
