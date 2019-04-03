package com.sodanights.circle.client.user.domain;

import java.util.Date;

import com.sodanights.circle.client.common.domain.Domain;
import lombok.Getter;
import lombok.Setter;



/**
 * 实体类
 * @ClassName: User
 * @author zhangyan
 * @Date 2019-04-03 14:55:23
 */
@Getter
@Setter
public class UserDomain extends Domain{


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
