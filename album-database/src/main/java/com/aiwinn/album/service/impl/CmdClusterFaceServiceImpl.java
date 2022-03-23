package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdClusterFace;
import com.aiwinn.album.mapper.CmdClusterFaceMapper;
import com.aiwinn.album.service.ICmdClusterFaceService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 人脸聚类标签人脸信息
 * @author： jeecg-boot
 * @date：   2021-04-12
 * @version： V1.0
 */
@Service
public class CmdClusterFaceServiceImpl extends ServiceImpl<CmdClusterFaceMapper, CmdClusterFace> implements ICmdClusterFaceService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public List<CmdClusterFace> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public int updateByClusterIdLabelPictureId(String tab, CmdClusterFace record) {
        return baseMapper.updateByClusterIdLabelPictureId(tab, record);
    }

    @Override
    public void insertList(String tab, List<CmdClusterFace> list) {
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
