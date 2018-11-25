package com.lvmingtao.member.mapper;

import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.model.TMemberExample;
import org.springframework.stereotype.Repository;

/**
 * TMemberDAO继承基类
 */
@Repository
public interface TMemberDAO extends MyBatisBaseDao<TMember, Long, TMemberExample> {
}