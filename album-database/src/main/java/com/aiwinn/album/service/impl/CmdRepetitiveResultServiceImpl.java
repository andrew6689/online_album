package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdRepetitiveResult;
import com.aiwinn.album.mapper.CmdRepetitiveResultMapper;
import com.aiwinn.album.service.ICmdRepetitiveResultService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 云端去重结果
 * @author： jeecg-boot
 * @date：   2021-04-15
 * @version： V1.0
 */
@Service
public class CmdRepetitiveResultServiceImpl extends ServiceImpl<CmdRepetitiveResultMapper, CmdRepetitiveResult> implements ICmdRepetitiveResultService {

    @Override
    public CmdRepetitiveResult getByResultId(String resultId) {
        return baseMapper.selectByResultId(resultId);
    }

    @Override
    public void updateGetTime(CmdRepetitiveResult cmdRepetitiveResult) {
        baseMapper.updateGetTime(cmdRepetitiveResult);
    }
}
