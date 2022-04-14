package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 广告表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_ad")
@ApiModel(value = "SysAd对象", description = "广告表")
public class SysAd implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    private String link;

    private String url;

      @ApiModelProperty("广告位置：1则是首页")
      private Integer position;

    private String content;

      @ApiModelProperty("广告开始时间")
      private LocalDateTime startTime;

      @ApiModelProperty("广告结束时间")
      private LocalDateTime endTime;

      @ApiModelProperty("是否启动")
      private Boolean enabled;

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
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getLink() {
        return link;
    }

      public void setLink(String link) {
          this.link = link;
      }
    
    public String getUrl() {
        return url;
    }

      public void setUrl(String url) {
          this.url = url;
      }
    
    public Integer getPosition() {
        return position;
    }

      public void setPosition(Integer position) {
          this.position = position;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
      }
    
    public LocalDateTime getStartTime() {
        return startTime;
    }

      public void setStartTime(LocalDateTime startTime) {
          this.startTime = startTime;
      }
    
    public LocalDateTime getEndTime() {
        return endTime;
    }

      public void setEndTime(LocalDateTime endTime) {
          this.endTime = endTime;
      }
    
    public Boolean getEnabled() {
        return enabled;
    }

      public void setEnabled(Boolean enabled) {
          this.enabled = enabled;
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
        return "SysAd{" +
              ", id=" + id +
                  ", name=" + name +
                  ", link=" + link +
                  ", url=" + url +
                  ", position=" + position +
                  ", content=" + content +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", enabled=" + enabled +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
