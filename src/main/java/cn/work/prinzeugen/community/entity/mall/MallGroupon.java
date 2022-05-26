package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 团购信息表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_groupon")
@ApiModel(value = "MallGroupon对象", description = "团购信息表")
public class MallGroupon implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("关联的订单ID")
      private Integer orderId;

      @ApiModelProperty("参与的团购ID，仅当user_type不是1")
      private Integer grouponId;

      @ApiModelProperty("团购规则ID，关联dts_groupon_rules表ID字段")
      private Integer rulesId;

      @ApiModelProperty("用户编号")
      private Integer userId;

      @ApiModelProperty("创建者编号")
      private Integer creatorUserId;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("分享图片地址")
      private String shareUrl;

      @ApiModelProperty("是否支付")
      private Boolean payed;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
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
    
    public Integer getGrouponId() {
        return grouponId;
    }

      public void setGrouponId(Integer grouponId) {
          this.grouponId = grouponId;
      }
    
    public Integer getRulesId() {
        return rulesId;
    }

      public void setRulesId(Integer rulesId) {
          this.rulesId = rulesId;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Integer getCreatorUserId() {
        return creatorUserId;
    }

      public void setCreatorUserId(Integer creatorUserId) {
          this.creatorUserId = creatorUserId;
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
    
    public String getShareUrl() {
        return shareUrl;
    }

      public void setShareUrl(String shareUrl) {
          this.shareUrl = shareUrl;
      }
    
    public Boolean getPayed() {
        return payed;
    }

      public void setPayed(Boolean payed) {
          this.payed = payed;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallGroupon{" +
              ", id=" + id +
                  ", orderId=" + orderId +
                  ", grouponId=" + grouponId +
                  ", rulesId=" + rulesId +
                  ", userId=" + userId +
                  ", creatorUserId=" + creatorUserId +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", shareUrl=" + shareUrl +
                  ", payed=" + payed +
                  ", state=" + state +
              "}";
    }
}
