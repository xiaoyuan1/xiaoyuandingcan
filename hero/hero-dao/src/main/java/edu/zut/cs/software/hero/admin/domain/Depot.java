package edu.zut.cs.software.hero.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="DEPOT")
@Entity
public class Depot extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	@Column(name = "RAW")
	String raw;
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;
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
