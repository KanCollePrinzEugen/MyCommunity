package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户名称")
      private String username;

      @ApiModelProperty("用户密码")
      private String password;

      @ApiModelProperty("性别：0 未知， 1男， 1 女")
      private Integer gender;

      @ApiModelProperty("生日")
      private LocalDate birthday;

      @ApiModelProperty("最近一次登录时间")
      private LocalDateTime lastLoginTime;

      @ApiModelProperty("最后登录IP")
      private String lastLoginIp;

      @ApiModelProperty("用户层级 0 普通用户，1 VIP用户，2 区域代理用户")
      private Integer userLevel;

      @ApiModelProperty("昵称")
      private String nickname;

      @ApiModelProperty("移动电话")
      private String mobile;

      @ApiModelProperty("头像")
      private String avatar;

      @ApiModelProperty("微信OPENID")
      private String weixinOpenid;

      @ApiModelProperty("1:普通用户，2：实名认证用户，3：业主")
      private Integer type;

    private String cardId;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("分享的用户编号")
      private Integer shareUserId;

      @ApiModelProperty("-1：注销删除，0 禁用，1：启用")
      private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getUsername() {
        return username;
    }

      public void setUsername(String username) {
          this.username = username;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }
    
    public Integer getGender() {
        return gender;
    }

      public void setGender(Integer gender) {
          this.gender = gender;
      }
    
    public LocalDate getBirthday() {
        return birthday;
    }

      public void setBirthday(LocalDate birthday) {
          this.birthday = birthday;
      }
    
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

      public void setLastLoginTime(LocalDateTime lastLoginTime) {
          this.lastLoginTime = lastLoginTime;
      }
    
    public String getLastLoginIp() {
        return lastLoginIp;
    }

      public void setLastLoginIp(String lastLoginIp) {
          this.lastLoginIp = lastLoginIp;
      }
    
    public Integer getUserLevel() {
        return userLevel;
    }

      public void setUserLevel(Integer userLevel) {
          this.userLevel = userLevel;
      }
    
    public String getNickname() {
        return nickname;
    }

      public void setNickname(String nickname) {
          this.nickname = nickname;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public String getAvatar() {
        return avatar;
    }

      public void setAvatar(String avatar) {
          this.avatar = avatar;
      }
    
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

      public void setWeixinOpenid(String weixinOpenid) {
          this.weixinOpenid = weixinOpenid;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public String getCardId() {
        return cardId;
    }

      public void setCardId(String cardId) {
          this.cardId = cardId;
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
    
    public Integer getShareUserId() {
        return shareUserId;
    }

      public void setShareUserId(Integer shareUserId) {
          this.shareUserId = shareUserId;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "SysUser{" +
              ", id=" + id +
                  ", username=" + username +
                  ", password=" + password +
                  ", gender=" + gender +
                  ", birthday=" + birthday +
                  ", lastLoginTime=" + lastLoginTime +
                  ", lastLoginIp=" + lastLoginIp +
                  ", userLevel=" + userLevel +
                  ", nickname=" + nickname +
                  ", mobile=" + mobile +
                  ", avatar=" + avatar +
                  ", weixinOpenid=" + weixinOpenid +
                  ", type=" + type +
                  ", cardId=" + cardId +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", shareUserId=" + shareUserId +
                  ", state=" + state +
              "}";
    }
}
