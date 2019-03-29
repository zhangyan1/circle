package com.sodanights.circle.dal.common.wrapper;

import com.sodanights.circle.client.common.domain.Domain;
import com.sodanights.circle.client.common.query.Query;

/**
 * Created by zhangyan on 27/03/2018.
 */
public abstract class DomainWrapper<D extends Domain, Q extends Query> extends Wrapper<D, Q> {
}