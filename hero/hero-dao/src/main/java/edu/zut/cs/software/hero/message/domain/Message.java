/*package edu.zut.cs.software.hero.message.domain;

import javax.persistence.Column;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseTreeEntity;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;
@Table(name = "T_DINGDAN")
@Entity
@NamedQueries({ @NamedQuery(name = "Dingdan.getRoot", query = "select g from Dingdan g where g.parent is null") })


public class Message extends BaseTreeEntity<Dingdan>{

	
	private static final long serialVersionUID = -1751952224371998469L;
	
    @Column(name = "USERSNUMBER")
    String usersNumber;
    @Column(name = "SHOPSNUMBER")
	String shopsNumber;
    @Column(name = "TURNOVER")
	String turnover;

        public String getusersNumber() {
		return usersNumber;
	}
	public void setusersNumber(String usersNumber) {
		this.usersNumber = usersNumber;
	}
	public String getshopsNumber() {
		return shopsNumber;
	}
	public void setshopsNumber(String shopsNumber) {
		this.shopsNumber = shopsNumber;
	}
	public String getturnover() {
		return turnover;
	}
	public void setturnover(String turnover) {
		this.turnover = turnover;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}*/
