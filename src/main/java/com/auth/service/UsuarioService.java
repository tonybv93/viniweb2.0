package com.auth.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth.entity.Rol;
import com.auth.entity.Usuario;
import com.auth.repository.IRolRepository;
import com.auth.repository.IUserRepository;
@Service
public class UsuarioService implements InterfazUsuario {
	@Autowired
	IRolRepository rolRepo;
	@Autowired
	IUserRepository userRepo;
	@Autowired
	private BCryptPasswordEncoder encriptador;
	
	
	@Override
	public Usuario buscarPorUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public void guardarUsuario(Usuario user) {
		
		user.setPassword(encriptador.encode(user.getPassword()));
		Rol rol = rolRepo.findByRol("Administración");
		user.setRoles(new ArrayList<Rol>(Arrays.asList(rol)));
		userRepo.save(user);
	}

}
