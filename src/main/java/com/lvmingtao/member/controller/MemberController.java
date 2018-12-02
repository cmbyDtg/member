package com.lvmingtao.member.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvmingtao.member.model.MemberUser;
import com.lvmingtao.member.model.MemberUserResp;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getMemberUserList", method = RequestMethod.GET)
    public MemberUserResp getMemberUserList(Integer page,Integer limit) {
        MemberUserResp resp = new MemberUserResp();
        List<MemberUser> memberUsers = new ArrayList<>();
        PageHelper.startPage(page, limit);
        List<TMember> tMembers = memberService.getMemberUserList();
        tMembers.stream().forEach(tMember -> {
            MemberUser memberUser;
            memberUser = JSON.parseObject(JSON.toJSONString(tMember),MemberUser.class);
            memberUser.setId(String.valueOf(tMember.getId()));
            memberUser.setMemberBalance(this.getMoney(tMember.getMemberBalance()));
            memberUsers.add(memberUser);
        });
        PageInfo<TMember> info = new PageInfo<>(tMembers);
        resp.setCount((int) info.getTotal());
        resp.setCode(0);
        resp.setMsg("OK");
        resp.setData(memberUsers);
        return resp;
    }

    /**
     * 删除
     * @param id
     * @return 回到主页
     */
    @RequestMapping(value = "deleteMemberUser", method = RequestMethod.GET)
    public void deleteMemberUser(Long id){
        memberService.deleteMemberUser(id);
    }

    /**
     * 分转元
     * @param money
     * @return
     */
    private String getMoney (Integer money) {
        if (money == 0) {
            return "0";
        }
        return  BigDecimal.valueOf(Long.valueOf(money)).divide(new BigDecimal(100)).toString();
    }
    @RequestMapping(value = "addMemberRecharge", method = RequestMethod.GET)
    public Double addMemberRecharge(Long id, Double money) {
        Integer balance = memberService.addMemberRecharge(id, money);
        return Double.valueOf(this.getMoney(balance));
    }

    @RequestMapping(value = "addMemberConsumption", method = RequestMethod.GET)
    public Double addMemberConsumption(Long id, Double money) throws Exception {
        Integer balance = memberService.addMemberConsumption(id, money,"消费");
        return Double.valueOf(this.getMoney(balance));
    }
}
