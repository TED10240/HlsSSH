package main.service;

import main.domain.Account;
import main.domain.Member;
import main.web.commons.Page;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface IAccountService {

    /**
     *
     * 查询用户列表
     * @param dCriteria		查询的条件
     * @return
     */
    public List<Account> findAllAccount(DetachedCriteria dCriteria);
    /**
     * 保存用户
     * @param account
     */
    public void save(Account account, Member member);
    /**
     * 根据id删除用户
     * @param userID
     */
    public void removeAccount(String userID);

    /**
     * 根据id查找用户
     * @param userID
     * @return
     */
    public Account findAccountById(String userID) ;

    /**
     * 更新用户
     * @param account
     */
    public void update(Account account);

    public void updateMember(Member member);

    public Page findAllMember(DetachedCriteria dCriteria, Integer num);

    public Member findMemberById(String mebID);
}
