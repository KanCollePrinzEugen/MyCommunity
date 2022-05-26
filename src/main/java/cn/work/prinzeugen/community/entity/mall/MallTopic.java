package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 专题表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_topic")
@ApiModel(value = "MallTopic对象", description = "专题表")
public class MallTopic implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("标题")
      private String title;

      @ApiModelProperty("子标题")
      private String subtitle;

      @ApiModelProperty("专题内容")
      private String content;

      @ApiModelProperty("专题相关商品最低价")
      private BigDecimal price;

      @ApiModelProperty("专题阅读量")
      private String readCount;

      @ApiModelProperty("专题图片")
      private String picUrl;

      @ApiModelProperty("排序")
      private Integer sortOrder;

      @ApiModelProperty("商品序列码")
      private String goods;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("分享的二维码地址")
      private String shareUrl;

      @ApiModelProperty("状态：-1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getSubtitle() {
        return subtitle;
    }

      public void setSubtitle(String subtitle) {
          this.subtitle = subtitle;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
      }
    
    public BigDecimal getPrice() {
        return price;
    }

      public void setPrice(BigDecimal price) {
          this.price = price;
      }
    
    public String getReadCount() {
        return readCount;
    }

      public void setReadCount(String readCount) {
          this.readCount = readCount;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }
    
    public Integer getSortOrder() {
        return sortOrder;
    }

      public void setSortOrder(Integer sortOrder) {
          this.sortOrder = sortOrder;
      }
    
    public String getGoods() {
        return goods;
    }

      public void setGoods(String goods) {
          this.goods = goods;
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
    
    public String getShareUrl() {
        return shareUrl;
    }

      public void setShareUrl(String shareUrl) {
          this.shareUrl = shareUrl;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallTopic{" +
              ", id=" + id +
                  ", title=" + title +
                  ", subtitle=" + subtitle +
                  ", content=" + content +
                  ", price=" + price +
                  ", readCount=" + readCount +
                  ", picUrl=" + picUrl +
                  ", sortOrder=" + sortOrder +
                  ", goods=" + goods +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", shareUrl=" + shareUrl +
                  ", state=" + state +
              "}";
    }
}
