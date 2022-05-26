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
 * 意见反馈表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_feedback")
@ApiModel(value = "SysFeedback对象", description = "意见反馈表")
public class SysFeedback implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("用户名称")
      private String username;

      @ApiModelProperty("手机号")
      private String mobile;

      @ApiModelProperty("反馈类型")
      private String feedType;

      @ApiModelProperty("反馈内容")
      private String content;

      @ApiModelProperty("是否含有图片")
      private Boolean hasPicture;

      @ApiModelProperty("图片地址")
      private String picUrls;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
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
    
    public String getUsername() {
        return username;
    }

      public void setUsername(String username) {
          this.username = username;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public String getFeedType() {
        return feedType;
    }

      public void setFeedType(String feedType) {
          this.feedType = feedType;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
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
        return "SysFeedback{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", username=" + username +
                  ", mobile=" + mobile +
                  ", feedType=" + feedType +
                  ", content=" + content +
                  ", hasPicture=" + hasPicture +
                  ", picUrls=" + picUrls +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
