package com.xiaomo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 * @author Jason
 *
 */

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=200)
	private String email;
	
	private boolean is_present;
	
	@Column(length=200)
	private String name;
	
	@Column(length=200)
	private String password;
	
	@Column(length=200)
	private String phone;
	
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getIs_present() {
		return is_present;
	}

	public void setIs_present(Boolean is_present) {
		this.is_present = is_present;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", is_present=" + is_present + ", name=" + name + ", password="
				+ password + ", phone=" + phone + ", status=" + status + "]";
	}
	
}