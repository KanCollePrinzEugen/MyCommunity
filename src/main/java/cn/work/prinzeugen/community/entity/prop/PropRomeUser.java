package cn.work.prinzeugen.community.entity.prop;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 房号用户关联表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("prop_rome_user")
@ApiModel(value = "PropRomeUser对象", description = "房号用户关联表")
public class PropRomeUser implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("住房编号")
      private Integer roomId;

      @ApiModelProperty("用户编号")
      private Integer userId;

      @ApiModelProperty("关系类型: 0:未确认，1:业主  2：家人   3：租户  4：租户家人")
      private Integer type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

      @ApiModelProperty("验证材料:用户上传的材料，房产证，身份证等证明材料")
      private String confirmAttach;

      @ApiModelProperty("确认的管理员编号")
      private Integer confirmAdmin;

    private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getRoomId() {
        return roomId;
    }

      public void setRoomId(Integer roomId) {
          this.roomId = roomId;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public String getConfirmAttach() {
        return confirmAttach;
    }

      public void setConfirmAttach(String confirmAttach) {
          this.confirmAttach = confirmAttach;
      }
    
    public Integer getConfirmAdmin() {
        return confirmAdmin;
    }

      public void setConfirmAdmin(Integer confirmAdmin) {
          this.confirmAdmin = confirmAdmin;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "PropRomeUser{" +
              ", id=" + id +
                  ", roomId=" + roomId +
                  ", userId=" + userId +
                  ", type=" + type +
                  ", createTime=" + createTime +
                  ", updateTime=" + updateTime +
                  ", confirmAttach=" + confirmAttach +
                  ", confirmAdmin=" + confirmAdmin +
                  ", state=" + state +
              "}";
    }
}
