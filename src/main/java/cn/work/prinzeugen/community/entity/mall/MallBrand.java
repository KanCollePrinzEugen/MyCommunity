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
 * 品牌商表
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_brand")
@ApiModel(value = "MallBrand对象", description = "品牌商表")
public class MallBrand implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("品牌商名称")
      private String name;

      @ApiModelProperty("品牌商说明")
      private String desction;

      @ApiModelProperty("品牌商图片")
      private String picUrl;

      @ApiModelProperty("排序")
      private Integer sortOrder;

      @ApiModelProperty("品牌商的商品低价，仅用于页面展示")
      private BigDecimal floorPrice;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("更新时间")
      private LocalDateTime updateTime;

    private String shareUrl;

      @ApiModelProperty("管理用户id")
      private Integer adminId;

    private String commpany;

      @ApiModelProperty("自动监控更新商品")
      private Boolean autoUpdateGood;

    private String shopUrl;

      @ApiModelProperty("默认的商品类别id")
      private Integer defaultCategoryId;

      @ApiModelProperty("默认商品页面数")
      private Integer defaultPages;

      @ApiModelProperty("店铺商品溢价")
      private Integer addPrecent;

    private String address;

      @ApiModelProperty("经度")
      private BigDecimal longitude;

      @ApiModelProperty("纬度")
      private BigDecimal latitude;

    private String fetchTimeRules;

      @ApiModelProperty("状态: -1：删除，0：禁用，1：启用")
      private Boolean state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getDesction() {
        return desction;
    }

      public void setDesction(String desction) {
          this.desction = desction;
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
    
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

      public void setFloorPrice(BigDecimal floorPrice) {
          this.floorPrice = floorPrice;
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
    
    public Integer getAdminId() {
        return adminId;
    }

      public void setAdminId(Integer adminId) {
          this.adminId = adminId;
      }
    
    public String getCommpany() {
        return commpany;
    }

      public void setCommpany(String commpany) {
          this.commpany = commpany;
      }
    
    public Boolean getAutoUpdateGood() {
        return autoUpdateGood;
    }

      public void setAutoUpdateGood(Boolean autoUpdateGood) {
          this.autoUpdateGood = autoUpdateGood;
      }
    
    public String getShopUrl() {
        return shopUrl;
    }

      public void setShopUrl(String shopUrl) {
          this.shopUrl = shopUrl;
      }
    
    public Integer getDefaultCategoryId() {
        return defaultCategoryId;
    }

      public void setDefaultCategoryId(Integer defaultCategoryId) {
          this.defaultCategoryId = defaultCategoryId;
      }
    
    public Integer getDefaultPages() {
        return defaultPages;
    }

      public void setDefaultPages(Integer defaultPages) {
          this.defaultPages = defaultPages;
      }
    
    public Integer getAddPrecent() {
        return addPrecent;
    }

      public void setAddPrecent(Integer addPrecent) {
          this.addPrecent = addPrecent;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public BigDecimal getLongitude() {
        return longitude;
    }

      public void setLongitude(BigDecimal longitude) {
          this.longitude = longitude;
      }
    
    public BigDecimal getLatitude() {
        return latitude;
    }

      public void setLatitude(BigDecimal latitude) {
          this.latitude = latitude;
      }
    
    public String getFetchTimeRules() {
        return fetchTimeRules;
    }

      public void setFetchTimeRules(String fetchTimeRules) {
          this.fetchTimeRules = fetchTimeRules;
      }
    
    public Boolean getState() {
        return state;
    }

      public void setState(Boolean state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "MallBrand{" +
              ", id=" + id +
                  ", name=" + name +
                  ", desction=" + desction +
                  ", picUrl=" + picUrl +
                  ", sortOrder=" + sortOrder +
                  ", floorPrice=" + floorPrice +
                  ", addTime=" + addTime +
                  ", updateTime=" + updateTime +
                  ", shareUrl=" + shareUrl +
                  ", adminId=" + adminId +
                  ", commpany=" + commpany +
                  ", autoUpdateGood=" + autoUpdateGood +
                  ", shopUrl=" + shopUrl +
                  ", defaultCategoryId=" + defaultCategoryId +
                  ", defaultPages=" + defaultPages +
                  ", addPrecent=" + addPrecent +
                  ", address=" + address +
                  ", longitude=" + longitude +
                  ", latitude=" + latitude +
                  ", fetchTimeRules=" + fetchTimeRules +
                  ", state=" + state +
              "}";
    }
}
