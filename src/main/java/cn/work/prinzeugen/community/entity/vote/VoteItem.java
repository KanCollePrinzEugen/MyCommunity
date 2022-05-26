package cn.work.prinzeugen.community.entity.vote;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 投票选项,用户的选择
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("vote_item")
@ApiModel(value = "VoteItem对象", description = "投票选项,用户的选择")
public class VoteItem implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("所属投票")
      private Integer infoId;

      @ApiModelProperty("投票题目")
      private String topic;

      @ApiModelProperty("投票选项:保存的为投票可选择项的json字符串")
      private String options;

      @ApiModelProperty("投票选项方式：1：单选，2：多选")
      private Integer selects;

      @ApiModelProperty("最少选项数")
      private Integer minSelect;

      @ApiModelProperty("最多选项数")
      private Integer maxSelect;

      @ApiModelProperty("状态；-1：删除，0：禁用，1：启用")
      private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getInfoId() {
        return infoId;
    }

      public void setInfoId(Integer infoId) {
          this.infoId = infoId;
      }
    
    public String getTopic() {
        return topic;
    }

      public void setTopic(String topic) {
          this.topic = topic;
      }
    
    public String getOptions() {
        return options;
    }

      public void setOptions(String options) {
          this.options = options;
      }
    
    public Integer getSelects() {
        return selects;
    }

      public void setSelects(Integer selects) {
          this.selects = selects;
      }
    
    public Integer getMinSelect() {
        return minSelect;
    }

      public void setMinSelect(Integer minSelect) {
          this.minSelect = minSelect;
      }
    
    public Integer getMaxSelect() {
        return maxSelect;
    }

      public void setMaxSelect(Integer maxSelect) {
          this.maxSelect = maxSelect;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "VoteItem{" +
              ", id=" + id +
                  ", infoId=" + infoId +
                  ", topic=" + topic +
                  ", options=" + options +
                  ", selects=" + selects +
                  ", minSelect=" + minSelect +
                  ", maxSelect=" + maxSelect +
                  ", state=" + state +
              "}";
    }
}
