package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdExtract;
import com.aiwinn.album.mapper.CmdExtractMapper;
import com.aiwinn.album.service.ICmdExtractService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 任务提取信息
 * @author： jeecg-boot
 * @date：   2021-04-19
 * @version： V1.0
 */
@Service
public class CmdExtractServiceImpl extends ServiceImpl<CmdExtractMapper, CmdExtract> implements ICmdExtractService {

    @Override
    public List<CmdExtract> getSameCmdExtractByclusterId(String cmdId, String clusterId) {
        return baseMapper.selectSameCmdExtractByclusterId(cmdId, clusterId);
    }
}
