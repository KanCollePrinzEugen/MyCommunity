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
 * 板块信息表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("bbs_topic")
@ApiModel(value = "BbsTopic对象", description = "板块信息表")
public class BbsTopic implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("板块名称")
      private String name;

    private Integer sortSet;

      @ApiModelProperty("板块图标")
      private String icon;

      @ApiModelProperty("板块说明")
      private String remarks;

      @ApiModelProperty("状态:-1：删除，0：禁用，1：启用")
      private Integer state;

    private Integer creater;

    private LocalDateTime createTime;

    private Integer updater;

    private LocalDateTime updateTime;

    
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
    
    public Integer getSortSet() {
        return sortSet;
    }

      public void setSortSet(Integer sortSet) {
          this.sortSet = sortSet;
      }
    
    public String getIcon() {
        return icon;
    }

      public void setIcon(String icon) {
          this.icon = icon;
      }
    
    public String getRemarks() {
        return remarks;
    }

      public void setRemarks(String remarks) {
          this.remarks = remarks;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }
    
    public Integer getCreater() {
        return creater;
    }

      public void setCreater(Integer creater) {
          this.creater = creater;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public Integer getUpdater() {
        return updater;
    }

      public void setUpdater(Integer updater) {
          this.updater = updater;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }

    @Override
    public String toString() {
        return "BbsTopic{" +
              ", id=" + id +
                  ", name=" + name +
                  ", sortSet=" + sortSet +
                  ", icon=" + icon +
                  ", remarks=" + remarks +
                  ", state=" + state +
                  ", creater=" + creater +
                  ", createTime=" + createTime +
                  ", updater=" + updater +
                  ", updateTime=" + updateTime +
              "}";
    }
}
