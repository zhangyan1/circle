package com.sodanights.circle.client.user.query;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import com.sodanights.circle.client.common.query.Query;


/**
 * 查询类
 * @ClassName: UserQuery
 * @author zhangyan
 * @Date 2019-04-03 14:55:23
 */
@Getter
@Setter
public class UserQuery extends Query {
	private Long id;
	private Integer appType;
    /**
    * 企业scopeId
    */
	private Long scopeId;
    /**
    * 企业orgId
    */
	private Long orgId;
    /**
    * 内容
    */
	private String content;
    /**
    * 1-正常 0-删除
    */
	private Integer status;
	private Long createUserId;
    /**
    * 用户id
    */
	private Long userId;
    /**
    * 名字
    */
	private String createUserName;
	private Date gmtCreate;
	private Date gmtModified;
}
