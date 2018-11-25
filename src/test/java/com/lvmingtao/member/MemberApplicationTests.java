package com.lvmingtao.member;

import com.alibaba.fastjson.JSON;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberApplicationTests {

    @Autowired
    private MemberService memberService;
    @Test
    public void addMemberUser() {
        for (int i = 10; i < 60; i++) {
            TMember member = new TMember();
            member.setMemberName("测试添加姓名"+i);
            member.setMemberPhoneNumber("185690321"+i);
            member.setMemberLicensePlate("湘A000"+i);
            memberService.addMemberUser(member);
        }
    }

    @Test
    public void getMemberUserList() {
        System.out.println(JSON.toJSONString(memberService.getMemberUserList()));
    }

}
