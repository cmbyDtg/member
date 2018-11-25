package com.lvmingtao.member.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvmingtao.member.model.AddMemberRsp;
import com.lvmingtao.member.model.MemberUserResp;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getMemberUserList", method = RequestMethod.GET)
    public MemberUserResp getMemberUserList(Integer page,Integer limit) {
        MemberUserResp resp = new MemberUserResp();
        PageHelper.startPage(page, limit);
        List<TMember> tMembers = memberService.getMemberUserList();
        PageInfo<TMember> info = new PageInfo<>(tMembers);
        resp.setCount((int) info.getTotal());
        resp.setCode(0);
        resp.setMsg("OK");
        resp.setData(tMembers);
        return resp;
    }
}
