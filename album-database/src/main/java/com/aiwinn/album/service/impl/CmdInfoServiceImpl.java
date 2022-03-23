package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdInfo;
import com.aiwinn.album.mapper.CmdInfoMapper;
import com.aiwinn.album.service.ICmdInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务信息
 * @author： jeecg-boot
 * @date：   2021-04-13
 * @version： V1.0
 */
@Service
public class CmdInfoServiceImpl extends ServiceImpl<CmdInfoMapper, CmdInfo> implements ICmdInfoService {

    @Override
    public int updateByCmdIdSelective(CmdInfo record) {
        return baseMapper.updateByCmdIdSelective(record);
    }

    @Override
    public CmdInfo getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }

    @Override
    public List<CmdInfo> getSameCmdInfoByclusterId(String clusterId) {
        return baseMapper.selectSameCmdInfoByclusterId(clusterId);
    }

    @Override
    public int getVipClusterIdCount(String clusterId) {
        return baseMapper.selectVipClusterIdCount(clusterId);
    }

    @Override
    public int getVipClusterId2Count(String clusterId) {
        return baseMapper.selectVipClusterId2Count(clusterId);
    }
}
