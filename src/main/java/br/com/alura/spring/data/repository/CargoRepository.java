package br.com.alura.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.orm.Cargo;

/**
 * Criação do crud para trabalhar com cargo . O crudRepository deve receber o cargo e o 
 * tipo do Id que é Integer
 * @author leojr
 *
 */
@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer>{

}
