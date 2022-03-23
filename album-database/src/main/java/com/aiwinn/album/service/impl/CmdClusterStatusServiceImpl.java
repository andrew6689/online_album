package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdClusterStatus;
import com.aiwinn.album.mapper.CmdClusterStatusMapper;
import com.aiwinn.album.service.ICmdClusterStatusService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务聚类状态
 * @author： jeecg-boot
 * @date：   2021-04-15
 * @version： V1.0
 */
@Service
public class CmdClusterStatusServiceImpl extends ServiceImpl<CmdClusterStatusMapper, CmdClusterStatus> implements ICmdClusterStatusService {

    @Override
    public CmdClusterStatus getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }

    @Override
    public void updateByCmdId(CmdClusterStatus record) {
        baseMapper.updateByCmdId(record);
    }
}
