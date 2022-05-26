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
 * 管理员表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_admin")
@ApiModel(value = "SysAdmin对象", description = "管理员表")
public class SysAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("登录名称")
      private String loginName;

    private String username;

    private String password;

    private String lastLoginIp;

      @ApiModelProperty("最近一次登录时间")
      private LocalDateTime lastLoginTime;

    private String avatar;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

    private String roleIds;

    private String desction;

    private String tel;

    private String mail;

      @ApiModelProperty("状态:-1：删除，0：禁用，1：启用")
      private Boolean state;

    public SysAdmin(String loginName, String loginPwd, String tel, String mail) {
        this.loginName = loginName;
        this.password = loginPwd;
        this.tel = tel;
        this.mail = mail;
    }


    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getLoginName() {
        return loginName;
    }

      public void setLoginName(String loginName) {
          this.loginName = loginName;
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
    
    public String getLastLoginIp() {
        return lastLoginIp;
    }

      public void setLastLoginIp(String lastLoginIp) {
          this.lastLoginIp = lastLoginIp;
      }
    
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

      public void setLastLoginTime(LocalDateTime lastLoginTime) {
          this.lastLoginTime = lastLoginTime;
      }
    
    public String getAvatar() {
        return avatar;
    }

      public void setAvatar(String avatar) {
          this.avatar = avatar;
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
    
    public String getRoleIds() {
        return roleIds;
    }

      public void setRoleIds(String roleIds) {
          this.roleIds = roleIds;
      }
    
    public String getDesction() {
        return desction;
    }

      public void setDesction(String desction) {
          this.desction = desction;
      }
    
    public String getTel() {
        return tel;
    }

      public void setTel(String tel) {
          this.tel = tel;
      }
    
    public String getMail() {
        return mail;
    }

      public void setMail(String mail) {
          this.mail = mail;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "SysAdmin{" +
              ", id=" + id +
                  ", loginName=" + loginName +
                  ", username=" + username +
                  ", password=" + password +
                  ", lastLoginIp=" + lastLoginIp +
                  ", lastLoginTime=" + lastLoginTime +
                  ", avatar=" + avatar +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", roleIds=" + roleIds +
                  ", desction=" + desction +
                  ", tel=" + tel +
                  ", mail=" + mail +
                  ", state=" + state +
              "}";
    }
}
