package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdDbRouterInfo;
import com.aiwinn.album.mapper.CmdDbRouterInfoMapper;
import com.aiwinn.album.service.ICmdDbRouterInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 中心数据库路由信息
 * @author： jeecg-boot
 * @date：   2021-04-12
 * @version： V1.0
 */
@Service
public class CmdDbRouterInfoServiceImpl extends ServiceImpl<CmdDbRouterInfoMapper, CmdDbRouterInfo> implements ICmdDbRouterInfoService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdDbRouterInfo record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public CmdDbRouterInfo getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }
}
