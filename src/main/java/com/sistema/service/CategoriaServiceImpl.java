package com.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.dao.CategoriaDao;
import com.sistema.model.Categoria;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaDao {

	@Autowired
	private CategoriaDao dao;

	@Override
	public void save(Categoria categoria) {
		dao.save(categoria);

	}

	@Override
	public void update(Categoria categoria) {
		dao.update(categoria);

	}

	@Override
	public void delete(Long id) {
		dao.delete(id);

	}

	@Override
	public Categoria findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Categoria> findAll() {

		return dao.findAll();
	}

}
