package edu.zut.cs.software.hero.message.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;

@Table(name="T_MESSAGE")
@Entity
public class Message extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	@Column
	String username;

	@Column
	String foodname;

	@Column
	String productname;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
