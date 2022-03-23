package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdThingChild;
import com.aiwinn.album.mapper.CmdThingChildMapper;
import com.aiwinn.album.service.ICmdThingChildService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 事物分类子任务
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdThingChildServiceImpl extends ServiceImpl<CmdThingChildMapper, CmdThingChild> implements ICmdThingChildService {

    @Override
    public int createTableIfNot(String childName) {
        return baseMapper.createTableIfNot(childName);
    }

    @Override
    public int getChildCmdCount(String childName, String cmdId) {
        return baseMapper.selectChildCmdCount(childName, cmdId);
    }

    @Override
    public int getCountByCmdId(String childName, String cmdId) {
        return baseMapper.selectCountByCmdId(childName, cmdId);
    }

    @Override
    public void deleteByCmdId(String childName, String cmdId) {
        baseMapper.deleteByCmdId(childName, cmdId);
    }

    @Override
    public int updateByCmdIdSelective(String tab, CmdThingChild record) {
        return baseMapper.updateByCmdIdSelective(tab, record);
    }

    @Override
    public void insertList(String childName, List<CmdThingChild> list) {
        baseMapper.insertList(childName, list);
    }

    @Override
    public CmdThingChild getByCmdIdAndMd5(String childName, String cmdId, String md5) {
        return baseMapper.selectByCmdIdAndMd5(childName, cmdId, md5);
    }
}
