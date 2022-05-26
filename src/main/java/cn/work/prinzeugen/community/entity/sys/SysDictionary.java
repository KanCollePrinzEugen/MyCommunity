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
 * 系统_数据字典
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_dictionary")
@ApiModel(value = "SysDictionary对象", description = "系统_数据字典")
public class SysDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer pid;

      @ApiModelProperty("配置名")
      private String keyName;

      @ApiModelProperty("配置值")
      private String keyValue;

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
    
    public Integer getPid() {
        return pid;
    }

      public void setPid(Integer pid) {
          this.pid = pid;
      }
    
    public String getKeyName() {
        return keyName;
    }

      public void setKeyName(String keyName) {
          this.keyName = keyName;
      }
    
    public String getKeyValue() {
        return keyValue;
    }

      public void setKeyValue(String keyValue) {
          this.keyValue = keyValue;
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
        return "SysDictionary{" +
              ", id=" + id +
                  ", pid=" + pid +
                  ", keyName=" + keyName +
                  ", keyValue=" + keyValue +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
