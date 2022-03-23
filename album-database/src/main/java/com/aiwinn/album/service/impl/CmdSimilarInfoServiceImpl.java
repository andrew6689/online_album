package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdSimilarInfo;
import com.aiwinn.album.mapper.CmdSimilarInfoMapper;
import com.aiwinn.album.service.ICmdSimilarInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 以图搜图任务信息
 * @author： jeecg-boot
 * @date：   2021-04-12
 * @version： V1.0
 */
@Service
public class CmdSimilarInfoServiceImpl extends ServiceImpl<CmdSimilarInfoMapper, CmdSimilarInfo> implements ICmdSimilarInfoService {

    @Override
    public void updateByCmdIdSelective(CmdSimilarInfo record) {
        baseMapper.updateByCmdIdSelective(record);
    }

    @Override
    public CmdSimilarInfo getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }
}
