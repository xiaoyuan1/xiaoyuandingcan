package edu.zut.cs.software.hero.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;

@Table(name="PUSH")
@Entity
public class Push extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	@Column(name = "MESSAGE")
	String message;//推送内容
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
