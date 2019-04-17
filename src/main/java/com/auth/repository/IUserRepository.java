package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.entity.Usuario;
@Repository
public interface IUserRepository extends JpaRepository<Usuario, Integer>{
	Usuario findByUsername(String username);
}
