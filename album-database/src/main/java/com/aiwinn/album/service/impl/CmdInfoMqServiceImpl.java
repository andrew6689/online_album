package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdInfoMq;
import com.aiwinn.album.mapper.CmdInfoMqMapper;
import com.aiwinn.album.service.ICmdInfoMqService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务信息MQ内容
 * @author： jeecg-boot
 * @date：   2021-04-13
 * @version： V1.0
 */
@Service
public class CmdInfoMqServiceImpl extends ServiceImpl<CmdInfoMqMapper, CmdInfoMq> implements ICmdInfoMqService {

    @Override
    public CmdInfoMq getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }
}
