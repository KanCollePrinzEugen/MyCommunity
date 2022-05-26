package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单商品表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_order_goods")
@ApiModel(value = "MallOrderGoods对象", description = "订单商品表")
public class MallOrderGoods implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("订单表的订单ID")
      private Integer orderId;

      @ApiModelProperty("入驻品牌店铺编码")
      private Integer brandId;

      @ApiModelProperty("商品表的商品ID")
      private Integer goodsId;

      @ApiModelProperty("商品名称")
      private String goodsName;

      @ApiModelProperty("商品编码")
      private String goodsSn;

      @ApiModelProperty("商品货品表的货品ID")
      private Integer productId;

      @ApiModelProperty("商品货品的购买数量")
      private Integer number;

      @ApiModelProperty("商品货品的售价")
      private BigDecimal price;

      @ApiModelProperty("规格列表")
      private String specifications;

      @ApiModelProperty("商品图片")
      private String picUrl;

      @ApiModelProperty("订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。")
      private Integer comment;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("退款跟踪ID")
      private Integer refundId;

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
    
    public Integer getOrderId() {
        return orderId;
    }

      public void setOrderId(Integer orderId) {
          this.orderId = orderId;
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
    
    public String getGoodsName() {
        return goodsName;
    }

      public void setGoodsName(String goodsName) {
          this.goodsName = goodsName;
      }
    
    public String getGoodsSn() {
        return goodsSn;
    }

      public void setGoodsSn(String goodsSn) {
          this.goodsSn = goodsSn;
      }
    
    public Integer getProductId() {
        return productId;
    }

      public void setProductId(Integer productId) {
          this.productId = productId;
      }
    
    public Integer getNumber() {
        return number;
    }

      public void setNumber(Integer number) {
          this.number = number;
      }
    
    public BigDecimal getPrice() {
        return price;
    }

      public void setPrice(BigDecimal price) {
          this.price = price;
      }
    
    public String getSpecifications() {
        return specifications;
    }

      public void setSpecifications(String specifications) {
          this.specifications = specifications;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }
    
    public Integer getComment() {
        return comment;
    }

      public void setComment(Integer comment) {
          this.comment = comment;
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
    
    public Integer getRefundId() {
        return refundId;
    }

      public void setRefundId(Integer refundId) {
          this.refundId = refundId;
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
        return "MallOrderGoods{" +
              ", id=" + id +
                  ", orderId=" + orderId +
                  ", brandId=" + brandId +
                  ", goodsId=" + goodsId +
                  ", goodsName=" + goodsName +
                  ", goodsSn=" + goodsSn +
                  ", productId=" + productId +
                  ", number=" + number +
                  ", price=" + price +
                  ", specifications=" + specifications +
                  ", picUrl=" + picUrl +
                  ", comment=" + comment +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", refundId=" + refundId +
                  ", settlementMoney=" + settlementMoney +
                  ", state=" + state +
              "}";
    }
}
