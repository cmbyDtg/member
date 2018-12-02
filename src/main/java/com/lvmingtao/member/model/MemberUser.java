package com.lvmingtao.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class MemberUser {
    private String id;

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

    /**
     * 会员余额（单位分）
     */
    private String memberBalance;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationTime;

    /**
     * 修改时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
