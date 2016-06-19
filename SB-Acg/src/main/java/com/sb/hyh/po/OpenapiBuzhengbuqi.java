package com.sb.hyh.po;
// Generated 2016-6-17 10:55:29 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OpenapiBuzhengbuqi generated by hbm2java
 */
@Entity
@Table(name = "OPENAPI_BUZHENGBUQI", schema = "NEW_BPP")
public class OpenapiBuzhengbuqi implements java.io.Serializable {

	private String id;
	private String yxtywlsh;
	private String sqh;
	private long sort;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
	private String remarks;
	private char delFlag;
	private String sjbbh;
	private String blbm;
	private String zrsj;
	private Date bzbqsj;
	private String bz;
	private String byzda;
	private String byzdb;

	public OpenapiBuzhengbuqi() {
	}

	public OpenapiBuzhengbuqi(String id, String yxtywlsh, long sort, char delFlag, String sjbbh, String blbm,
			String zrsj, Date bzbqsj) {
		this.id = id;
		this.yxtywlsh = yxtywlsh;
		this.sort = sort;
		this.delFlag = delFlag;
		this.sjbbh = sjbbh;
		this.blbm = blbm;
		this.zrsj = zrsj;
		this.bzbqsj = bzbqsj;
	}

	public OpenapiBuzhengbuqi(String id, String yxtywlsh, String sqh, long sort, String createBy,
			Date createDate, String updateBy, Date updateDate, String remarks, char delFlag,
			String sjbbh, String blbm, String zrsj, Date bzbqsj, String bz, String byzda, String byzdb) {
		this.id = id;
		this.yxtywlsh = yxtywlsh;
		this.sqh = sqh;
		this.sort = sort;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.remarks = remarks;
		this.delFlag = delFlag;
		this.sjbbh = sjbbh;
		this.blbm = blbm;
		this.zrsj = zrsj;
		this.bzbqsj = bzbqsj;
		this.bz = bz;
		this.byzda = byzda;
		this.byzdb = byzdb;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "YXTYWLSH", nullable = false, length = 64)
	public String getYxtywlsh() {
		return this.yxtywlsh;
	}

	public void setYxtywlsh(String yxtywlsh) {
		this.yxtywlsh = yxtywlsh;
	}

	@Column(name = "SQH", length = 64)
	public String getSqh() {
		return this.sqh;
	}

	public void setSqh(String sqh) {
		this.sqh = sqh;
	}

	@Column(name = "SORT", nullable = false, precision = 10, scale = 0)
	public long getSort() {
		return this.sort;
	}

	public void setSort(long sort) {
		this.sort = sort;
	}

	@Column(name = "CREATE_BY", length = 64)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "CREATE_DATE")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_BY", length = 64)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "UPDATE_DATE")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "REMARKS")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "DEL_FLAG", nullable = false, length = 1)
	public char getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(char delFlag) {
		this.delFlag = delFlag;
	}

	@Column(name = "SJBBH", nullable = false, length = 100)
	public String getSjbbh() {
		return this.sjbbh;
	}

	public void setSjbbh(String sjbbh) {
		this.sjbbh = sjbbh;
	}

	@Column(name = "BLBM", nullable = false, length = 2)
	public String getBlbm() {
		return this.blbm;
	}

	public void setBlbm(String blbm) {
		this.blbm = blbm;
	}

	@Column(name = "ZRSJ", nullable = false, length = 200)
	public String getZrsj() {
		return this.zrsj;
	}

	public void setZrsj(String zrsj) {
		this.zrsj = zrsj;
	}

	@Column(name = "BZBQSJ", nullable = false)
	public Date getBzbqsj() {
		return this.bzbqsj;
	}

	public void setBzbqsj(Date bzbqsj) {
		this.bzbqsj = bzbqsj;
	}

	@Column(name = "BZ", length = 100)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Column(name = "BYZDA", length = 100)
	public String getByzda() {
		return this.byzda;
	}

	public void setByzda(String byzda) {
		this.byzda = byzda;
	}

	@Column(name = "BYZDB", length = 100)
	public String getByzdb() {
		return this.byzdb;
	}

	public void setByzdb(String byzdb) {
		this.byzdb = byzdb;
	}

}
