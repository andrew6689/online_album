package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdPicture;
import com.aiwinn.album.mapper.CmdPictureMapper;
import com.aiwinn.album.service.ICmdPictureService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务人脸相片
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdPictureServiceImpl extends ServiceImpl<CmdPictureMapper, CmdPicture> implements ICmdPictureService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdPicture record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public void updateByClusterIdAndMd5Selective(String tab, CmdPicture record) {
        baseMapper.updateByClusterIdAndMd5Selective(tab, record);
    }

    @Override
    public CmdPicture getByClusterIdAndMd5(String tab, String clusterId, String pictureMd5) {
        return baseMapper.selectByClusterIdAndMd5(tab, clusterId, pictureMd5);
    }

    @Override
    public List<CmdPicture> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public Long getIdByClusterId(String tab, String clusterId) {
        return baseMapper.selectIdByClusterId(tab, clusterId);
    }
}
