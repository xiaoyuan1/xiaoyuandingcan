package edu.zut.cs.software.hero.dingdan.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseTreeEntity;
/**
 * 
 * @author zhangyaohui
 *定义实体类各个属性，并且实现有关属性的方法
 */
@Table(name = "T_DINGDAN")
@Entity
@NamedQueries({ @NamedQuery(name = "Dingdan.getRoot", query = "select g from Dingdan g where g.parent is null") })
public class Dingdan extends BaseTreeEntity<Dingdan>{

	
	private static final long serialVersionUID = -1751952224371998469L;
	
    @Column(name = "ORDERID")
    String orderid;
    @Column(name = "ORDERTIME")
	String ordertime;
    @Column(name = "ORDERXINXI")
	String orderxinxi;
    @Column(name = "ORDERJIAGE")
	String orderjiage;
    @Column(name = "ORDERLIANXIREN")
    String orderlianxiren;

        public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getOrderxinxi() {
		return orderxinxi;
	}
	public void setOrderxinxi(String orderxinxi) {
		this.orderxinxi = orderxinxi;
	}
	public String getOrderjiage() {
		return orderjiage;
	}
	public void setOrderjiage(String orderjiage) {
		this.orderjiage = orderjiage;
	}
	 public String getOrderlianxiren() {
			return orderlianxiren;
		}
		public void setOrderlianxiren(String orderlianxiren) {
			this.orderlianxiren = orderlianxiren;
		}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}