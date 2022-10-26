package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Usuario;

public interface UsuarioService {
	void guardar(Usuario usuario);
	void actualizar(Usuario usuario);
	void eliminar (Integer id );
	List<Usuario> listar ();
	Usuario obtener (Integer id);

}
