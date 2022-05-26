package cn.work.prinzeugen.community.entity.vote;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 投票信息，用来发起投票
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("vote_info")
@ApiModel(value = "VoteInfo对象", description = "投票信息，用来发起投票")
public class VoteInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("标题")
      private String title;

      @ApiModelProperty("发起人名称，某某小区业委会")
      private String author;

      @ApiModelProperty("投票开始时间")
      private LocalDateTime beginTime;

      @ApiModelProperty("投票结束时间")
      private LocalDateTime endTime;

      @ApiModelProperty("投票规则说明")
      private String rules;

      @ApiModelProperty("宣传图片")
      private String attaches;

      @ApiModelProperty("可投票的小区,小区的编号，多个小区用逗号分割开")
      private String villageIds;

      @ApiModelProperty("投票人员类型，1：表示必须是业主，2：表示在小区的居住者和业主，3：不限制")
      private Integer type;

      @ApiModelProperty("投票的频次:0:不限制，1：一个账号只能投一次，2：一个账号一天只能投一次，3：一个账号一小时内只能投一次")
      private Integer frequency;

      @ApiModelProperty("状态，-1：删除，0：禁用，1：启用")
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
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getAuthor() {
        return author;
    }

      public void setAuthor(String author) {
          this.author = author;
      }
    
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

      public void setBeginTime(LocalDateTime beginTime) {
          this.beginTime = beginTime;
      }
    
    public LocalDateTime getEndTime() {
        return endTime;
    }

      public void setEndTime(LocalDateTime endTime) {
          this.endTime = endTime;
      }
    
    public String getRules() {
        return rules;
    }

      public void setRules(String rules) {
          this.rules = rules;
      }
    
    public String getAttaches() {
        return attaches;
    }

      public void setAttaches(String attaches) {
          this.attaches = attaches;
      }
    
    public String getVillageIds() {
        return villageIds;
    }

      public void setVillageIds(String villageIds) {
          this.villageIds = villageIds;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Integer getFrequency() {
        return frequency;
    }

      public void setFrequency(Integer frequency) {
          this.frequency = frequency;
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
        return "VoteInfo{" +
              ", id=" + id +
                  ", title=" + title +
                  ", author=" + author +
                  ", beginTime=" + beginTime +
                  ", endTime=" + endTime +
                  ", rules=" + rules +
                  ", attaches=" + attaches +
                  ", villageIds=" + villageIds +
                  ", type=" + type +
                  ", frequency=" + frequency +
                  ", state=" + state +
                  ", createTime=" + createTime +
                  ", createAdmin=" + createAdmin +
                  ", updateTime=" + updateTime +
                  ", updateAdmin=" + updateAdmin +
              "}";
    }
}
