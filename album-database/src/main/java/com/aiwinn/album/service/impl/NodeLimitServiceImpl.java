package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.NodeLimit;
import com.aiwinn.album.mapper.NodeLimitMapper;
import com.aiwinn.album.service.INodeLimitService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 节点图片统计
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class NodeLimitServiceImpl extends ServiceImpl<NodeLimitMapper, NodeLimit> implements INodeLimitService {

    @Override
    public NodeLimit getByDate(String whichDate) {
        return baseMapper.selectByDate(whichDate);
    }

    @Override
    public void updatePeopleLimitById(Integer count, Integer id) {
        baseMapper.updatePeopleLimitById(count, id);
    }

    @Override
    public void updateThingLimitById(Integer count, Integer id) {
        baseMapper.updateThingLimitById(count, id);
    }

    @Override
    public void updateRepetitiveLimitById(Integer count, Integer id) {
        baseMapper.updateRepetitiveLimitById(count, id);
    }

    @Override
    public void updatePeopleNumByDate(Integer count, String date) {
        baseMapper.updatePeopleNumByDate(count, date);
    }

    @Override
    public void updateThingNumByDate(Integer count, String date) {
        baseMapper.updateThingNumByDate(count, date);
    }

    @Override
    public void updateRepetitiveNumByDate(Integer count, String date) {
        baseMapper.updateRepetitiveNumByDate(count, date);
    }

    @Override
    public void updateVideoPeopleLimitById(Integer count, Integer id) {
        baseMapper.updateVideoPeopleLimitById(count, id);
    }

    @Override
    public void updateVideoThingLimitById(Integer count, Integer id) {
        baseMapper.updateVideoThingLimitById(count, id);
    }

    @Override
    public void updateVideoPeopleNumByDate(Integer count, String date) {
        baseMapper.updateVideoPeopleNumByDate(count, date);
    }

    @Override
    public void updateVideoThingNumByDate(Integer count, String date) {
        baseMapper.updateVideoThingNumByDate(count, date);
    }

    @Override
    public void updateLiveLimitById(Integer count, Integer id) {
        baseMapper.updateLiveLimitById(count, id);
    }

    @Override
    public void updateLiveNumByDate(Integer count, String date) {
        baseMapper.updateLiveNumByDate(count, date);
    }

}
