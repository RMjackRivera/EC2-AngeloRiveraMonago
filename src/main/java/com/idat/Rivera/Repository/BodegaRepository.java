package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Rivera.Model.Bodega;


public interface BodegaRepository extends JpaRepository<Bodega, Integer>{
	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar (Integer id );
	List<Bodega> listar ();
	Bodega obtener (Integer id);

}
