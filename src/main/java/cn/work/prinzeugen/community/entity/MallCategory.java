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
 * 类目表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_category")
@ApiModel(value = "MallCategory对象", description = "类目表")
public class MallCategory implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("类目名称")
      private String name;

      @ApiModelProperty("类目关键字")
      private String keywords;

      @ApiModelProperty("介绍")
      private String desction;

      @ApiModelProperty("父类目ID")
      private Integer pid;

      @ApiModelProperty("类目图标")
      private String iconUrl;

      @ApiModelProperty("类目图片")
      private String picUrl;

      @ApiModelProperty("级别")
      private String level;

      @ApiModelProperty("排序")
      private Integer sortOrder;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("逻辑删除:-1：删除，0：禁用，1：启用")
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
    
    public String getKeywords() {
        return keywords;
    }

      public void setKeywords(String keywords) {
          this.keywords = keywords;
      }
    
    public String getDesction() {
        return desction;
    }

      public void setDesction(String desction) {
          this.desction = desction;
      }
    
    public Integer getPid() {
        return pid;
    }

      public void setPid(Integer pid) {
          this.pid = pid;
      }
    
    public String getIconUrl() {
        return iconUrl;
    }

      public void setIconUrl(String iconUrl) {
          this.iconUrl = iconUrl;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }
    
    public String getLevel() {
        return level;
    }

      public void setLevel(String level) {
          this.level = level;
      }
    
    public Integer getSortOrder() {
        return sortOrder;
    }

      public void setSortOrder(Integer sortOrder) {
          this.sortOrder = sortOrder;
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
        return "MallCategory{" +
              ", id=" + id +
                  ", name=" + name +
                  ", keywords=" + keywords +
                  ", desction=" + desction +
                  ", pid=" + pid +
                  ", iconUrl=" + iconUrl +
                  ", picUrl=" + picUrl +
                  ", level=" + level +
                  ", sortOrder=" + sortOrder +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
