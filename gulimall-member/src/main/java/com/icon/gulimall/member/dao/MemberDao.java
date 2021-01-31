package com.icon.gulimall.member.dao;

import com.icon.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author icon@qq.com
 * @email sunlightcs@gmail.com
 * @date 2021-01-31 21:07:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
