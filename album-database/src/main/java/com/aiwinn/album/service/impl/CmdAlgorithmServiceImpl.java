package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdAlgorithm;
import com.aiwinn.album.mapper.CmdAlgorithmMapper;
import com.aiwinn.album.service.ICmdAlgorithmService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class CmdAlgorithmServiceImpl extends ServiceImpl<CmdAlgorithmMapper, CmdAlgorithm> implements ICmdAlgorithmService {

    @Override
    public CmdAlgorithm getNewByType(String type) {
        return baseMapper.selectNewByType(type);
    }
}
