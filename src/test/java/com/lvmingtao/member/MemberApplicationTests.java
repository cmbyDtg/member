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
//        for (int i = 10; i <= 99; i++) {
//            TMember member = new TMember();
//            member.setMemberName("测试添加姓名"+i);
//            member.setMemberPhoneNumber("185690321"+i);
//            member.setMemberLicensePlate("湘A000"+i);
//            memberService.addMemberUser(member);
//        }
    }

    @Test
    public void getMemberUserList() {
        System.out.println(JSON.toJSONString(memberService.getMemberUserList()));
    }

    /**
     * 测试删除会员
     */
    @Test
    public void deleteMemberUser() {
//        memberService.deleteMemberUser(100000000000000015L);
    }

    /**
     * 获取消费列表
     */
    @Test
    public void getRecordsConsumption() {
        System.out.println(JSON.toJSONString(memberService.getRecordsConsumption(100000000000000017L)));
    }

    /**
     * 充值
     */
    @Test
    public void addMemberRecharge() {
        memberService.addMemberRecharge(100000000000000017L, 201.20);
    }

    /**
     * 消费
     */
    @Test
    public void addMemberConsumption() throws Exception {
        memberService.addMemberConsumption(100000000000000017L, 25.5,"这里是测试消费2");
    }

}
