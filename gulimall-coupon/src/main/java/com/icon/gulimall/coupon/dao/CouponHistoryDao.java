package com.icon.gulimall.coupon.dao;

import com.icon.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 20:58:34
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
