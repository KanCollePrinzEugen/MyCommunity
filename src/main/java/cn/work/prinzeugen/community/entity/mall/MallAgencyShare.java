package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 信息分享表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_agency_share")
@ApiModel(value = "MallAgencyShare对象", description = "信息分享表")
public class MallAgencyShare implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户id")
      private Integer userId;

    private String shareUrl;

      @ApiModelProperty("分享对象类型 1：商品 2：品牌商铺 3：团购")
      private Integer type;

      @ApiModelProperty("分享对象id")
      private Integer shareObjId;

      @ApiModelProperty("添加时间")
      private LocalDateTime addTime;

      @ApiModelProperty("最后更新时间")
      private LocalDateTime updateTime;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public String getShareUrl() {
        return shareUrl;
    }

      public void setShareUrl(String shareUrl) {
          this.shareUrl = shareUrl;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Integer getShareObjId() {
        return shareObjId;
    }

      public void setShareObjId(Integer shareObjId) {
          this.shareObjId = shareObjId;
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

    @Override
    public String toString() {
        return "MallAgencyShare{" +
              ", id=" + id +
                  ", userId=" + userId +
                  ", shareUrl=" + shareUrl +
                  ", type=" + type +
                  ", shareObjId=" + shareObjId +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
              "}";
    }
}
