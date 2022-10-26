package com.idat.Rivera.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Rivera.Model.Bodega;
import com.idat.Rivera.Repository.BodegaRepository;

public class BodegaServiceImp implements BodegaService {
	
	@Autowired
	private BodegaRepository repositorio;

	@Override
	public void guardar (Bodega bodega) {
		// TODO Auto-generated method stub
		 repositorio.save(bodega);

	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		 repositorio.saveAndFlush(bodega);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
