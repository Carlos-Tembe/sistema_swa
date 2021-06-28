package com.sistema.dao;

import java.util.List;

import com.sistema.model.Categoria;

public interface CategoriaDao {
	void save(Categoria categoria);

	void update(Categoria categoria);

	void delete(Long id);

	Categoria findById(Long id);

	List<Categoria> findAll();
}
