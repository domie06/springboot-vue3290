package com.entity.view;

import com.entity.FangwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房屋
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangwu")
public class FangwuView extends FangwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 房屋类型的值
		*/
		private String fangwuValue;
		/**
		* 区域的值
		*/
		private String quyuValue;
		/**
		* 户型的值
		*/
		private String huxingValue;
		/**
		* 房屋状态的值
		*/
		private String fangwuzhuangtaiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public FangwuView() {

	}

	public FangwuView(FangwuEntity fangwuEntity) {
		try {
			BeanUtils.copyProperties(this, fangwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
