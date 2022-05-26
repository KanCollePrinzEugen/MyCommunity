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
 * 评论表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_comment")
@ApiModel(value = "MallComment对象", description = "评论表")
public class MallComment implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("如果type=0，则是商品评论；如果是type=1，则是专题评论。")
      private Integer valueId;

      @ApiModelProperty("评论类型，如果type=0，则是商品评论；如果是type=1，则是专题评论；如果type=3，则是订单商品评论。")
      private Integer type;

      @ApiModelProperty("评论内容")
      private String content;

      @ApiModelProperty("用户表的用户ID")
      private Integer userId;

      @ApiModelProperty("是否含有图片")
      private Boolean hasPicture;

      @ApiModelProperty("图片地址")
      private String picUrls;

      @ApiModelProperty("评分， 1-5")
      private Integer star;

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
    
    public Integer getValueId() {
        return valueId;
    }

      public void setValueId(Integer valueId) {
          this.valueId = valueId;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public Boolean getHasPicture() {
        return hasPicture;
    }

      public void setHasPicture(Boolean hasPicture) {
          this.hasPicture = hasPicture;
      }
    
    public String getPicUrls() {
        return picUrls;
    }

      public void setPicUrls(String picUrls) {
          this.picUrls = picUrls;
      }
    
    public Integer getStar() {
        return star;
    }

      public void setStar(Integer star) {
          this.star = star;
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
        return "MallComment{" +
              ", id=" + id +
                  ", valueId=" + valueId +
                  ", type=" + type +
                  ", content=" + content +
                  ", userId=" + userId +
                  ", hasPicture=" + hasPicture +
                  ", picUrls=" + picUrls +
                  ", star=" + star +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
