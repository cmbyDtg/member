package com.lvmingtao.member.service;

import com.lvmingtao.member.mapper.TMemberDAO;
import com.lvmingtao.member.mapper.TRecordsConsumptionDAO;
import com.lvmingtao.member.model.TMember;
import com.lvmingtao.member.model.TMemberExample;
import com.lvmingtao.member.model.TRecordsConsumption;
import com.lvmingtao.member.model.TRecordsConsumptionExample;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private TMemberDAO tMemberDAO;
    @Autowired
    private TRecordsConsumptionDAO tRecordsConsumptionDAO;

    /**
     * 添加会员
     * @param member 会员信息
     */
    public void addMemberUser(TMember member) {
       tMemberDAO.insertSelective(member);
    }

    /**
     * 获取会员列表
     */
     public List<TMember> getMemberUserList(){
         TMemberExample example = new TMemberExample();
         example.setOrderByClause("id desc");
         List<TMember> tMembers = tMemberDAO.selectByExample(example);
         return tMembers;
     }

    /**
     * 删除
     * @param id 会员ID
     */
     public void deleteMemberUser(Long id) {
         tMemberDAO.deleteByPrimaryKey(id);
     }

    /**
     * 获取消费列表
     * @param memberId 会员ID
     * @return 消费列表
     */
     public List<TRecordsConsumption> getRecordsConsumption(Long memberId){
         TRecordsConsumptionExample example = new TRecordsConsumptionExample();
         example.createCriteria().andMemberIdEqualTo(memberId);
         List<TRecordsConsumption> tRecordsConsumptions = tRecordsConsumptionDAO.selectByExample(example);
         return tRecordsConsumptions;
     }

    /**
     * 充值
     * @param memberId 用户号
     * @param money 充值金额
     */
    @Transactional
     public Integer addMemberRecharge(Long memberId, Double money){
        TMember member = tMemberDAO.selectByPrimaryKey(memberId);
        Integer balance = 0;
        if (null != member) {
            //充值后的总金额
            balance = member.getMemberBalance() + this.getMoney(money);
            //更新余额
            TMember updateMember = new TMember();
             updateMember.setId(memberId);
             updateMember.setMemberBalance(balance);
             tMemberDAO.updateByPrimaryKeySelective(updateMember);
            //添加账单
             TRecordsConsumption tRecordsConsumption = new TRecordsConsumption();
             tRecordsConsumption.setMemberId(memberId);
             tRecordsConsumption.setConsumptionType(1);
             tRecordsConsumption.setConsumptionAmountMoney(this.getMoney(money));
             tRecordsConsumption.setConsumptionRemarks("充值");
             tRecordsConsumptionDAO.insertSelective(tRecordsConsumption);
         }
         return balance;
     }

    /**
     * 消费
     * @param memberId 会员ID
     * @param money 消费金额
     * @param remarks 消费说明
     */
     public Integer addMemberConsumption(Long memberId, Double money, String remarks) throws Exception {
         TMember member = tMemberDAO.selectByPrimaryKey(memberId);
         Integer balance = 0;
         if (null != member) {
             //消费后的总金额
             balance = member.getMemberBalance() - this.getMoney(money);
             //消费扣款后余额必须大于等于0，否则扣款失败
             if (0 > balance) {
                 return balance;
             }
             //更新余额
             TMember updateMember = new TMember();
             updateMember.setId(memberId);
             updateMember.setMemberBalance(balance);
             tMemberDAO.updateByPrimaryKeySelective(updateMember);
             //添加账单
             TRecordsConsumption tRecordsConsumption = new TRecordsConsumption();
             tRecordsConsumption.setMemberId(memberId);
             tRecordsConsumption.setConsumptionType(2);
             tRecordsConsumption.setConsumptionAmountMoney(-this.getMoney(money));
             tRecordsConsumption.setConsumptionRemarks(remarks);
             tRecordsConsumptionDAO.insertSelective(tRecordsConsumption);
         }
         return balance;
     }

    /**
     * 金钱转换 元转分
     * @param money 元
     * @return 分
     */
     private Integer getMoney (Double money) {
         DecimalFormat df = new DecimalFormat("#.00");
         money = Double.valueOf(df.format(money));
         Integer branch = (int)(money * 100);
         return branch;
     }
}
