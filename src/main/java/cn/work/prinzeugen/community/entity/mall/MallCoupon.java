package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 优惠券信息及规则表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_coupon")
@ApiModel(value = "MallCoupon对象", description = "优惠券信息及规则表")
public class MallCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("优惠券名称")
      private String name;

      @ApiModelProperty("说明")
      private String desction;

      @ApiModelProperty("标签")
      private String tag;

      @ApiModelProperty("优惠券数量，如果是0，则是无限量")
      private Integer total;

      @ApiModelProperty("优惠金额，")
      private BigDecimal discount;

      @ApiModelProperty("最少消费金额才能使用优惠券。")
      private BigDecimal min;

      @ApiModelProperty("用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.")
      private Integer limits;

      @ApiModelProperty("优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；")
      private Integer type;

      @ApiModelProperty("商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。")
      private Integer goodsType;

    private String goodsValue;

    private String code;

      @ApiModelProperty("有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；")
      private Integer timeType;

      @ApiModelProperty("基于领取时间的有效天数days。")
      private Integer days;

      @ApiModelProperty("使用券开始时间")
      private LocalDate startTime;

      @ApiModelProperty("使用券截至时间")
      private LocalDate endTime;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("优惠券状态，-1:删除，如果是0下架，1则是正常可用；如果是2则是过期")
      private Integer state;

    
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
    
    public String getDesction() {
        return desction;
    }

      public void setDesction(String desction) {
          this.desction = desction;
      }
    
    public String getTag() {
        return tag;
    }

      public void setTag(String tag) {
          this.tag = tag;
      }
    
    public Integer getTotal() {
        return total;
    }

      public void setTotal(Integer total) {
          this.total = total;
      }
    
    public BigDecimal getDiscount() {
        return discount;
    }

      public void setDiscount(BigDecimal discount) {
          this.discount = discount;
      }
    
    public BigDecimal getMin() {
        return min;
    }

      public void setMin(BigDecimal min) {
          this.min = min;
      }
    
    public Integer getLimits() {
        return limits;
    }

      public void setLimits(Integer limits) {
          this.limits = limits;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Integer getGoodsType() {
        return goodsType;
    }

      public void setGoodsType(Integer goodsType) {
          this.goodsType = goodsType;
      }
    
    public String getGoodsValue() {
        return goodsValue;
    }

      public void setGoodsValue(String goodsValue) {
          this.goodsValue = goodsValue;
      }
    
    public String getCode() {
        return code;
    }

      public void setCode(String code) {
          this.code = code;
      }
    
    public Integer getTimeType() {
        return timeType;
    }

      public void setTimeType(Integer timeType) {
          this.timeType = timeType;
      }
    
    public Integer getDays() {
        return days;
    }

      public void setDays(Integer days) {
          this.days = days;
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
        return "MallCoupon{" +
              ", id=" + id +
                  ", name=" + name +
                  ", desction=" + desction +
                  ", tag=" + tag +
                  ", total=" + total +
                  ", discount=" + discount +
                  ", min=" + min +
                  ", limits=" + limits +
                  ", type=" + type +
                  ", goodsType=" + goodsType +
                  ", goodsValue=" + goodsValue +
                  ", code=" + code +
                  ", timeType=" + timeType +
                  ", days=" + days +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
