package com.aiwinn.album.service.impl;

import com.aiwinn.album.entity.CmdPhotoTemplate;
import com.aiwinn.album.mapper.CmdPhotoTemplateMapper;
import com.aiwinn.album.service.ICmdPhotoTemplateService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;

/**
 * @Description: 影集模版表
 * @author： jeecg-boot
 * @date：   2021-08-23
 * @version： V1.0
 */
@Service
public class CmdPhotoTemplateServiceImpl extends ServiceImpl<CmdPhotoTemplateMapper, CmdPhotoTemplate> implements ICmdPhotoTemplateService {

    @Override
    public int getCountByTemplateName(String templateName) {
        return baseMapper.selectCountByTemplateName(templateName);
    }

    @Override
    public CmdPhotoTemplate getByTemplateName(String templateName) {
        return baseMapper.selectByTemplateName(templateName);
    }

    @Override
    public List<CmdPhotoTemplate> getByNameAndType(String templateName, String templateType) {
        return baseMapper.selectByNameAndType(templateName, templateType);
    }

    @Override
    public int deleteByTemplateNames(List<String> list) {
        return baseMapper.deleteByTemplateNames(list);
    }

    @Override
    public void updateByTemplateName(CmdPhotoTemplate record) {
        baseMapper.updateByTemplateName(record);
    }

}
