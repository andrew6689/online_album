package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdPhotoTemplateElement;
import com.aiwinn.album.mapper.CmdPhotoTemplateElementMapper;
import com.aiwinn.album.service.ICmdPhotoTemplateElementService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;

/**
 * @Description: 影集模板元素
 * @author： jeecg-boot
 * @date：   2021-08-26
 * @version： V1.0
 */
@Service
public class CmdPhotoTemplateElementServiceImpl extends ServiceImpl<CmdPhotoTemplateElementMapper, CmdPhotoTemplateElement> implements ICmdPhotoTemplateElementService {

    @Override
    public List<CmdPhotoTemplateElement> getAll() {
        return baseMapper.selectAll();
    }

    @Override
    public CmdPhotoTemplateElement getByTypeAndElementId(String type, String elementId) {
        return baseMapper.selectByTypeAndElementId(type, elementId);
    }
}
