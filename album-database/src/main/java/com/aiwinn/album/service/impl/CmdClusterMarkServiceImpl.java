package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdClusterMark;
import com.aiwinn.album.mapper.CmdClusterMarkMapper;
import com.aiwinn.album.service.ICmdClusterMarkService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 人脸标注
 * @author： jeecg-boot
 * @date：   2021-04-16
 * @version： V1.0
 */
@Service
public class CmdClusterMarkServiceImpl extends ServiceImpl<CmdClusterMarkMapper, CmdClusterMark> implements ICmdClusterMarkService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public void insertExcludeList(String tab, List<CmdClusterMark> list) {
        baseMapper.insertExcludeList(tab, list);
    }

    @Override
    public void insertMarkList(String tab, List<CmdClusterMark> list) {
        baseMapper.insertMarkList(tab, list);
    }

    @Override
    public List<CmdClusterMark> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public List<String> getPictureIdsByClusterIdAndExcludeLabel(String tab, String clusterId, String excludeLabel) {
        return baseMapper.selectPictureIdsByClusterIdAndExcludeLabel(tab, clusterId, excludeLabel);
    }
}
