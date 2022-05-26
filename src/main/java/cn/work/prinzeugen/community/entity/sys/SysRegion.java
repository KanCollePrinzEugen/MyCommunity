package cn.work.prinzeugen.community.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 行政区域表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("sys_region")
@ApiModel(value = "SysRegion对象", description = "行政区域表")
public class SysRegion implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0")
      private Integer pid;

      @ApiModelProperty("名称")
      private String name;

      @ApiModelProperty("行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县")
      private Integer type;

      @ApiModelProperty("行政区域编码")
      private Integer code;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
      private Integer state;

    
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
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Integer getCode() {
        return code;
    }

      public void setCode(Integer code) {
          this.code = code;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "SysRegion{" +
              ", id=" + id +
                  ", pid=" + pid +
                  ", name=" + name +
                  ", type=" + type +
                  ", code=" + code +
                  ", state=" + state +
              "}";
    }
}
