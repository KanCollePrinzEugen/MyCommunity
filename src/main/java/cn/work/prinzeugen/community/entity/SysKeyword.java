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
 * 关键字表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_keyword")
@ApiModel(value = "SysKeyword对象", description = "关键字表")
public class SysKeyword implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("关键字")
      private String keyword;

      @ApiModelProperty("关键字跳转链接")
      private String url;

      @ApiModelProperty("是否是热门关键字")
      private Boolean isHot;

      @ApiModelProperty("是否是默认关键字")
      private Boolean isDefault;

      @ApiModelProperty("排序")
      private Integer sortOrder;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getKeyword() {
        return keyword;
    }

      public void setKeyword(String keyword) {
          this.keyword = keyword;
      }
    
    public String getUrl() {
        return url;
    }

      public void setUrl(String url) {
          this.url = url;
      }
    
    public Boolean getIsHot() {
        return isHot;
    }

      public void setIsHot(Boolean isHot) {
          this.isHot = isHot;
      }
    
    public Boolean getIsDefault() {
        return isDefault;
    }

      public void setIsDefault(Boolean isDefault) {
          this.isDefault = isDefault;
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
        return "SysKeyword{" +
              ", id=" + id +
                  ", keyword=" + keyword +
                  ", url=" + url +
                  ", isHot=" + isHot +
                  ", isDefault=" + isDefault +
                  ", sortOrder=" + sortOrder +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
