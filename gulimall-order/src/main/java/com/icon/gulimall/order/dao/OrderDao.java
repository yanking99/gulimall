package com.icon.gulimall.order.dao;

import com.icon.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 21:19:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
