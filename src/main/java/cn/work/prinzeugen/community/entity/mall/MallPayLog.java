package cn.work.prinzeugen.community.entity.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 微信支付记录
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@TableName("mall_pay_log")
@ApiModel(value = "MallPayLog对象", description = "微信支付记录")
public class MallPayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String orderSn;

    private String payNo;

    private BigDecimal payMoney;

    
    public String getId() {
        return id;
    }

      public void setId(String id) {
          this.id = id;
      }
    
    public String getOrderSn() {
        return orderSn;
    }

      public void setOrderSn(String orderSn) {
          this.orderSn = orderSn;
      }
    
    public String getPayNo() {
        return payNo;
    }

      public void setPayNo(String payNo) {
          this.payNo = payNo;
      }
    
    public BigDecimal getPayMoney() {
        return payMoney;
    }

      public void setPayMoney(BigDecimal payMoney) {
          this.payMoney = payMoney;
      }

    @Override
    public String toString() {
        return "MallPayLog{" +
              ", id=" + id +
                  ", orderSn=" + orderSn +
                  ", payNo=" + payNo +
                  ", payMoney=" + payMoney +
              "}";
    }
}
