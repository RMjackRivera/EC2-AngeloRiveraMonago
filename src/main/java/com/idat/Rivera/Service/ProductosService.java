package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Productos;

public interface ProductosService {
	void guardar(Productos productos);
	void actualizar(Productos productos);
	void eliminar (Integer id );
	List<Productos> listar ();
	Productos obtener (Integer id);
}
