package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 退款跟踪表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_refund_trace")
@ApiModel(value = "MallRefundTrace对象", description = "退款跟踪表")
public class MallRefundTrace implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("订单表的订单ID")
      private Integer orderId;

      @ApiModelProperty("订单编码")
      private String orderSn;

      @ApiModelProperty("退款原因")
      private String refundReason;

      @ApiModelProperty("是否含有图片")
      private Boolean hasPicture;

      @ApiModelProperty("图片地址")
      private String picUrls;

      @ApiModelProperty("创建时间,即退款申请时间")
      private LocalDateTime addTime;

      @ApiModelProperty("审批内容")
      private String approveMsg;

      @ApiModelProperty("审批时间")
      private LocalDateTime approveTime;

      @ApiModelProperty("退款物流内容")
      private String freightMsg;

      @ApiModelProperty("退款时间")
      private LocalDateTime refundTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("审批状态：-1删除，0 退款申请 1 退款审批通过 2 退款审批拒绝 3 退款完成")
      private Integer state;

    
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
    
    public String getOrderSn() {
        return orderSn;
    }

      public void setOrderSn(String orderSn) {
          this.orderSn = orderSn;
      }
    
    public String getRefundReason() {
        return refundReason;
    }

      public void setRefundReason(String refundReason) {
          this.refundReason = refundReason;
      }
    
    public Boolean getHasPicture() {
        return hasPicture;
    }

      public void setHasPicture(Boolean hasPicture) {
          this.hasPicture = hasPicture;
      }
    
    public String getPicUrls() {
        return picUrls;
    }

      public void setPicUrls(String picUrls) {
          this.picUrls = picUrls;
      }
    
    public LocalDateTime getAddTime() {
        return addTime;
    }

      public void setAddTime(LocalDateTime addTime) {
          this.addTime = addTime;
      }
    
    public String getApproveMsg() {
        return approveMsg;
    }

      public void setApproveMsg(String approveMsg) {
          this.approveMsg = approveMsg;
      }
    
    public LocalDateTime getApproveTime() {
        return approveTime;
    }

      public void setApproveTime(LocalDateTime approveTime) {
          this.approveTime = approveTime;
      }
    
    public String getFreightMsg() {
        return freightMsg;
    }

      public void setFreightMsg(String freightMsg) {
          this.freightMsg = freightMsg;
      }
    
    public LocalDateTime getRefundTime() {
        return refundTime;
    }

      public void setRefundTime(LocalDateTime refundTime) {
          this.refundTime = refundTime;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallRefundTrace{" +
              ", id=" + id +
                  ", orderId=" + orderId +
                  ", orderSn=" + orderSn +
                  ", refundReason=" + refundReason +
                  ", hasPicture=" + hasPicture +
                  ", picUrls=" + picUrls +
                  ", addTime=" + addTime +
                  ", approveMsg=" + approveMsg +
                  ", approveTime=" + approveTime +
                  ", freightMsg=" + freightMsg +
                  ", refundTime=" + refundTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
