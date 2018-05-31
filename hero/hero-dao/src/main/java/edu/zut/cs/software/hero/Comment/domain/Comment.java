package edu.zut.cs.software.hero.Comment.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import edu.zut.cs.software.hero.base.domain.BaseEntity;
@Table(name="T_COMMENT")
@Entity
public class Comment extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;
	@Column(name = "COMMENT")
	String comment;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
