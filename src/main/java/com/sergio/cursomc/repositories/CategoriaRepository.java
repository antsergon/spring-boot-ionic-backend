package com.sergio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergio.cursomc.domain.Categoria;

/**Objeto capaz de fazer operacoes de busca em relacao a Categoria**/
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
