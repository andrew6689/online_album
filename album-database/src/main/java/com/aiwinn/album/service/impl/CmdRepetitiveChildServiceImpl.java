package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdRepetitiveChild;
import com.aiwinn.album.mapper.CmdRepetitiveChildMapper;
import com.aiwinn.album.service.ICmdRepetitiveChildService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 云端去重子任务
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdRepetitiveChildServiceImpl extends ServiceImpl<CmdRepetitiveChildMapper, CmdRepetitiveChild> implements ICmdRepetitiveChildService {

    @Override
    public int createCmdTableIfNot(String childName) {
        return baseMapper.createCmdTableIfNot(childName);
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
    public int updateByCmdIdSelective(String tab, CmdRepetitiveChild record) {
        return baseMapper.updateByCmdIdSelective(tab, record);
    }

    @Override
    public void insertList(String childName, List<CmdRepetitiveChild> list) {
        baseMapper.insertList(childName, list);
    }

    @Override
    public CmdRepetitiveChild getByCmdIdAndMd5(String childName, String cmdId, String md5) {
        return baseMapper.selectByCmdIdAndMd5(childName, cmdId, md5);
    }
}
