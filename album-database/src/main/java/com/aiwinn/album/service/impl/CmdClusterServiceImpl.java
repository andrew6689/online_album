package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdCluster;
import com.aiwinn.album.mapper.CmdClusterMapper;
import com.aiwinn.album.service.ICmdClusterService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务聚类结果
 * @author： jeecg-boot
 * @date：   2021-04-15
 * @version： V1.0
 */
@Service
public class CmdClusterServiceImpl extends ServiceImpl<CmdClusterMapper, CmdCluster> implements ICmdClusterService {

    @Override
    public CmdCluster getByResultId(String resultId) {
        return baseMapper.selectByResultId(resultId);
    }

    @Override
    public void updateGetTime(CmdCluster cmdCluster) {
        baseMapper.updateGetTime(cmdCluster);
    }
}
