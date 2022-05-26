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
 * 配置系统的相关信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_config")
@ApiModel(value = "SysConfig对象", description = "配置系统的相关信息")
public class SysConfig implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("识别编码")
      private String code;

      @ApiModelProperty("名称")
      private String name;

      @ApiModelProperty("配置值")
      private String value;

      @ApiModelProperty("说明")
      private String remarks;

      @ApiModelProperty("创建管理员")
      private Integer creater;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("修改管理员")
      private Integer updater;

      @ApiModelProperty("修改时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
      private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getCode() {
        return code;
    }

      public void setCode(String code) {
          this.code = code;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getValue() {
        return value;
    }

      public void setValue(String value) {
          this.value = value;
      }
    
    public String getRemarks() {
        return remarks;
    }

      public void setRemarks(String remarks) {
          this.remarks = remarks;
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
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "SysConfig{" +
              ", id=" + id +
                  ", code=" + code +
                  ", name=" + name +
                  ", value=" + value +
                  ", remarks=" + remarks +
                  ", creater=" + creater +
                  ", createTime=" + createTime +
                  ", updater=" + updater +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
