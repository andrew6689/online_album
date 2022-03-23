package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdNotice;
import com.aiwinn.album.mapper.CmdNoticeMapper;
import com.aiwinn.album.service.ICmdNoticeService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 任务通知
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdNoticeServiceImpl extends ServiceImpl<CmdNoticeMapper, CmdNotice> implements ICmdNoticeService {

    @Override
    public CmdNotice getByCmdId(String cmdId) {
        return baseMapper.selectByCmdId(cmdId);
    }

    @Override
    public void deleteByCmdId(String cmdId) {
        baseMapper.deleteByCmdId(cmdId);
    }
}
