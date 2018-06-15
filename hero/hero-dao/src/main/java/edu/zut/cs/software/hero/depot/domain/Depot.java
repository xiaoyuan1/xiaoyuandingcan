package edu.zut.cs.software.hero.depot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_DEPOT")

@Entity
public class Depot extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column
	String raw;
	@Column
	String code;
	public String getCaipin() {
		return caipin;
	}

	public void setCaipin(String caipin) {
		this.caipin = caipin;
	}

	@Column
	String caipin;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRaw() {
		return raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
