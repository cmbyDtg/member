package com.lvmingtao.member.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_member
 * @author 
 */
public class TMember implements Serializable {
    private Long id;

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
    private Integer memberBalance;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberLicensePlate() {
        return memberLicensePlate;
    }

    public void setMemberLicensePlate(String memberLicensePlate) {
        this.memberLicensePlate = memberLicensePlate;
    }

    public Integer getMemberBalance() {
        return memberBalance;
    }

    public void setMemberBalance(Integer memberBalance) {
        this.memberBalance = memberBalance;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TMember other = (TMember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPhoneNumber() == null ? other.getMemberPhoneNumber() == null : this.getMemberPhoneNumber().equals(other.getMemberPhoneNumber()))
            && (this.getMemberLicensePlate() == null ? other.getMemberLicensePlate() == null : this.getMemberLicensePlate().equals(other.getMemberLicensePlate()))
            && (this.getMemberBalance() == null ? other.getMemberBalance() == null : this.getMemberBalance().equals(other.getMemberBalance()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPhoneNumber() == null) ? 0 : getMemberPhoneNumber().hashCode());
        result = prime * result + ((getMemberLicensePlate() == null) ? 0 : getMemberLicensePlate().hashCode());
        result = prime * result + ((getMemberBalance() == null) ? 0 : getMemberBalance().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberPhoneNumber=").append(memberPhoneNumber);
        sb.append(", memberLicensePlate=").append(memberLicensePlate);
        sb.append(", memberBalance=").append(memberBalance);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}