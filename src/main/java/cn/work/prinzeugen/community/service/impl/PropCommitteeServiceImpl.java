package cn.work.prinzeugen.community.service.impl;

import cn.work.prinzeugen.community.entity.PropCommittee;
import cn.work.prinzeugen.community.mapper.PropCommitteeMapper;
import cn.work.prinzeugen.community.service.IPropCommitteeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业委会信息表,包括介绍、人员说明、佐证材料 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class PropCommitteeServiceImpl extends ServiceImpl<PropCommitteeMapper, PropCommittee> implements IPropCommitteeService {

}
