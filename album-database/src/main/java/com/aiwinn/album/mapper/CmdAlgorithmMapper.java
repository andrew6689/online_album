package com.aiwinn.album.mapper;

import com.aiwinn.album.entity.CmdAlgorithm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CmdAlgorithmMapper extends BaseMapper<CmdAlgorithm> {

    CmdAlgorithm selectNewByType(String type);
}
