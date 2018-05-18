package edu.zut.cs.software.hero.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.admin.domain.Group;
import edu.zut.cs.software.hero.admin.domain.User;
import edu.zut.cs.software.hero.base.domain.BaseEntity;

@Table(name="T_PUSH")
@Entity
public class Push extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;
	
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
//以下为推送实体	
	
	@Column(name = "MESSAGE")
	String message;//推送内容
	
	@Column(name="FOOD")
	Foot food;//推送菜品
	
	@Column(name="LUCKY")
	User lucky;//推送幸运用户
	
	public String getMessage() {//获取推荐消息函数
		return message;
	}
	
	public void LuckyUser() {//幸运用户
		System.out.println("恭喜"+lucky.getUsername()+"成为本期幸运用户");
	}
	
	public void showFood() {//展示推荐菜品函数
		//System.out.println("今日推荐菜品：");
		food.getProduct_introduce();
	}

	public void setMessage(String message) {//设置推送消息函数
		//this.message ="今日XXX活动，本店开展XXX活动，菜品一律XX折，并赠送XXX！！";
		this.message=message;
	}
	
	public void showMessage() {//展示推送消息函数
		System.out.println(message);
	}
	
	
	public void setFood(String f) {//设置推荐菜品
		food.setProduct_name(f);
	}

	public void setLucky(String l) {//设置幸运观众
		lucky.setUsername(l);
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
