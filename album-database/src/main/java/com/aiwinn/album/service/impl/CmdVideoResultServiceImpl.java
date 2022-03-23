package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdVideoResult;
import com.aiwinn.album.mapper.CmdVideoResultMapper;
import com.aiwinn.album.service.ICmdVideoResultService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 视频分析结果
 * @author： jeecg-boot
 * @date：   2021-06-29
 * @version： V1.0
 */
@Service
public class CmdVideoResultServiceImpl extends ServiceImpl<CmdVideoResultMapper, CmdVideoResult> implements ICmdVideoResultService {

    @Override
    public CmdVideoResult getByResultId(String resultId) {
        return baseMapper.selectByResultId(resultId);
    }

    @Override
    public void updateGetTime(CmdVideoResult cmdVideoResult) {
        baseMapper.updateGetTime(cmdVideoResult);
    }

}
