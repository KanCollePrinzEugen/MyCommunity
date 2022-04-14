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
 * 账户流水表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_account_trace")
@ApiModel(value = "MallAccountTrace对象", description = "账户流水表")
public class MallAccountTrace implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String traceSn;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("操作类型 0:系统结算 1:用户提现")
      private Integer type;

      @ApiModelProperty("操作金额")
      private BigDecimal amount;

      @ApiModelProperty("总申请金额")
      private BigDecimal totalAmount;

      @ApiModelProperty("申请时间")
      private LocalDateTime addTime;

    private String mobile;

    private String smsCode;

      @ApiModelProperty("审批状态")
      private Integer state;

    private String traceMsg;

      @ApiModelProperty("审批时间")
      private LocalDateTime updateTime;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getTraceSn() {
        return traceSn;
    }

      public void setTraceSn(String traceSn) {
          this.traceSn = traceSn;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public BigDecimal getAmount() {
        return amount;
    }

      public void setAmount(BigDecimal amount) {
          this.amount = amount;
      }
    
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

      public void setTotalAmount(BigDecimal totalAmount) {
          this.totalAmount = totalAmount;
      }
    
    public LocalDateTime getAddTime() {
        return addTime;
    }

      public void setAddTime(LocalDateTime addTime) {
          this.addTime = addTime;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public String getSmsCode() {
        return smsCode;
    }

      public void setSmsCode(String smsCode) {
          this.smsCode = smsCode;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public String getTraceMsg() {
        return traceMsg;
    }

      public void setTraceMsg(String traceMsg) {
          this.traceMsg = traceMsg;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }

    @Override
    public String toString() {
        return "MallAccountTrace{" +
              ", id=" + id +
                  ", traceSn=" + traceSn +
                  ", userId=" + userId +
                  ", type=" + type +
                  ", amount=" + amount +
                  ", totalAmount=" + totalAmount +
                  ", addTime=" + addTime +
                  ", mobile=" + mobile +
                  ", smsCode=" + smsCode +
                  ", state=" + state +
                  ", traceMsg=" + traceMsg +
                  ", updateTime=" + updateTime +
              "}";
    }
}
