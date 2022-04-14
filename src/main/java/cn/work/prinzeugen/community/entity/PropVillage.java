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
 * 小区信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("prop_village")
@ApiModel(value = "PropVillage对象", description = "小区信息")
public class PropVillage implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

      @ApiModelProperty("小区名称")
      private String name;

      @ApiModelProperty("小区地址")
      private String address;

      @ApiModelProperty("物业名称")
      private String propName;

      @ApiModelProperty("联系电话")
      private String phone;

      @ApiModelProperty("住宅户数")
      private Integer total;

      @ApiModelProperty("是否成立业委会:0:否，1：是")
      private Boolean owerFlag;

      @ApiModelProperty("状态:-1：删除，0：禁用，1：启用")
      private Integer state;

      @ApiModelProperty("添加时间")
      private LocalDateTime createTime;

    private LocalDateTime updateTime;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
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
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public String getPropName() {
        return propName;
    }

      public void setPropName(String propName) {
          this.propName = propName;
      }
    
    public String getPhone() {
        return phone;
    }

      public void setPhone(String phone) {
          this.phone = phone;
      }
    
    public Integer getTotal() {
        return total;
    }

      public void setTotal(Integer total) {
          this.total = total;
      }
    
    public Boolean getOwerFlag() {
        return owerFlag;
    }

      public void setOwerFlag(Boolean owerFlag) {
          this.owerFlag = owerFlag;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }

    @Override
    public String toString() {
        return "PropVillage{" +
              ", id=" + id +
                  ", provinceId=" + provinceId +
                  ", cityId=" + cityId +
                  ", areaId=" + areaId +
                  ", name=" + name +
                  ", address=" + address +
                  ", propName=" + propName +
                  ", phone=" + phone +
                  ", total=" + total +
                  ", owerFlag=" + owerFlag +
                  ", state=" + state +
                  ", createTime=" + createTime +
                  ", updateTime=" + updateTime +
              "}";
    }
}
