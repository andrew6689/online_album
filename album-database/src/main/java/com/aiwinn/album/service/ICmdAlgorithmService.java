package com.aiwinn.album.service;

import com.aiwinn.album.entity.CmdAlgorithm;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ICmdAlgorithmService extends IService<CmdAlgorithm> {

    CmdAlgorithm getNewByType(String type);
}
