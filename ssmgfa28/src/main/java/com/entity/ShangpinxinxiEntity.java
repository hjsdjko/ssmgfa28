package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-09 18:17:36
 */
@TableName("shangpinxinxi")
public class ShangpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinxinxiEntity() {
		
	}
	
	public ShangpinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 城市
	 */
					
	private String chengshi;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 商品分类
	 */
					
	private String shangpinfenlei;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 商家地址
	 */
					
	private String shangjiadizhi;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 经度
	 */
					
	private Float longitude;
	
	/**
	 * 纬度
	 */
					
	private Float latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：城市
	 */
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
	/**
	 * 设置：商品分类
	 */
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：商家地址
	 */
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}

}
