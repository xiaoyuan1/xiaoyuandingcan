package edu.zut.cs.software.hero.order.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_ORDER")
@Entity
public class Order  extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
<<<<<<< HEAD
	@Column(name="Address")
	String address;     //地址
	@Column(name="Customer")
	String customer;    //用户名
	@Column(name="Customer_iphone")
	String customer_iphone;       //联系方式
	@Column(name="Shop_id")
	String shop_id;        //商家id
	@Column(name="Food_name")
	String food_name;    //菜品名称
	@Column(name="Food_number")
	String food_number;     //菜品数量
	@Column(name="Food_price")
	String food_price;      //总价格
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCustomer_iphone() {
		return customer_iphone;
	}
	public void setCustomer_iphone(String customer_iphone) {
		this.customer_iphone = customer_iphone;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getFood_number() {
		return food_number;
	}
	public void setFood_number(String food_number) {
		this.food_number = food_number;
	}
	public String getFood_price() {
		return food_price;
	}
	public void setFood_price(String food_price) {
		this.food_price = food_price;
	}
	
=======
	
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
>>>>>>> 27fc1d6fd1df28f337352048a2fed320a6f48e6a
}
