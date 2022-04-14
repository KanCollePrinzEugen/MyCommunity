package cn.work.prinzeugen.community.service.impl;

import cn.work.prinzeugen.community.entity.BbsPost;
import cn.work.prinzeugen.community.mapper.BbsPostMapper;
import cn.work.prinzeugen.community.service.IBbsPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子信息 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class BbsPostServiceImpl extends ServiceImpl<BbsPostMapper, BbsPost> implements IBbsPostService {

}
