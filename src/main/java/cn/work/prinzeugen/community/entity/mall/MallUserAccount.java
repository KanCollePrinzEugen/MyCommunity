package cn.work.prinzeugen.community.entity.mall;

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
 * 账户表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_user_account")
@ApiModel(value = "MallUserAccount对象", description = "账户表")
public class MallUserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("账户总余额")
      private BigDecimal remainAmount;

      @ApiModelProperty("账户总额")
      private BigDecimal totalAmount;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("修改时间")
      private LocalDateTime modifyTime;

      @ApiModelProperty("结算利率：5 表示5%或0.05")
      private Integer settlementRate;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Integer state;

      @ApiModelProperty("分享推广二维码地址")
      private String shareUrl;

    
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
    
    public BigDecimal getRemainAmount() {
        return remainAmount;
    }

      public void setRemainAmount(BigDecimal remainAmount) {
          this.remainAmount = remainAmount;
      }
    
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

      public void setTotalAmount(BigDecimal totalAmount) {
          this.totalAmount = totalAmount;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

      public void setModifyTime(LocalDateTime modifyTime) {
          this.modifyTime = modifyTime;
      }
    
    public Integer getSettlementRate() {
        return settlementRate;
    }

      public void setSettlementRate(Integer settlementRate) {
          this.settlementRate = settlementRate;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public String getShareUrl() {
        return shareUrl;
    }

      public void setShareUrl(String shareUrl) {
          this.shareUrl = shareUrl;
      }

    @Override
    public String toString() {
        return "MallUserAccount{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", remainAmount=" + remainAmount +
                  ", totalAmount=" + totalAmount +
                  ", createTime=" + createTime +
                  ", modifyTime=" + modifyTime +
                  ", settlementRate=" + settlementRate +
                  ", state=" + state +
                  ", shareUrl=" + shareUrl +
              "}";
    }
}
