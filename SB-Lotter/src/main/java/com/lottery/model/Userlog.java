package com.lottery.model;
// default package

// Generated 2015-9-13 13:41:05 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Userlog generated by hbm2java
 */
@Entity
@Table(name = "userlog", catalog = "lottery")
public class Userlog implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private Date addTime;
	private Float money;
	private Float beforeMoney;
	private Float afterMoney;
	private Integer type;

	public Userlog() {
	}

	public Userlog(Integer userId, Date addTime, Float money, Float beforeMoney, Float afterMoney, Integer type) {
		this.userId = userId;
		this.addTime = addTime;
		this.money = money;
		this.beforeMoney = beforeMoney;
		this.afterMoney = afterMoney;
		this.type = type;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "userId")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "money", precision = 12, scale = 0)
	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	@Column(name = "beforeMoney", precision = 12, scale = 0)
	public Float getBeforeMoney() {
		return this.beforeMoney;
	}

	public void setBeforeMoney(Float beforeMoney) {
		this.beforeMoney = beforeMoney;
	}

	@Column(name = "afterMoney", precision = 12, scale = 0)
	public Float getAfterMoney() {
		return this.afterMoney;
	}

	public void setAfterMoney(Float afterMoney) {
		this.afterMoney = afterMoney;
	}

	@Column(name = "type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this, SerializerFeature.WriteMapNullValue);
	}
}
