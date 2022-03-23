package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThumbnailLimit;
import com.aiwinn.album.mapper.CmdThumbnailLimitMapper;
import com.aiwinn.album.service.ICmdThumbnailLimitService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 缩略图图片统计
 * @author： jeecg-boot
 * @date：   2021-08-06
 * @version： V1.0
 */
@Service
public class CmdThumbnailLimitServiceImpl extends ServiceImpl<CmdThumbnailLimitMapper, CmdThumbnailLimit> implements ICmdThumbnailLimitService {

    @Override
    public CmdThumbnailLimit getByDate(String whichDate) {
        return baseMapper.selectByDate(whichDate);
    }

    @Override
    public void updatePictureLimitByDate(Integer count, String date) {
        baseMapper.updatePictureLimitByDate(count, date);
    }

    @Override
    public void updatePictureNumByDate(Integer count, String date) {
        baseMapper.updatePictureNumByDate(count, date);
    }
}
