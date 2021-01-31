package com.icon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icon.common.utils.PageUtils;
import com.icon.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 08:35:52
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

