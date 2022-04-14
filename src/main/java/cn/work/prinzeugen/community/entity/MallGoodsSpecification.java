package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品规格表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_goods_specification")
@ApiModel(value = "MallGoodsSpecification对象", description = "商品规格表")
public class MallGoodsSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

      @ApiModelProperty("商品表的商品ID")
      private Integer goodsId;

    private String specification;

    private String value;

    private String picUrl;

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
    
    public Integer getGoodsId() {
        return goodsId;
    }

      public void setGoodsId(Integer goodsId) {
          this.goodsId = goodsId;
      }
    
    public String getSpecification() {
        return specification;
    }

      public void setSpecification(String specification) {
          this.specification = specification;
      }
    
    public String getValue() {
        return value;
    }

      public void setValue(String value) {
          this.value = value;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
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
        return "MallGoodsSpecification{" +
              ", id=" + id +
                  ", goodsId=" + goodsId +
                  ", specification=" + specification +
                  ", value=" + value +
                  ", picUrl=" + picUrl +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
