package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdFeatdb;
import com.aiwinn.album.mapper.CmdFeatdbMapper;
import com.aiwinn.album.service.ICmdFeatdbService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务特征库信息
 * @author： jeecg-boot
 * @date：   2021-04-12
 * @version： V1.0
 */
@Service
public class CmdFeatdbServiceImpl extends ServiceImpl<CmdFeatdbMapper, CmdFeatdb> implements ICmdFeatdbService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public CmdFeatdb getByFeatdbName(String tab, String featdbName) {
        return baseMapper.selectByFeatdbName(tab, featdbName);
    }

    @Override
    public void insertAndUpdate(String tab, CmdFeatdb record) {
        baseMapper.insertAndUpdate(tab, record);
    }

    @Override
    public Long getIdByFeatdbName(String tab, String featdbName) {
        return baseMapper.selectIdByFeatdbName(tab, featdbName);
    }
}
