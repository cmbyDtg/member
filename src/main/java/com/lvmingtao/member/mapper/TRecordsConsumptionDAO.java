package com.lvmingtao.member.mapper;

import com.lvmingtao.member.model.TRecordsConsumption;
import com.lvmingtao.member.model.TRecordsConsumptionExample;
import org.springframework.stereotype.Repository;

/**
 * TRecordsConsumptionDAO继承基类
 */
@Repository
public interface TRecordsConsumptionDAO extends MyBatisBaseDao<TRecordsConsumption, Long, TRecordsConsumptionExample> {
}