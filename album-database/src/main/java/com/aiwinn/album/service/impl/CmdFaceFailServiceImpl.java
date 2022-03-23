package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdFaceFail;
import com.aiwinn.album.mapper.CmdFaceFailMapper;
import com.aiwinn.album.service.ICmdFaceFailService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务人脸失败
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdFaceFailServiceImpl extends ServiceImpl<CmdFaceFailMapper, CmdFaceFail> implements ICmdFaceFailService {

    @Override
    public List<CmdFaceFail> getByClusterId(String clusterId) {
        return baseMapper.selectByClusterId(clusterId);
    }

    @Override
    public CmdFaceFail getByClusterIdAndMd5AndPosition(String clusterId, String pictureMd5, String facePosition) {
        return baseMapper.selectByClusterIdAndMd5AndPosition(clusterId, pictureMd5, facePosition);
    }

    @Override
    public void deleteByClusterId(String clusterId) {
        baseMapper.deleteByClusterId(clusterId);
    }
}
