package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_order")
@ApiModel(value = "MallOrder对象", description = "订单表")
public class MallOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("订单编号")
      private String orderSn;

      @ApiModelProperty("订单状态")
      private Integer orderStatus;

      @ApiModelProperty("收货人名称")
      private String consignee;

      @ApiModelProperty("收货人手机号")
      private String mobile;

      @ApiModelProperty("收货地址")
      private String address;

      @ApiModelProperty("订单留言")
      private String message;

      @ApiModelProperty("商品总费用")
      private BigDecimal goodsPrice;

      @ApiModelProperty("配送费用")
      private BigDecimal freightPrice;

      @ApiModelProperty("优惠券减免")
      private BigDecimal couponPrice;

      @ApiModelProperty("用户积分减免")
      private BigDecimal integralPrice;

      @ApiModelProperty("团购优惠价减免")
      private BigDecimal grouponPrice;

      @ApiModelProperty("订单费用， = goods_price + freight_price - coupon_price")
      private BigDecimal orderPrice;

      @ApiModelProperty("实付费用， = order_price - integral_price")
      private BigDecimal actualPrice;

      @ApiModelProperty("微信付款编号")
      private String payId;

      @ApiModelProperty("微信付款时间")
      private LocalDateTime payTime;

      @ApiModelProperty("发货编号")
      private String shipSn;

      @ApiModelProperty("快递公司")
      private String shipChannel;

      @ApiModelProperty("发货开始时间")
      private LocalDateTime shipTime;

      @ApiModelProperty("用户确认收货时间")
      private LocalDateTime confirmTime;

      @ApiModelProperty("待评价订单商品数量")
      private Integer comments;

      @ApiModelProperty("订单关闭时间")
      private LocalDateTime endTime;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("代理结算金额")
      private BigDecimal settlementMoney;

      @ApiModelProperty("结算状态")
      private Boolean settlementStatus;

      @ApiModelProperty("配送方式 ：0 快递, 1 自提")
      private Integer freightType;

      @ApiModelProperty("推广用户")
      private Integer shareUserId;

      @ApiModelProperty("提货码")
      private String fetchCode;

      @ApiModelProperty("原始创建人")
      private Integer createUserId;

      @ApiModelProperty("转赠发送时间")
      private LocalDateTime giftSendTime;

      @ApiModelProperty("转赠接收时间")
      private LocalDateTime giftReceiveTime;

      @ApiModelProperty("状态: -1：删除，0：取消，1：待支付；2：已支付 3：已发货 4：已收货，5：完成，6：退货中，7：退货完成")
      private Boolean 状态;

    
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
    
    public String getOrderSn() {
        return orderSn;
    }

      public void setOrderSn(String orderSn) {
          this.orderSn = orderSn;
      }
    
    public Integer getOrderStatus() {
        return orderStatus;
    }

      public void setOrderStatus(Integer orderStatus) {
          this.orderStatus = orderStatus;
      }
    
    public String getConsignee() {
        return consignee;
    }

      public void setConsignee(String consignee) {
          this.consignee = consignee;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public String getMessage() {
        return message;
    }

      public void setMessage(String message) {
          this.message = message;
      }
    
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

      public void setGoodsPrice(BigDecimal goodsPrice) {
          this.goodsPrice = goodsPrice;
      }
    
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

      public void setFreightPrice(BigDecimal freightPrice) {
          this.freightPrice = freightPrice;
      }
    
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

      public void setCouponPrice(BigDecimal couponPrice) {
          this.couponPrice = couponPrice;
      }
    
    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

      public void setIntegralPrice(BigDecimal integralPrice) {
          this.integralPrice = integralPrice;
      }
    
    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

      public void setGrouponPrice(BigDecimal grouponPrice) {
          this.grouponPrice = grouponPrice;
      }
    
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

      public void setOrderPrice(BigDecimal orderPrice) {
          this.orderPrice = orderPrice;
      }
    
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

      public void setActualPrice(BigDecimal actualPrice) {
          this.actualPrice = actualPrice;
      }
    
    public String getPayId() {
        return payId;
    }

      public void setPayId(String payId) {
          this.payId = payId;
      }
    
    public LocalDateTime getPayTime() {
        return payTime;
    }

      public void setPayTime(LocalDateTime payTime) {
          this.payTime = payTime;
      }
    
    public String getShipSn() {
        return shipSn;
    }

      public void setShipSn(String shipSn) {
          this.shipSn = shipSn;
      }
    
    public String getShipChannel() {
        return shipChannel;
    }

      public void setShipChannel(String shipChannel) {
          this.shipChannel = shipChannel;
      }
    
    public LocalDateTime getShipTime() {
        return shipTime;
    }

      public void setShipTime(LocalDateTime shipTime) {
          this.shipTime = shipTime;
      }
    
    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

      public void setConfirmTime(LocalDateTime confirmTime) {
          this.confirmTime = confirmTime;
      }
    
    public Integer getComments() {
        return comments;
    }

      public void setComments(Integer comments) {
          this.comments = comments;
      }
    
    public LocalDateTime getEndTime() {
        return endTime;
    }

      public void setEndTime(LocalDateTime endTime) {
          this.endTime = endTime;
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
    
    public Boolean getSettlementStatus() {
        return settlementStatus;
    }

      public void setSettlementStatus(Boolean settlementStatus) {
          this.settlementStatus = settlementStatus;
      }
    
    public Integer getFreightType() {
        return freightType;
    }

      public void setFreightType(Integer freightType) {
          this.freightType = freightType;
      }
    
    public Integer getShareUserId() {
        return shareUserId;
    }

      public void setShareUserId(Integer shareUserId) {
          this.shareUserId = shareUserId;
      }
    
    public String getFetchCode() {
        return fetchCode;
    }

      public void setFetchCode(String fetchCode) {
          this.fetchCode = fetchCode;
      }
    
    public Integer getCreateUserId() {
        return createUserId;
    }

      public void setCreateUserId(Integer createUserId) {
          this.createUserId = createUserId;
      }
    
    public LocalDateTime getGiftSendTime() {
        return giftSendTime;
    }

      public void setGiftSendTime(LocalDateTime giftSendTime) {
          this.giftSendTime = giftSendTime;
      }
    
    public LocalDateTime getGiftReceiveTime() {
        return giftReceiveTime;
    }

      public void setGiftReceiveTime(LocalDateTime giftReceiveTime) {
          this.giftReceiveTime = giftReceiveTime;
      }
    
    public Boolean get状态() {
        return 状态;
    }

      public void set状态(Boolean 状态) {
          this.状态 = 状态;
      }

    @Override
    public String toString() {
        return "MallOrder{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", orderSn=" + orderSn +
                  ", orderStatus=" + orderStatus +
                  ", consignee=" + consignee +
                  ", mobile=" + mobile +
                  ", address=" + address +
                  ", message=" + message +
                  ", goodsPrice=" + goodsPrice +
                  ", freightPrice=" + freightPrice +
                  ", couponPrice=" + couponPrice +
                  ", integralPrice=" + integralPrice +
                  ", grouponPrice=" + grouponPrice +
                  ", orderPrice=" + orderPrice +
                  ", actualPrice=" + actualPrice +
                  ", payId=" + payId +
                  ", payTime=" + payTime +
                  ", shipSn=" + shipSn +
                  ", shipChannel=" + shipChannel +
                  ", shipTime=" + shipTime +
                  ", confirmTime=" + confirmTime +
                  ", comments=" + comments +
                  ", endTime=" + endTime +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", settlementMoney=" + settlementMoney +
                  ", settlementStatus=" + settlementStatus +
                  ", freightType=" + freightType +
                  ", shareUserId=" + shareUserId +
                  ", fetchCode=" + fetchCode +
                  ", createUserId=" + createUserId +
                  ", giftSendTime=" + giftSendTime +
                  ", giftReceiveTime=" + giftReceiveTime +
                  ", 状态=" + 状态 +
              "}";
    }
}
