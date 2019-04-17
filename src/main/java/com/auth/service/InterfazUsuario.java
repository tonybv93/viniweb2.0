package com.auth.service;

import com.auth.entity.Usuario;

public interface InterfazUsuario {
	public Usuario buscarPorUsername(String username);	 
	public void guardarUsuario(Usuario user);
}
