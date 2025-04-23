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
 * 房屋
 *
 * @author 
 * @email
 */
@TableName("fangwu")
public class FangwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangwuEntity() {

	}

	public FangwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 房屋名称
     */
    @TableField(value = "fangwu_name")

    private String fangwuName;


    /**
     * 房屋编号
     */
    @TableField(value = "fangwu_uuid_number")

    private String fangwuUuidNumber;


    /**
     * 房屋照片
     */
    @TableField(value = "fangwu_photo")

    private String fangwuPhoto;


    /**
     * 房屋位置
     */
    @TableField(value = "fangwu_address")

    private String fangwuAddress;


    /**
     * 房屋类型
     */
    @TableField(value = "fangwu_types")

    private Integer fangwuTypes;


    /**
     * 区域
     */
    @TableField(value = "quyu_types")

    private Integer quyuTypes;


    /**
     * 户型
     */
    @TableField(value = "huxing_types")

    private Integer huxingTypes;


    /**
     * 平方
     */
    @TableField(value = "fangwu_pingfang")

    private Double fangwuPingfang;


    /**
     * 单价/平方
     */
    @TableField(value = "fangwu_danjia")

    private Double fangwuDanjia;


    /**
     * 房屋原总价
     */
    @TableField(value = "fangwu_old_money")

    private Double fangwuOldMoney;


    /**
     * 现总价
     */
    @TableField(value = "fangwu_new_money")

    private Double fangwuNewMoney;


    /**
     * 房屋热度
     */
    @TableField(value = "fangwu_clicknum")

    private Integer fangwuClicknum;


    /**
     * 房屋介绍
     */
    @TableField(value = "fangwu_content")

    private String fangwuContent;


    /**
     * 房屋状态
     */
    @TableField(value = "fangwuzhuangtai_types")

    private Integer fangwuzhuangtaiTypes;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "fangwu_delete")

    private Integer fangwuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房屋名称
	 */
    public String getFangwuName() {
        return fangwuName;
    }
    /**
	 * 获取：房屋名称
	 */

    public void setFangwuName(String fangwuName) {
        this.fangwuName = fangwuName;
    }
    /**
	 * 设置：房屋编号
	 */
    public String getFangwuUuidNumber() {
        return fangwuUuidNumber;
    }
    /**
	 * 获取：房屋编号
	 */

    public void setFangwuUuidNumber(String fangwuUuidNumber) {
        this.fangwuUuidNumber = fangwuUuidNumber;
    }
    /**
	 * 设置：房屋照片
	 */
    public String getFangwuPhoto() {
        return fangwuPhoto;
    }
    /**
	 * 获取：房屋照片
	 */

    public void setFangwuPhoto(String fangwuPhoto) {
        this.fangwuPhoto = fangwuPhoto;
    }
    /**
	 * 设置：房屋位置
	 */
    public String getFangwuAddress() {
        return fangwuAddress;
    }
    /**
	 * 获取：房屋位置
	 */

    public void setFangwuAddress(String fangwuAddress) {
        this.fangwuAddress = fangwuAddress;
    }
    /**
	 * 设置：房屋类型
	 */
    public Integer getFangwuTypes() {
        return fangwuTypes;
    }
    /**
	 * 获取：房屋类型
	 */

    public void setFangwuTypes(Integer fangwuTypes) {
        this.fangwuTypes = fangwuTypes;
    }
    /**
	 * 设置：区域
	 */
    public Integer getQuyuTypes() {
        return quyuTypes;
    }
    /**
	 * 获取：区域
	 */

    public void setQuyuTypes(Integer quyuTypes) {
        this.quyuTypes = quyuTypes;
    }
    /**
	 * 设置：户型
	 */
    public Integer getHuxingTypes() {
        return huxingTypes;
    }
    /**
	 * 获取：户型
	 */

    public void setHuxingTypes(Integer huxingTypes) {
        this.huxingTypes = huxingTypes;
    }
    /**
	 * 设置：平方
	 */
    public Double getFangwuPingfang() {
        return fangwuPingfang;
    }
    /**
	 * 获取：平方
	 */

    public void setFangwuPingfang(Double fangwuPingfang) {
        this.fangwuPingfang = fangwuPingfang;
    }
    /**
	 * 设置：单价/平方
	 */
    public Double getFangwuDanjia() {
        return fangwuDanjia;
    }
    /**
	 * 获取：单价/平方
	 */

    public void setFangwuDanjia(Double fangwuDanjia) {
        this.fangwuDanjia = fangwuDanjia;
    }
    /**
	 * 设置：房屋原总价
	 */
    public Double getFangwuOldMoney() {
        return fangwuOldMoney;
    }
    /**
	 * 获取：房屋原总价
	 */

    public void setFangwuOldMoney(Double fangwuOldMoney) {
        this.fangwuOldMoney = fangwuOldMoney;
    }
    /**
	 * 设置：现总价
	 */
    public Double getFangwuNewMoney() {
        return fangwuNewMoney;
    }
    /**
	 * 获取：现总价
	 */

    public void setFangwuNewMoney(Double fangwuNewMoney) {
        this.fangwuNewMoney = fangwuNewMoney;
    }
    /**
	 * 设置：房屋热度
	 */
    public Integer getFangwuClicknum() {
        return fangwuClicknum;
    }
    /**
	 * 获取：房屋热度
	 */

    public void setFangwuClicknum(Integer fangwuClicknum) {
        this.fangwuClicknum = fangwuClicknum;
    }
    /**
	 * 设置：房屋介绍
	 */
    public String getFangwuContent() {
        return fangwuContent;
    }
    /**
	 * 获取：房屋介绍
	 */

    public void setFangwuContent(String fangwuContent) {
        this.fangwuContent = fangwuContent;
    }
    /**
	 * 设置：房屋状态
	 */
    public Integer getFangwuzhuangtaiTypes() {
        return fangwuzhuangtaiTypes;
    }
    /**
	 * 获取：房屋状态
	 */

    public void setFangwuzhuangtaiTypes(Integer fangwuzhuangtaiTypes) {
        this.fangwuzhuangtaiTypes = fangwuzhuangtaiTypes;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFangwuDelete() {
        return fangwuDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setFangwuDelete(Integer fangwuDelete) {
        this.fangwuDelete = fangwuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fangwu{" +
            "id=" + id +
            ", fangwuName=" + fangwuName +
            ", fangwuUuidNumber=" + fangwuUuidNumber +
            ", fangwuPhoto=" + fangwuPhoto +
            ", fangwuAddress=" + fangwuAddress +
            ", fangwuTypes=" + fangwuTypes +
            ", quyuTypes=" + quyuTypes +
            ", huxingTypes=" + huxingTypes +
            ", fangwuPingfang=" + fangwuPingfang +
            ", fangwuDanjia=" + fangwuDanjia +
            ", fangwuOldMoney=" + fangwuOldMoney +
            ", fangwuNewMoney=" + fangwuNewMoney +
            ", fangwuClicknum=" + fangwuClicknum +
            ", fangwuContent=" + fangwuContent +
            ", fangwuzhuangtaiTypes=" + fangwuzhuangtaiTypes +
            ", shangxiaTypes=" + shangxiaTypes +
            ", fangwuDelete=" + fangwuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
