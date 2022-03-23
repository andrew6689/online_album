package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdClusterLabel;
import com.aiwinn.album.mapper.CmdClusterLabelMapper;
import com.aiwinn.album.service.ICmdClusterLabelService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 人脸聚类标签信息
 * @author： jeecg-boot
 * @date：   2021-04-12
 * @version： V1.0
 */
@Service
public class CmdClusterLabelServiceImpl extends ServiceImpl<CmdClusterLabelMapper, CmdClusterLabel> implements ICmdClusterLabelService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public List<CmdClusterLabel> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public void insertList(String tab, List<CmdClusterLabel> list) {
        baseMapper.insertList(tab, list);
    }

    @Override
    public void deleteByClusterIdAndLabel(String tab, String clusterId, String label) {
        baseMapper.deleteByClusterIdAndLabel(tab, clusterId, label);
    }

    @Override
    public Long getIdByClusterId(String tab, String clusterId) {
        return baseMapper.selectIdByClusterId(tab, clusterId);
    }
}
