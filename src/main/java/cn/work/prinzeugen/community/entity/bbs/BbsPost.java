package cn.work.prinzeugen.community.entity.bbs;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 帖子信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("bbs_post")
@ApiModel(value = "BbsPost对象", description = "帖子信息")
public class BbsPost implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("上级编号")
      private Long pid;

      @ApiModelProperty("所属板块")
      private Integer topicId;

      @ApiModelProperty("置顶 0:否，1：是")
      private Boolean topFlag;

      @ApiModelProperty("标题")
      private String title;

      @ApiModelProperty("内容")
      private String contents;

      @ApiModelProperty("发布者")
      private Integer author;

      @ApiModelProperty("发布时间")
      private LocalDateTime pubTime;

      @ApiModelProperty("审核者")
      private Integer confirmAdmin;

      @ApiModelProperty("审核时间")
      private LocalDateTime confirmTime;

      @ApiModelProperty("状态:-1：删除，0：禁用，1：启用 ")
      private Integer state;

    private Integer clicks;

    private Integer likes;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public Long getPid() {
        return pid;
    }

      public void setPid(Long pid) {
          this.pid = pid;
      }
    
    public Integer getTopicId() {
        return topicId;
    }

      public void setTopicId(Integer topicId) {
          this.topicId = topicId;
      }
    
    public Boolean getTopFlag() {
        return topFlag;
    }

      public void setTopFlag(Boolean topFlag) {
          this.topFlag = topFlag;
      }
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getContents() {
        return contents;
    }

      public void setContents(String contents) {
          this.contents = contents;
      }
    
    public Integer getAuthor() {
        return author;
    }

      public void setAuthor(Integer author) {
          this.author = author;
      }
    
    public LocalDateTime getPubTime() {
        return pubTime;
    }

      public void setPubTime(LocalDateTime pubTime) {
          this.pubTime = pubTime;
      }
    
    public Integer getConfirmAdmin() {
        return confirmAdmin;
    }

      public void setConfirmAdmin(Integer confirmAdmin) {
          this.confirmAdmin = confirmAdmin;
      }
    
    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

      public void setConfirmTime(LocalDateTime confirmTime) {
          this.confirmTime = confirmTime;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public Integer getClicks() {
        return clicks;
    }

      public void setClicks(Integer clicks) {
          this.clicks = clicks;
      }
    
    public Integer getLikes() {
        return likes;
    }

      public void setLikes(Integer likes) {
          this.likes = likes;
      }

    @Override
    public String toString() {
        return "BbsPost{" +
              ", id=" + id +
                  ", pid=" + pid +
                  ", topicId=" + topicId +
                  ", topFlag=" + topFlag +
                  ", title=" + title +
                  ", contents=" + contents +
                  ", author=" + author +
                  ", pubTime=" + pubTime +
                  ", confirmAdmin=" + confirmAdmin +
                  ", confirmTime=" + confirmTime +
                  ", state=" + state +
                  ", clicks=" + clicks +
                  ", likes=" + likes +
              "}";
    }
}
