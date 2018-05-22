package edu.zut.cs.software.hero.Foot.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_FOOT")
@Entity
public class Foot extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	@Column(name = "ID")
	long id;//菜品id
	@Column(name = "SHOP_ID")
	int shop_id;//商店id
	@Column(name = "PRODUCT_NAME")
	String product_name;//菜品名称
	@Column(name = "PRODUCT_PRICE")
	String product_price;//菜品价格
	@Column(name = "PRODUCT_INTRODUCE")
	String product_introduce;//菜品介绍
	@Column(name = "PRODUCT_STATE")
	boolean product_state;//是否下架
	@Column(name = "PRODUCT_VOLUME")
	String product_volume;//销量
	@Column(name = "PRODUCT_BIANHAO")
	String product_biaohao;//菜品编号
	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public String getProduct_introduce() {
		return product_introduce;
	}

	public void setProduct_introduce(String product_introduce) {
		this.product_introduce = product_introduce;
	}

	public boolean isProduct_state() {
		return product_state;
	}

	public void setProduct_state(boolean product_state) {
		this.product_state = product_state;
	}

	public String getProduct_volume() {
		return product_volume;
	}

	public void setProduct_volume(String product_volume) {
		this.product_volume = product_volume;
	}

	public String getProduct_biaohao() {
		return product_biaohao;
	}

	public void setProduct_biaohao(String product_biaohao) {
		this.product_biaohao = product_biaohao;
	}
	
}
