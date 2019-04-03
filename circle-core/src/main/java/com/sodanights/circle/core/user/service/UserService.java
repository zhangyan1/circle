package com.sodanights.circle.core.user.service;

import com.sodanights.circle.client.common.result.Result;
import com.sodanights.circle.client.user.domain.UserDomain;
import com.sodanights.circle.client.user.query.UserQuery;

public interface UserService {


    Result<UserDomain> getUserDomain(UserQuery query);

}
