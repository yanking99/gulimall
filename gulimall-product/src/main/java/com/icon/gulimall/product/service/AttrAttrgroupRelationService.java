package com.icon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icon.common.utils.PageUtils;
import com.icon.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 08:35:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

