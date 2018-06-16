package edu.zut.cs.software.hero.push.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import edu.zut.cs.software.hero.base.domain.BaseEntity;

@Table(name="T_PUSH")
@Entity
public class Push extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
//以下为推送类实体	
	
	@Column
	 String message;//推送内容，促销活动，节日活动，优惠活动，抽奖活动
	
	@Column
	String food;//推送菜品，根据当天订单中最热门的菜品进行推送，访问food 数据库
	
	@Column
	String lucky;//推送幸运用户，从一周订餐的用户中随机挑选幸运用户，访问dingdan 数据库
	
	@Column
	String code;
	
	@Column
	String date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}

	public String getLucky() {
		return lucky;
	}

	public void setLucky(String lucky) {
		this.lucky = lucky;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
