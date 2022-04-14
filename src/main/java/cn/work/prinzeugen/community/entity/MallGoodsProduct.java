package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品货品表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_goods_product")
@ApiModel(value = "MallGoodsProduct对象", description = "商品货品表")
public class MallGoodsProduct implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("商品表的商品ID")
      private Integer goodsId;

      @ApiModelProperty("商品规格")
      private String specifications;

      @ApiModelProperty("商品货品价格")
      private BigDecimal price;

      @ApiModelProperty("商品货品数量")
      private Integer number;

      @ApiModelProperty("货品图片")
      private String url;

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
    
    public Integer getGoodsId() {
        return goodsId;
    }

      public void setGoodsId(Integer goodsId) {
          this.goodsId = goodsId;
      }
    
    public String getSpecifications() {
        return specifications;
    }

      public void setSpecifications(String specifications) {
          this.specifications = specifications;
      }
    
    public BigDecimal getPrice() {
        return price;
    }

      public void setPrice(BigDecimal price) {
          this.price = price;
      }
    
    public Integer getNumber() {
        return number;
    }

      public void setNumber(Integer number) {
          this.number = number;
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
        return "MallGoodsProduct{" +
              ", id=" + id +
                  ", goodsId=" + goodsId +
                  ", specifications=" + specifications +
                  ", price=" + price +
                  ", number=" + number +
                  ", url=" + url +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", state=" + state +
              "}";
    }
}
