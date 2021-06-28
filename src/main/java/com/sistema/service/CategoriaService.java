package com.sistema.service;

import com.sistema.model.Categoria;

public interface CategoriaService {
	void salvar(Categoria categoria);

	void editar(Categoria categoria);

	void excluir(Long id);

	Categoria buscarPorId(Long id);
}
