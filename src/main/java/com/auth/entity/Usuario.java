package com.auth.entity;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="usuario")
@DynamicInsert
public class Usuario {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="enable")
	private Boolean enable;
	
	@ManyToMany
	@JoinTable(name = "usuario_rol",
    joinColumns = { @JoinColumn(name = "id_user") },
    inverseJoinColumns = { @JoinColumn(name = "id_rol") })
	private List<Rol> roles;

	public Usuario() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}
