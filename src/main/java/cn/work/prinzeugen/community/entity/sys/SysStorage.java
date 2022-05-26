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
 * 文件存储表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_storage")
@ApiModel(value = "SysStorage对象", description = "文件存储表")
public class SysStorage implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("文件唯一索引")
      private String hash;

      @ApiModelProperty("文件名称")
      private String name;

      @ApiModelProperty("文件类型")
      private String type;

      @ApiModelProperty("文件大小")
      private Integer size;

      @ApiModelProperty("文件访问地址")
      private String url;

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
    
    public String getHash() {
        return hash;
    }

      public void setHash(String hash) {
          this.hash = hash;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getType() {
        return type;
    }

      public void setType(String type) {
          this.type = type;
      }
    
    public Integer getSize() {
        return size;
    }

      public void setSize(Integer size) {
          this.size = size;
      }
    
    public String getUrl() {
        return url;
    }

      public void setUrl(String url) {
          this.url = url;
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
        return "SysStorage{" +
              ", id=" + id +
                  ", hash=" + hash +
                  ", name=" + name +
                  ", type=" + type +
                  ", size=" + size +
                  ", url=" + url +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
