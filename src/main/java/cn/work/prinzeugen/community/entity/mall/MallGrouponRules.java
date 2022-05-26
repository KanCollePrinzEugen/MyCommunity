package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 团购规则信息表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_groupon_rules")
@ApiModel(value = "MallGrouponRules对象", description = "团购规则信息表")
public class MallGrouponRules implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("商品表的商品ID")
      private Integer goodsId;

      @ApiModelProperty("商品名称")
      private String goodsName;

      @ApiModelProperty("图片地址")
      private String picUrl;

      @ApiModelProperty("优惠金额")
      private BigDecimal discount;

      @ApiModelProperty("达到优惠条件的人数")
      private Integer discountMember;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("团购过期时间")
      private LocalDateTime expireTime;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
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
    
    public String getGoodsName() {
        return goodsName;
    }

      public void setGoodsName(String goodsName) {
          this.goodsName = goodsName;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }
    
    public BigDecimal getDiscount() {
        return discount;
    }

      public void setDiscount(BigDecimal discount) {
          this.discount = discount;
      }
    
    public Integer getDiscountMember() {
        return discountMember;
    }

      public void setDiscountMember(Integer discountMember) {
          this.discountMember = discountMember;
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
    
    public LocalDateTime getExpireTime() {
        return expireTime;
    }

      public void setExpireTime(LocalDateTime expireTime) {
          this.expireTime = expireTime;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallGrouponRules{" +
              ", id=" + id +
                  ", goodsId=" + goodsId +
                  ", goodsName=" + goodsName +
                  ", picUrl=" + picUrl +
                  ", discount=" + discount +
                  ", discountMember=" + discountMember +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", expireTime=" + expireTime +
                  ", state=" + state +
              "}";
    }
}
