package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.NodeDbRouterInfo;
import com.aiwinn.album.mapper.NodeDbRouterInfoMapper;
import com.aiwinn.album.service.INodeDbRouterInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 节点数据库路由信息
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class NodeDbRouterInfoServiceImpl extends ServiceImpl<NodeDbRouterInfoMapper, NodeDbRouterInfo> implements INodeDbRouterInfoService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, NodeDbRouterInfo record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public NodeDbRouterInfo getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }
}
