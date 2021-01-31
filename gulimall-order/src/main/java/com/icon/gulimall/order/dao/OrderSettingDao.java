package com.icon.gulimall.order.dao;

import com.icon.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 21:19:37
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
