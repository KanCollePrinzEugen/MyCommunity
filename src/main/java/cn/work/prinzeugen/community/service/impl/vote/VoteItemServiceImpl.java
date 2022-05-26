package cn.work.prinzeugen.community.service.impl.vote;

import cn.work.prinzeugen.community.entity.vote.VoteItem;
import cn.work.prinzeugen.community.mapper.vote.VoteItemMapper;
import cn.work.prinzeugen.community.service.vote.IVoteItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票选项,用户的选择 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class VoteItemServiceImpl extends ServiceImpl<VoteItemMapper, VoteItem> implements IVoteItemService {

}
