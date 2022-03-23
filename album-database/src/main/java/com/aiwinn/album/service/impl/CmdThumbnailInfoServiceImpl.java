package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThumbnailInfo;
import com.aiwinn.album.mapper.CmdThumbnailInfoMapper;
import com.aiwinn.album.service.ICmdThumbnailInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 缩略图任务信息
 * @author： jeecg-boot
 * @date：   2021-08-04
 * @version： V1.0
 */
@Service
public class CmdThumbnailInfoServiceImpl extends ServiceImpl<CmdThumbnailInfoMapper, CmdThumbnailInfo> implements ICmdThumbnailInfoService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdThumbnailInfo record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public CmdThumbnailInfo getByCmdId(String tab, String cmdId) {
        return baseMapper.selectByCmdId(tab, cmdId);
    }

    @Override
    public void updateByCmdIdSelective(String tab, CmdThumbnailInfo record) {
        baseMapper.updateByCmdIdSelective(tab, record);
    }

    @Override
    public void deleteByCmdId(String tab, String cmdId) {
        baseMapper.deleteByCmdId(tab, cmdId);
    }

}
