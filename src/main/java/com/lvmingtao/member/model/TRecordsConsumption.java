package com.lvmingtao.member.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_records_consumption
 * @author 
 */
public class TRecordsConsumption implements Serializable {
    private Long id;

    /**
     * 消费人ID
     */
    private Long memberId;

    /**
     * 消费类型
     */
    private Integer consumptionType;

    /**
     * 消费金额
     */
    private Integer consumptionAmountMoney;

    /**
     * 消费备注
     */
    private String consumptionRemarks;

    /**
     * 创建时间
     */
    private Date creationTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(Integer consumptionType) {
        this.consumptionType = consumptionType;
    }

    public Integer getConsumptionAmountMoney() {
        return consumptionAmountMoney;
    }

    public void setConsumptionAmountMoney(Integer consumptionAmountMoney) {
        this.consumptionAmountMoney = consumptionAmountMoney;
    }

    public String getConsumptionRemarks() {
        return consumptionRemarks;
    }

    public void setConsumptionRemarks(String consumptionRemarks) {
        this.consumptionRemarks = consumptionRemarks;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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
        TRecordsConsumption other = (TRecordsConsumption) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getConsumptionType() == null ? other.getConsumptionType() == null : this.getConsumptionType().equals(other.getConsumptionType()))
            && (this.getConsumptionAmountMoney() == null ? other.getConsumptionAmountMoney() == null : this.getConsumptionAmountMoney().equals(other.getConsumptionAmountMoney()))
            && (this.getConsumptionRemarks() == null ? other.getConsumptionRemarks() == null : this.getConsumptionRemarks().equals(other.getConsumptionRemarks()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getConsumptionType() == null) ? 0 : getConsumptionType().hashCode());
        result = prime * result + ((getConsumptionAmountMoney() == null) ? 0 : getConsumptionAmountMoney().hashCode());
        result = prime * result + ((getConsumptionRemarks() == null) ? 0 : getConsumptionRemarks().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", consumptionType=").append(consumptionType);
        sb.append(", consumptionAmountMoney=").append(consumptionAmountMoney);
        sb.append(", consumptionRemarks=").append(consumptionRemarks);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}