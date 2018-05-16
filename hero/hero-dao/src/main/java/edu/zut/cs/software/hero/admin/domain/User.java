package edu.zut.cs.software.hero.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_USER")
@Entity
public class User extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	@Column(name = "USERNAME")
	String username;

	@Column(name = "PASSWORD")
	String password;

	@Column(name = "EMAIL")
	String email;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
