package com.lvmingtao.member.model;

import lombok.Data;

@Data
public class AddMemberRsp {
    /**
     * 会员姓名
     */
    private String memberName;

    /**
     * 会员手机号码
     */
    private String memberPhoneNumber;

    /**
     * 会员车牌
     */
    private String memberLicensePlate;
}
