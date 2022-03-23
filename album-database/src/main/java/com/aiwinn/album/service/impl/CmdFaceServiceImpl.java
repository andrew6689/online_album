package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdFace;
import com.aiwinn.album.mapper.CmdFaceMapper;
import com.aiwinn.album.service.ICmdFaceService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务人脸
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdFaceServiceImpl extends ServiceImpl<CmdFaceMapper, CmdFace> implements ICmdFaceService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdFace record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public List<CmdFace> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public int getConutByClusterIdAndMd5AndPosition(String tab, String clusterId, String pictureMd5, String facePosition) {
        return baseMapper.selectConutByClusterIdAndMd5AndPosition(tab, clusterId, pictureMd5, facePosition);
    }

    @Override
    public CmdFace getByClusterIdAndMd5AndPosition(String tab, String clusterId, String pictureMd5, String facePosition) {
        return baseMapper.selectByClusterIdAndMd5AndPosition(tab, clusterId, pictureMd5, facePosition);
    }

    @Override
    public void updateByClusterIdAndMd5AndPositionSelective(String tab, CmdFace record) {
        baseMapper.updateByClusterIdAndMd5AndPositionSelective(tab, record);
    }
}
