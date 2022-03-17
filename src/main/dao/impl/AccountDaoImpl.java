package main.dao.impl;

import main.dao.IAccountDao;
import main.domain.Account;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Override
    public List<Account> findAll(DetachedCriteria dCriteria) {
        return (List<Account>) hibernateTemplate.findByCriteria(dCriteria);
    }

    @Override
    public void save(Account account) {
        hibernateTemplate.save(account);
    }

    @Override
    public void delete(String userID) {
        Account account=findById(userID);
        hibernateTemplate.delete(account);
    }

    @Override
    public Account findById(String userID) {
        return hibernateTemplate.get(Account.class, userID);
    }

    @Override
    public void update(Account account) {
        hibernateTemplate.update(account);
    }
}
