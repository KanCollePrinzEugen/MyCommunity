package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 收货地址表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_address")
@ApiModel(value = "MallAddress对象", description = "收货地址表")
public class MallAddress implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("收货人名称")
      private String name;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("行政区域表的省ID")
      private Integer provinceId;

      @ApiModelProperty("行政区域表的市ID")
      private Integer cityId;

      @ApiModelProperty("行政区域表的区县ID")
      private Integer areaId;

    private String address;

    private String mobile;

      @ApiModelProperty("是否默认地址")
      private Boolean isDefault;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Integer getProvinceId() {
        return provinceId;
    }

      public void setProvinceId(Integer provinceId) {
          this.provinceId = provinceId;
      }
    
    public Integer getCityId() {
        return cityId;
    }

      public void setCityId(Integer cityId) {
          this.cityId = cityId;
      }
    
    public Integer getAreaId() {
        return areaId;
    }

      public void setAreaId(Integer areaId) {
          this.areaId = areaId;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public Boolean getIsDefault() {
        return isDefault;
    }

      public void setIsDefault(Boolean isDefault) {
          this.isDefault = isDefault;
      }
    
    public LocalDateTime getAddTime() {
        return addTime;
    }

      public void setAddTime(LocalDateTime addTime) {
          this.addTime = addTime;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallAddress{" +
              ", id=" + id +
                  ", name=" + name +
                  ", userId=" + userId +
                  ", provinceId=" + provinceId +
                  ", cityId=" + cityId +
                  ", areaId=" + areaId +
                  ", address=" + address +
                  ", mobile=" + mobile +
                  ", isDefault=" + isDefault +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
