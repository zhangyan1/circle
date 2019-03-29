package com.sodanights.circle.dal.common.mapper;

import com.sodanights.circle.client.common.domain.Domain;
import com.sodanights.circle.client.common.query.Query;

/**
 * Created by zhangyan on 27/03/2018.
 */
public interface DomainMapper<D extends Domain, Q extends Query> extends Mapper<D, Q> {
}
