package com.lvmingtao.member.controller;

import com.lvmingtao.member.model.AddMemberRsp;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberViewController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "openAddMemberUser", method = RequestMethod.GET)
    public String openAddMemberUser(){
        return "addMemberUser";
    }

    @RequestMapping(value = "addMemberUser", method = RequestMethod.POST)
    private String addMemberUser(AddMemberRsp rsp) {
        TMember tMember = new TMember();
        tMember.setMemberName(rsp.getMemberName());
        tMember.setMemberPhoneNumber(rsp.getMemberPhoneNumber());
        tMember.setMemberLicensePlate(rsp.getMemberLicensePlate());
        memberService.addMemberUser(tMember);
        return "login";
    }
}
