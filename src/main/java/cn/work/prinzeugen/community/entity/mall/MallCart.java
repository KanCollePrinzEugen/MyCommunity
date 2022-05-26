package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 购物车商品表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_cart")
@ApiModel(value = "MallCart对象", description = "购物车商品表")
public class MallCart implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("入驻品牌商编码")
      private Integer brandId;

      @ApiModelProperty("商品表的商品ID")
      private Integer goodsId;

    private String goodsSn;

    private String goodsName;

      @ApiModelProperty("商品货品表的货品ID")
      private Integer productId;

      @ApiModelProperty("商品货品的价格")
      private BigDecimal price;

      @ApiModelProperty("商品货品的数量")
      private Integer number;

    private String specifications;

      @ApiModelProperty("购物车中商品是否选择状态")
      private Boolean checked;

    private String picUrl;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("代理结算佣金")
      private BigDecimal settlementMoney;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Integer getBrandId() {
        return brandId;
    }

      public void setBrandId(Integer brandId) {
          this.brandId = brandId;
      }
    
    public Integer getGoodsId() {
        return goodsId;
    }

      public void setGoodsId(Integer goodsId) {
          this.goodsId = goodsId;
      }
    
    public String getGoodsSn() {
        return goodsSn;
    }

      public void setGoodsSn(String goodsSn) {
          this.goodsSn = goodsSn;
      }
    
    public String getGoodsName() {
        return goodsName;
    }

      public void setGoodsName(String goodsName) {
          this.goodsName = goodsName;
      }
    
    public Integer getProductId() {
        return productId;
    }

      public void setProductId(Integer productId) {
          this.productId = productId;
      }
    
    public BigDecimal getPrice() {
        return price;
    }

      public void setPrice(BigDecimal price) {
          this.price = price;
      }
    
    public Integer getNumber() {
        return number;
    }

      public void setNumber(Integer number) {
          this.number = number;
      }
    
    public String getSpecifications() {
        return specifications;
    }

      public void setSpecifications(String specifications) {
          this.specifications = specifications;
      }
    
    public Boolean getChecked() {
        return checked;
    }

      public void setChecked(Boolean checked) {
          this.checked = checked;
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
    
    public BigDecimal getSettlementMoney() {
        return settlementMoney;
    }

      public void setSettlementMoney(BigDecimal settlementMoney) {
          this.settlementMoney = settlementMoney;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallCart{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", brandId=" + brandId +
                  ", goodsId=" + goodsId +
                  ", goodsSn=" + goodsSn +
                  ", goodsName=" + goodsName +
                  ", productId=" + productId +
                  ", price=" + price +
                  ", number=" + number +
                  ", specifications=" + specifications +
                  ", checked=" + checked +
                  ", picUrl=" + picUrl +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", settlementMoney=" + settlementMoney +
                  ", state=" + state +
              "}";
    }
}
