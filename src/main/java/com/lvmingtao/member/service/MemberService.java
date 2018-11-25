package com.lvmingtao.member.service;

import com.lvmingtao.member.mapper.TMemberDAO;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.model.TMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private TMemberDAO tMemberDAO;

    /**
     * 添加会员
     * @param member 会员信息
     */
    public void addMemberUser(TMember member) {
       tMemberDAO.insertSelective(member);
    }

    /**
     * 获取会员列表
     */
     public List<TMember> getMemberUserList(){
         TMemberExample example = new TMemberExample();
         example.setOrderByClause("creation_time desc");
         List<TMember> tMembers = tMemberDAO.selectByExample(example);
         return tMembers;
     }
}
