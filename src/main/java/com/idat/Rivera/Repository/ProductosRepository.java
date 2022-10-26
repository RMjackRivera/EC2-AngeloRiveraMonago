package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.idat.Rivera.Model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

	void guardar(Productos productos);
	void actualizar(Productos productos);
	void eliminar (Integer id );
	List<Productos> listar ();
	Productos obtener (Integer id);
}
