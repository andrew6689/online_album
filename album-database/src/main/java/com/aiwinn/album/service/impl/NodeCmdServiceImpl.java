package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.NodeCmd;
import com.aiwinn.album.mapper.NodeCmdMapper;
import com.aiwinn.album.service.INodeCmdService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 节点任务记录
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class NodeCmdServiceImpl extends ServiceImpl<NodeCmdMapper, NodeCmd> implements INodeCmdService {

    @Override
    public void updateFeatureIp(String featureIp, String cmdId) {
        baseMapper.updateFeatureIp(featureIp, cmdId);
    }

    @Override
    public NodeCmd getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }

    @Override
    public void updateFeatureNum(int featureNum, String cmdId) {
        baseMapper.updateFeatureNum(featureNum, cmdId);
    }

    @Override
    public int getFeatureNumByCmdId(String cmdId) {
        return baseMapper.selectFeatureNumByCmdId(cmdId);
    }

    @Override
    public void updateStatusByCmdId(int status, String cmdId) {
        baseMapper.updateStatusByCmdId(status, cmdId);
    }
}
