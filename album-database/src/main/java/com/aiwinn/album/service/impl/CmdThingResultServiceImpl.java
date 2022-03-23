package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThingResult;
import com.aiwinn.album.mapper.CmdThingResultMapper;
import com.aiwinn.album.service.ICmdThingResultService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 事物分类结果
 * @author： jeecg-boot
 * @date：   2021-04-15
 * @version： V1.0
 */
@Service
public class CmdThingResultServiceImpl extends ServiceImpl<CmdThingResultMapper, CmdThingResult> implements ICmdThingResultService {

    @Override
    public CmdThingResult getByResultId(String resultId) {
        return baseMapper.selectByResultId(resultId);
    }

    @Override
    public void updateGetTime(CmdThingResult cmdThingResult) {
        baseMapper.updateGetTime(cmdThingResult);
    }
}
