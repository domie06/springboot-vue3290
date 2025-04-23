package com.entity.view;

import com.entity.FangwuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房屋留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangwu_liuyan")
public class FangwuLiuyanView extends FangwuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 fangwu
			/**
			* 房屋名称
			*/
			private String fangwuName;
			/**
			* 房屋编号
			*/
			private String fangwuUuidNumber;
			/**
			* 房屋照片
			*/
			private String fangwuPhoto;
			/**
			* 房屋位置
			*/
			private String fangwuAddress;
			/**
			* 房屋类型
			*/
			private Integer fangwuTypes;
				/**
				* 房屋类型的值
				*/
				private String fangwuValue;
			/**
			* 区域
			*/
			private Integer quyuTypes;
				/**
				* 区域的值
				*/
				private String quyuValue;
			/**
			* 户型
			*/
			private Integer huxingTypes;
				/**
				* 户型的值
				*/
				private String huxingValue;
			/**
			* 平方
			*/
			private Double fangwuPingfang;
			/**
			* 单价/平方
			*/
			private Double fangwuDanjia;
			/**
			* 房屋原总价
			*/
			private Double fangwuOldMoney;
			/**
			* 现总价
			*/
			private Double fangwuNewMoney;
			/**
			* 房屋热度
			*/
			private Integer fangwuClicknum;
			/**
			* 房屋介绍
			*/
			private String fangwuContent;
			/**
			* 房屋状态
			*/
			private Integer fangwuzhuangtaiTypes;
				/**
				* 房屋状态的值
				*/
				private String fangwuzhuangtaiValue;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer fangwuDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public FangwuLiuyanView() {

	}

	public FangwuLiuyanView(FangwuLiuyanEntity fangwuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, fangwuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set fangwu

					/**
					* 获取： 房屋名称
					*/
					public String getFangwuName() {
						return fangwuName;
					}
					/**
					* 设置： 房屋名称
					*/
					public void setFangwuName(String fangwuName) {
						this.fangwuName = fangwuName;
					}

					/**
					* 获取： 房屋编号
					*/
					public String getFangwuUuidNumber() {
						return fangwuUuidNumber;
					}
					/**
					* 设置： 房屋编号
					*/
					public void setFangwuUuidNumber(String fangwuUuidNumber) {
						this.fangwuUuidNumber = fangwuUuidNumber;
					}

					/**
					* 获取： 房屋照片
					*/
					public String getFangwuPhoto() {
						return fangwuPhoto;
					}
					/**
					* 设置： 房屋照片
					*/
					public void setFangwuPhoto(String fangwuPhoto) {
						this.fangwuPhoto = fangwuPhoto;
					}

					/**
					* 获取： 房屋位置
					*/
					public String getFangwuAddress() {
						return fangwuAddress;
					}
					/**
					* 设置： 房屋位置
					*/
					public void setFangwuAddress(String fangwuAddress) {
						this.fangwuAddress = fangwuAddress;
					}

					/**
					* 获取： 房屋类型
					*/
					public Integer getFangwuTypes() {
						return fangwuTypes;
					}
					/**
					* 设置： 房屋类型
					*/
					public void setFangwuTypes(Integer fangwuTypes) {
						this.fangwuTypes = fangwuTypes;
					}


						/**
						* 获取： 房屋类型的值
						*/
						public String getFangwuValue() {
							return fangwuValue;
						}
						/**
						* 设置： 房屋类型的值
						*/
						public void setFangwuValue(String fangwuValue) {
							this.fangwuValue = fangwuValue;
						}

					/**
					* 获取： 区域
					*/
					public Integer getQuyuTypes() {
						return quyuTypes;
					}
					/**
					* 设置： 区域
					*/
					public void setQuyuTypes(Integer quyuTypes) {
						this.quyuTypes = quyuTypes;
					}


						/**
						* 获取： 区域的值
						*/
						public String getQuyuValue() {
							return quyuValue;
						}
						/**
						* 设置： 区域的值
						*/
						public void setQuyuValue(String quyuValue) {
							this.quyuValue = quyuValue;
						}

					/**
					* 获取： 户型
					*/
					public Integer getHuxingTypes() {
						return huxingTypes;
					}
					/**
					* 设置： 户型
					*/
					public void setHuxingTypes(Integer huxingTypes) {
						this.huxingTypes = huxingTypes;
					}


						/**
						* 获取： 户型的值
						*/
						public String getHuxingValue() {
							return huxingValue;
						}
						/**
						* 设置： 户型的值
						*/
						public void setHuxingValue(String huxingValue) {
							this.huxingValue = huxingValue;
						}

					/**
					* 获取： 平方
					*/
					public Double getFangwuPingfang() {
						return fangwuPingfang;
					}
					/**
					* 设置： 平方
					*/
					public void setFangwuPingfang(Double fangwuPingfang) {
						this.fangwuPingfang = fangwuPingfang;
					}

					/**
					* 获取： 单价/平方
					*/
					public Double getFangwuDanjia() {
						return fangwuDanjia;
					}
					/**
					* 设置： 单价/平方
					*/
					public void setFangwuDanjia(Double fangwuDanjia) {
						this.fangwuDanjia = fangwuDanjia;
					}

					/**
					* 获取： 房屋原总价
					*/
					public Double getFangwuOldMoney() {
						return fangwuOldMoney;
					}
					/**
					* 设置： 房屋原总价
					*/
					public void setFangwuOldMoney(Double fangwuOldMoney) {
						this.fangwuOldMoney = fangwuOldMoney;
					}

					/**
					* 获取： 现总价
					*/
					public Double getFangwuNewMoney() {
						return fangwuNewMoney;
					}
					/**
					* 设置： 现总价
					*/
					public void setFangwuNewMoney(Double fangwuNewMoney) {
						this.fangwuNewMoney = fangwuNewMoney;
					}

					/**
					* 获取： 房屋热度
					*/
					public Integer getFangwuClicknum() {
						return fangwuClicknum;
					}
					/**
					* 设置： 房屋热度
					*/
					public void setFangwuClicknum(Integer fangwuClicknum) {
						this.fangwuClicknum = fangwuClicknum;
					}

					/**
					* 获取： 房屋介绍
					*/
					public String getFangwuContent() {
						return fangwuContent;
					}
					/**
					* 设置： 房屋介绍
					*/
					public void setFangwuContent(String fangwuContent) {
						this.fangwuContent = fangwuContent;
					}

					/**
					* 获取： 房屋状态
					*/
					public Integer getFangwuzhuangtaiTypes() {
						return fangwuzhuangtaiTypes;
					}
					/**
					* 设置： 房屋状态
					*/
					public void setFangwuzhuangtaiTypes(Integer fangwuzhuangtaiTypes) {
						this.fangwuzhuangtaiTypes = fangwuzhuangtaiTypes;
					}


						/**
						* 获取： 房屋状态的值
						*/
						public String getFangwuzhuangtaiValue() {
							return fangwuzhuangtaiValue;
						}
						/**
						* 设置： 房屋状态的值
						*/
						public void setFangwuzhuangtaiValue(String fangwuzhuangtaiValue) {
							this.fangwuzhuangtaiValue = fangwuzhuangtaiValue;
						}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getFangwuDelete() {
						return fangwuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setFangwuDelete(Integer fangwuDelete) {
						this.fangwuDelete = fangwuDelete;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
