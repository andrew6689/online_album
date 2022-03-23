package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdLimit;
import com.aiwinn.album.mapper.CmdLimitMapper;
import com.aiwinn.album.service.ICmdLimitService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务限制
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdLimitServiceImpl extends ServiceImpl<CmdLimitMapper, CmdLimit> implements ICmdLimitService {

    @Override
    public CmdLimit getByDate(String whichDate) {
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
    public void updateRecallLimitById(Integer count, Integer id) {
        baseMapper.updateRecallLimitById(count, id);
    }

    @Override
    public void updateRecallNumByDate(Integer count, String date) {
        baseMapper.updateRecallNumByDate(count, date);
    }

    @Override
    public void updateRecallSelectByDate(Integer count, String date) {
        baseMapper.updateRecallSelectByDate(count, date);
    }

    @Override
    public void updateStoryLimitById(Integer count, Integer id) {
        baseMapper.updateStoryLimitById(count, id);
    }

    @Override
    public void updateStoryNumByDate(Integer count, String date) {
        baseMapper.updateStoryNumByDate(count, date);
    }

    @Override
    public void updateStorySelectByDate(Integer count, String date) {
        baseMapper.updateStorySelectByDate(count, date);
    }

    @Override
    public void updateUserLimitById(Integer count, Integer id) {
        baseMapper.updateUserLimitById(count, id);
    }

    @Override
    public void updateUserNumByDate(Integer count, String date) {
        baseMapper.updateUserNumByDate(count, date);
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
