package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.idat.Rivera.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	void guardar(Usuario usuario);
	void actualizar(Usuario usuario);
	void eliminar (Integer id );
	List<Usuario> listar ();
	Usuario obtener (Integer id);
}
