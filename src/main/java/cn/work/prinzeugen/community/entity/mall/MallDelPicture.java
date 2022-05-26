package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 删除的图片信息
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_del_picture")
@ApiModel(value = "MallDelPicture对象", description = "删除的图片信息")
public class MallDelPicture implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String picUrl;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getPicUrl() {
        return picUrl;
    }

      public void setPicUrl(String picUrl) {
          this.picUrl = picUrl;
      }

    @Override
    public String toString() {
        return "MallDelPicture{" +
              ", id=" + id +
                  ", picUrl=" + picUrl +
              "}";
    }
}
