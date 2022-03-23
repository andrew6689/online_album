package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThumbnailResult;
import com.aiwinn.album.mapper.CmdThumbnailResultMapper;
import com.aiwinn.album.service.ICmdThumbnailResultService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 缩略图任务结果
 * @author： jeecg-boot
 * @date：   2021-08-04
 * @version： V1.0
 */
@Service
public class CmdThumbnailResultServiceImpl extends ServiceImpl<CmdThumbnailResultMapper, CmdThumbnailResult> implements ICmdThumbnailResultService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public int insertSelective(String tab, CmdThumbnailResult record) {
        return baseMapper.insertSelective(tab, record);
    }

    @Override
    public CmdThumbnailResult getByPhyFileId(String tab, String phyFileId) {
        return baseMapper.selectByPhyFileId(tab, phyFileId);
    }

    @Override
    public void updateByPhyFileIdSelective(String tab, CmdThumbnailResult record) {
        baseMapper.updateByPhyFileIdSelective(tab, record);
    }
}
