package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Bodega;

public interface BodegaService {
	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar (Integer id );
	List<Bodega> listar ();
	Bodega obtener (Integer id);
	

}
