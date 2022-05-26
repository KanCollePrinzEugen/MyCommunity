package cn.work.prinzeugen.community.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 缓存表单信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_user_formid")
@ApiModel(value = "SysUserFormid对象", description = "缓存表单信息")
public class SysUserFormid implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String formId;

      @ApiModelProperty("是FormId还是prepayId")
      private Boolean isprepay;

      @ApiModelProperty("可用次数，fromId为1，prepay为3，用1次减1")
      private Integer useAmount;

      @ApiModelProperty("过期时间，腾讯规定为7天")
      private LocalDateTime expireTime;

    private String openId;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getFormId() {
        return formId;
    }

      public void setFormId(String formId) {
          this.formId = formId;
      }
    
    public Boolean getIsprepay() {
        return isprepay;
    }

      public void setIsprepay(Boolean isprepay) {
          this.isprepay = isprepay;
      }
    
    public Integer getUseAmount() {
        return useAmount;
    }

      public void setUseAmount(Integer useAmount) {
          this.useAmount = useAmount;
      }
    
    public LocalDateTime getExpireTime() {
        return expireTime;
    }

      public void setExpireTime(LocalDateTime expireTime) {
          this.expireTime = expireTime;
      }
    
    public String getOpenId() {
        return openId;
    }

      public void setOpenId(String openId) {
          this.openId = openId;
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
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "SysUserFormid{" +
              ", id=" + id +
                  ", formId=" + formId +
                  ", isprepay=" + isprepay +
                  ", useAmount=" + useAmount +
                  ", expireTime=" + expireTime +
                  ", openId=" + openId +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
