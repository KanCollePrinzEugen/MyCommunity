package cn.work.prinzeugen.community.entity.prop;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业委会信息表,包括介绍、人员说明、佐证材料
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("prop_committee")
@ApiModel(value = "PropCommittee对象", description = "业委会信息表,包括介绍、人员说明、佐证材料")
public class PropCommittee implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        private Integer id;

      @ApiModelProperty("所属小区")
      private Integer villageId;

      @ApiModelProperty("名称")
      private String name;

      @ApiModelProperty("说明")
      private String remarks;

      @ApiModelProperty("证明材料:json格式的字符串")
      private String confirmAttach;

    private LocalDate establishTime;

    private LocalDateTime createTime;

    private Integer createAdminId;

      @ApiModelProperty("状态:-1:删除，0：禁用，1：启用")
      private Integer state;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getVillageId() {
        return villageId;
    }

      public void setVillageId(Integer villageId) {
          this.villageId = villageId;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getRemarks() {
        return remarks;
    }

      public void setRemarks(String remarks) {
          this.remarks = remarks;
      }
    
    public String getConfirmAttach() {
        return confirmAttach;
    }

      public void setConfirmAttach(String confirmAttach) {
          this.confirmAttach = confirmAttach;
      }
    
    public LocalDate getEstablishTime() {
        return establishTime;
    }

      public void setEstablishTime(LocalDate establishTime) {
          this.establishTime = establishTime;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public Integer getCreateAdminId() {
        return createAdminId;
    }

      public void setCreateAdminId(Integer createAdminId) {
          this.createAdminId = createAdminId;
      }
    
    public Integer getState() {
        return state;
    }

      public void setState(Integer state) {
          this.state = state;
      }

    @Override
    public String toString() {
        return "PropCommittee{" +
              ", id=" + id +
                  ", villageId=" + villageId +
                  ", name=" + name +
                  ", remarks=" + remarks +
                  ", confirmAttach=" + confirmAttach +
                  ", establishTime=" + establishTime +
                  ", createTime=" + createTime +
                  ", createAdminId=" + createAdminId +
                  ", state=" + state +
              "}";
    }
}
