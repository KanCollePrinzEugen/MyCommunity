package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 楼栋信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("prop_building")
@ApiModel(value = "PropBuilding对象", description = "楼栋信息")
public class PropBuilding implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("所属小区")
      private Integer villageId;

      @ApiModelProperty("名称")
      private String name;

      @ApiModelProperty("面积")
      private BigDecimal area;

      @ApiModelProperty("面积: 1 ；普通住宅，2：错层住宅 3：别墅")
      private Integer type;

      @ApiModelProperty("入住信息:0：未入住，1：出租，2：自住")
      private Integer inFlag;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
      private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getVillageId() {
        return villageId;
    }

      public void setVillageId(Integer villageId) {
          this.villageId = villageId;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public BigDecimal getArea() {
        return area;
    }

      public void setArea(BigDecimal area) {
          this.area = area;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Integer getInFlag() {
        return inFlag;
    }

      public void setInFlag(Integer inFlag) {
          this.inFlag = inFlag;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "PropBuilding{" +
              ", id=" + id +
                  ", villageId=" + villageId +
                  ", name=" + name +
                  ", area=" + area +
                  ", type=" + type +
                  ", inFlag=" + inFlag +
                  ", state=" + state +
              "}";
    }
}
