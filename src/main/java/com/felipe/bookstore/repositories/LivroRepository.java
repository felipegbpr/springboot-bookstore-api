package com.felipe.bookstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.felipe.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
	
	@Query("SELECT obj FROM Livro obj WHERE obj.categoria.id = :id_cat ORDER BY titulo")
	List<Livro> findAllByCategoria(@Param(value = "id_cat")Integer id_cat);

}
