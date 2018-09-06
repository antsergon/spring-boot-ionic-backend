package com.sergio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergio.cursomc.domain.Produto;

/**Objeto capaz de fazer operacoes de busca em relacao a Categoria**/
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
