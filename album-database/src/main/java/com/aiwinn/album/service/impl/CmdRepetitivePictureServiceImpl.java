package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdRepetitivePicture;
import com.aiwinn.album.mapper.CmdRepetitivePictureMapper;
import com.aiwinn.album.service.ICmdRepetitivePictureService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务去重相片
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdRepetitivePictureServiceImpl extends ServiceImpl<CmdRepetitivePictureMapper, CmdRepetitivePicture> implements ICmdRepetitivePictureService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdRepetitivePicture record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public void updateByClusterIdAndMd5Selective(String tab, CmdRepetitivePicture record) {
        baseMapper.updateByClusterIdAndMd5Selective(tab, record);
    }

    @Override
    public CmdRepetitivePicture getByClusterIdAndMd5(String tab, String clusterId, String pictureMd5) {
        return baseMapper.selectByClusterIdAndMd5(tab, clusterId, pictureMd5);
    }

    @Override
    public List<CmdRepetitivePicture> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }

    @Override
    public Long getIdByClusterId(String tab, String clusterId) {
        return baseMapper.selectIdByClusterId(tab, clusterId);
    }
}
