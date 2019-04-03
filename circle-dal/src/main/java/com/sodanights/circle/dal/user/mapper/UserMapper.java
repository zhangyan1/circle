package com.sodanights.circle.dal.user.mapper;


import com.sodanights.circle.client.user.domain.UserDomain;
import com.sodanights.circle.client.user.query.UserQuery;
import com.sodanights.circle.dal.common.mapper.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Mapper
 * @ClassName: UserMapper
 * @author zhangyan
 * @Date 2019-04-03 14:55:23
 */

public interface UserMapper extends Mapper<UserDomain,UserQuery> {
}