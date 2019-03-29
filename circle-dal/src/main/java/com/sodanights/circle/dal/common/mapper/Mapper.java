package com.sodanights.circle.dal.common.mapper;

import com.sodanights.circle.client.common.domain.Domain;
import com.sodanights.circle.client.common.query.Query;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangyan on 27/03/2018.
 */
public interface Mapper<D extends Domain, Q extends Query> {
    long count(Q query);

    long insert(D value);

    long batchInsert(List<D> value);

    long update(D value);

    long delete(D value);
    
    List<D> find(Q query);
    
    D get(Q query);
}
