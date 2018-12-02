package com.lvmingtao.member.model;

import lombok.Data;

import java.util.List;

@Data
public class MemberUserResp {

    private Integer code;
    private List<MemberUser> data;
    private Integer count;
    private String msg;
}
