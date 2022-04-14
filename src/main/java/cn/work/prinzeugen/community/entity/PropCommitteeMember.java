package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业委会成员表,放置业委会的成员信息，介绍
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("prop_committee_member")
@ApiModel(value = "PropCommitteeMember对象", description = "业委会成员表,放置业委会的成员信息，介绍")
public class PropCommitteeMember implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("所属业委会")
      private Integer commitId;

      @ApiModelProperty("用户编号")
      private Integer userId;

      @ApiModelProperty("任职开始时间")
      private LocalDate beginDate;

      @ApiModelProperty("任职结束时间")
      private LocalDate endDate;

      @ApiModelProperty("角色,从数据字典中获取相关数据")
      private String role;

      @ApiModelProperty("介绍")
      private String remarks;

      @ApiModelProperty("佐证材料")
      private String attach;

      @ApiModelProperty("状态:-1删除，0：启用，1：禁用")
      private Integer state;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("创建管理员")
      private Integer createAdmin;

      @ApiModelProperty("修改时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("修改管理员")
      private Integer updateAdmin;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getCommitId() {
        return commitId;
    }

      public void setCommitId(Integer commitId) {
          this.commitId = commitId;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public LocalDate getBeginDate() {
        return beginDate;
    }

      public void setBeginDate(LocalDate beginDate) {
          this.beginDate = beginDate;
      }
    
    public LocalDate getEndDate() {
        return endDate;
    }

      public void setEndDate(LocalDate endDate) {
          this.endDate = endDate;
      }
    
    public String getRole() {
        return role;
    }

      public void setRole(String role) {
          this.role = role;
      }
    
    public String getRemarks() {
        return remarks;
    }

      public void setRemarks(String remarks) {
          this.remarks = remarks;
      }
    
    public String getAttach() {
        return attach;
    }

      public void setAttach(String attach) {
          this.attach = attach;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public Integer getCreateAdmin() {
        return createAdmin;
    }

      public void setCreateAdmin(Integer createAdmin) {
          this.createAdmin = createAdmin;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public Integer getUpdateAdmin() {
        return updateAdmin;
    }

      public void setUpdateAdmin(Integer updateAdmin) {
          this.updateAdmin = updateAdmin;
      }

    @Override
    public String toString() {
        return "PropCommitteeMember{" +
              ", id=" + id +
                  ", commitId=" + commitId +
                  ", userId=" + userId +
                  ", beginDate=" + beginDate +
                  ", endDate=" + endDate +
                  ", role=" + role +
                  ", remarks=" + remarks +
                  ", attach=" + attach +
                  ", state=" + state +
                  ", createTime=" + createTime +
                  ", createAdmin=" + createAdmin +
                  ", updateTime=" + updateTime +
                  ", updateAdmin=" + updateAdmin +
              "}";
    }
}
