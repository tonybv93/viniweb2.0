package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.entity.Rol;
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
	Rol findByRol(String rol);
}
