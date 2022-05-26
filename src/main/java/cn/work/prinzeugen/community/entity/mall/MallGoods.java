package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品基本信息表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_goods")
@ApiModel(value = "MallGoods对象", description = "商品基本信息表")
public class MallGoods implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("商品编码")
      private String goodsSn;

      @ApiModelProperty("名称")
      private String name;

      @ApiModelProperty("商品所属类目ID")
      private Integer categoryId;

      @ApiModelProperty("品牌")
      private Integer brandId;

      @ApiModelProperty("宣传图片")
      private String gallery;

      @ApiModelProperty("关键字")
      private String keywords;

      @ApiModelProperty("商品简介")
      private String brief;

      @ApiModelProperty("是否上架")
      private Boolean isOnSale;

      @ApiModelProperty("排序")
      private Integer sortOrder;

      @ApiModelProperty("商品页面的图片")
      private String picUrl;

      @ApiModelProperty("分享时图片")
      private String shareUrl;

      @ApiModelProperty("是否新品首发，如果设置则可以在新品首发页面展示")
      private Boolean isNew;

      @ApiModelProperty("是否人气推荐，如果设置则可以在人气推荐页面展示")
      private Boolean isHot;

      @ApiModelProperty("计量单位")
      private String unit;

      @ApiModelProperty("专柜价格")
      private BigDecimal counterPrice;

      @ApiModelProperty("零售价格")
      private BigDecimal retailPrice;

      @ApiModelProperty("商品介绍")
      private String detail;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

      @ApiModelProperty("浏览量")
      private Integer browse;

      @ApiModelProperty("已销售总量")
      private Integer sales;

      @ApiModelProperty("供货单位")
      private String commpany;

      @ApiModelProperty("批发价格")
      private BigDecimal wholesalePrice;

      @ApiModelProperty("审批状态 ：4 未提交  0 待审批  1 审批通过 2 审批拒绝")
      private Integer approveStatus;

      @ApiModelProperty("审批内容")
      private String approveMsg;

      @ApiModelProperty("佣金类型 ： 0 无推广佣金  1 自定义佣金 2 代理审批比例")
      private Integer brokerageType;

      @ApiModelProperty("推广佣金金额")
      private BigDecimal brokeragePrice;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getGoodsSn() {
        return goodsSn;
    }

      public void setGoodsSn(String goodsSn) {
          this.goodsSn = goodsSn;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public Integer getCategoryId() {
        return categoryId;
    }

      public void setCategoryId(Integer categoryId) {
          this.categoryId = categoryId;
      }
    
    public Integer getBrandId() {
        return brandId;
    }

      public void setBrandId(Integer brandId) {
          this.brandId = brandId;
      }
    
    public String getGallery() {
        return gallery;
    }

      public void setGallery(String gallery) {
          this.gallery = gallery;
      }
    
    public String getKeywords() {
        return keywords;
    }

      public void setKeywords(String keywords) {
          this.keywords = keywords;
      }
    
    public String getBrief() {
        return brief;
    }

      public void setBrief(String brief) {
          this.brief = brief;
      }
    
    public Boolean getIsOnSale() {
        return isOnSale;
    }

      public void setIsOnSale(Boolean isOnSale) {
          this.isOnSale = isOnSale;
      }
    
    public Integer getSortOrder() {
        return sortOrder;
    }

      public void setSortOrder(Integer sortOrder) {
          this.sortOrder = sortOrder;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }
    
    public String getShareUrl() {
        return shareUrl;
    }

      public void setShareUrl(String shareUrl) {
          this.shareUrl = shareUrl;
      }
    
    public Boolean getIsNew() {
        return isNew;
    }

      public void setIsNew(Boolean isNew) {
          this.isNew = isNew;
      }
    
    public Boolean getIsHot() {
        return isHot;
    }

      public void setIsHot(Boolean isHot) {
          this.isHot = isHot;
      }
    
    public String getUnit() {
        return unit;
    }

      public void setUnit(String unit) {
          this.unit = unit;
      }
    
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

      public void setCounterPrice(BigDecimal counterPrice) {
          this.counterPrice = counterPrice;
      }
    
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

      public void setRetailPrice(BigDecimal retailPrice) {
          this.retailPrice = retailPrice;
      }
    
    public String getDetail() {
        return detail;
    }

      public void setDetail(String detail) {
          this.detail = detail;
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
    
    public Integer getBrowse() {
        return browse;
    }

      public void setBrowse(Integer browse) {
          this.browse = browse;
      }
    
    public Integer getSales() {
        return sales;
    }

      public void setSales(Integer sales) {
          this.sales = sales;
      }
    
    public String getCommpany() {
        return commpany;
    }

      public void setCommpany(String commpany) {
          this.commpany = commpany;
      }
    
    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

      public void setWholesalePrice(BigDecimal wholesalePrice) {
          this.wholesalePrice = wholesalePrice;
      }
    
    public Integer getApproveStatus() {
        return approveStatus;
    }

      public void setApproveStatus(Integer approveStatus) {
          this.approveStatus = approveStatus;
      }
    
    public String getApproveMsg() {
        return approveMsg;
    }

      public void setApproveMsg(String approveMsg) {
          this.approveMsg = approveMsg;
      }
    
    public Integer getBrokerageType() {
        return brokerageType;
    }

      public void setBrokerageType(Integer brokerageType) {
          this.brokerageType = brokerageType;
      }
    
    public BigDecimal getBrokeragePrice() {
        return brokeragePrice;
    }

      public void setBrokeragePrice(BigDecimal brokeragePrice) {
          this.brokeragePrice = brokeragePrice;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallGoods{" +
              ", id=" + id +
                  ", goodsSn=" + goodsSn +
                  ", name=" + name +
                  ", categoryId=" + categoryId +
                  ", brandId=" + brandId +
                  ", gallery=" + gallery +
                  ", keywords=" + keywords +
                  ", brief=" + brief +
                  ", isOnSale=" + isOnSale +
                  ", sortOrder=" + sortOrder +
                  ", picUrl=" + picUrl +
                  ", shareUrl=" + shareUrl +
                  ", isNew=" + isNew +
                  ", isHot=" + isHot +
                  ", unit=" + unit +
                  ", counterPrice=" + counterPrice +
                  ", retailPrice=" + retailPrice +
                  ", detail=" + detail +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", browse=" + browse +
                  ", sales=" + sales +
                  ", commpany=" + commpany +
                  ", wholesalePrice=" + wholesalePrice +
                  ", approveStatus=" + approveStatus +
                  ", approveMsg=" + approveMsg +
                  ", brokerageType=" + brokerageType +
                  ", brokeragePrice=" + brokeragePrice +
                  ", state=" + state +
              "}";
    }
}
