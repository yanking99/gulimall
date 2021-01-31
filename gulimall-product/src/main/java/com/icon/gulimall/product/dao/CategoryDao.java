package com.icon.gulimall.product.dao;

import com.icon.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 08:35:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
