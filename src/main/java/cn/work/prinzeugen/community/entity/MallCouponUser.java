package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 优惠券用户使用表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_coupon_user")
@ApiModel(value = "MallCouponUser对象", description = "优惠券用户使用表")
public class MallCouponUser implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

      @ApiModelProperty("用户ID")
      private Integer userId;

      @ApiModelProperty("优惠券ID")
      private Integer couponId;

      @ApiModelProperty("使用时间")
      private LocalDateTime usedTime;

      @ApiModelProperty("有效期开始时间")
      private LocalDate startTime;

      @ApiModelProperty("有效期截至时间")
      private LocalDate endTime;

    private String orderSn;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("使用状态,-1:删除， 如果是0则未使用；如果是1则已使用；如果是2则已过期；如果是3则已经下架；")
      private Integer state;

    
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
    
    public Integer getCouponId() {
        return couponId;
    }

      public void setCouponId(Integer couponId) {
          this.couponId = couponId;
      }
    
    public LocalDateTime getUsedTime() {
        return usedTime;
    }

      public void setUsedTime(LocalDateTime usedTime) {
          this.usedTime = usedTime;
      }
    
    public LocalDate getStartTime() {
        return startTime;
    }

      public void setStartTime(LocalDate startTime) {
          this.startTime = startTime;
      }
    
    public LocalDate getEndTime() {
        return endTime;
    }

      public void setEndTime(LocalDate endTime) {
          this.endTime = endTime;
      }
    
    public String getOrderSn() {
        return orderSn;
    }

      public void setOrderSn(String orderSn) {
          this.orderSn = orderSn;
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
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallCouponUser{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", couponId=" + couponId +
                  ", usedTime=" + usedTime +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", orderSn=" + orderSn +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
