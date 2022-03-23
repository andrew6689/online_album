package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThingMark;
import com.aiwinn.album.mapper.CmdThingMarkMapper;
import com.aiwinn.album.service.ICmdThingMarkService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 事物标注
 * @author： jeecg-boot
 * @date：   2021-04-16
 * @version： V1.0
 */
@Service
public class CmdThingMarkServiceImpl extends ServiceImpl<CmdThingMarkMapper, CmdThingMark> implements ICmdThingMarkService {

    @Override
    public int createTableIfNot(String tab) {
        return baseMapper.createTableIfNot(tab);
    }

    @Override
    public void insertExcludeList(String tab, List<CmdThingMark> list) {
        baseMapper.insertExcludeList(tab, list);
    }

    @Override
    public void insertMarkList(String tab, List<CmdThingMark> list) {
        baseMapper.insertMarkList(tab, list);
    }

    @Override
    public List<CmdThingMark> getByClusterId(String tab, String clusterId) {
        return baseMapper.selectByClusterId(tab, clusterId);
    }
}
