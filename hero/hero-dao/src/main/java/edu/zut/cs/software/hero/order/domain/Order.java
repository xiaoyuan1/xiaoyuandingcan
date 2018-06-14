package edu.zut.cs.software.hero.order.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_Order")
@Entity
public class Order extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name="Order_Aprice")
	String order_Aprice;     //总销售额
	@Column(name="Order_Acost")
	String order_Acost;     //总销售额
	@Column(name="Order_Aprofit")
	String order_Aprofit;     //总销售额
	@Column(name = "Order_Anumber")
	String order_Anumber;      //次数
	public String getOrder_Aprice() {
		return order_Aprice;
	}

	public void setOrder_Aprice(String order_Aprice) {
		this.order_Aprice = order_Aprice;
	}
	
	public String getOrder_Acost() {
		return order_Acost;
	}

	public void setOrder_Acost(String order_Acost) {
		this.order_Acost = order_Acost;
	}
	
	public String getOrder_Aprofit() {
		return order_Aprofit;
	}

	public void setOrder_Aprofit(String  order_Aprofit) {
		this.order_Aprofit = order_Aprofit;
	}
	
	public void setOrder_Anumber(String order_Anumber) {
		this.order_Anumber =order_Anumber;
	}
	
	public String getOrder_Anumber() {
		return order_Anumber;
	}
}
