package cn.work.prinzeugen.community.service.impl;

import cn.work.prinzeugen.community.entity.MallOrder;
import cn.work.prinzeugen.community.mapper.MallOrderMapper;
import cn.work.prinzeugen.community.service.IMallOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class MallOrderServiceImpl extends ServiceImpl<MallOrderMapper, MallOrder> implements IMallOrderService {

}
