package cn.work.prinzeugen.community.service.impl;

import cn.work.prinzeugen.community.entity.VoteInfo;
import cn.work.prinzeugen.community.mapper.VoteInfoMapper;
import cn.work.prinzeugen.community.service.IVoteInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票信息，用来发起投票 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class VoteInfoServiceImpl extends ServiceImpl<VoteInfoMapper, VoteInfo> implements IVoteInfoService {

}
