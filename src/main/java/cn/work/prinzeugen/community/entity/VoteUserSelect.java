package cn.work.prinzeugen.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户投票的信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("vote_user_select")
@ApiModel(value = "VoteUserSelect对象", description = "用户投票的信息")
public class VoteUserSelect implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Long id;

      @ApiModelProperty("所属投票项")
      private Integer itemId;

      @ApiModelProperty("用户编号")
      private Integer userId;

      @ApiModelProperty("选项,如果是多选，那么用逗号分割")
      private String selectIds;

      @ApiModelProperty("投票时间")
      private LocalDateTime createTime;

      @ApiModelProperty("投票来源,:1:小程序，2：PC网站，3：微站，4：app")
      private Integer source;

      @ApiModelProperty("投票IP地址:投票时使用的IP地址")
      private String ip;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public Integer getItemId() {
        return itemId;
    }

      public void setItemId(Integer itemId) {
          this.itemId = itemId;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public String getSelectIds() {
        return selectIds;
    }

      public void setSelectIds(String selectIds) {
          this.selectIds = selectIds;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public Integer getSource() {
        return source;
    }

      public void setSource(Integer source) {
          this.source = source;
      }
    
    public String getIp() {
        return ip;
    }

      public void setIp(String ip) {
          this.ip = ip;
      }

    @Override
    public String toString() {
        return "VoteUserSelect{" +
              ", id=" + id +
                  ", itemId=" + itemId +
                  ", userId=" + userId +
                  ", selectIds=" + selectIds +
                  ", createTime=" + createTime +
                  ", source=" + source +
                  ", ip=" + ip +
              "}";
    }
}
