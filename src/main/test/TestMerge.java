package main.test;

import main.domain.Account;
import main.service.IAccountService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMerge {

    ClassPathXmlApplicationContext ctx;

    @Before
    public void loadCtx(){
        //加载配置文件
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void  testHibernate(){
        SessionFactory sf = (SessionFactory)ctx.getBean("sessionFactory");
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(new Account("001","123",1));
        transaction.commit();
        session.close();
        sf.close();

    }

    @Test
    public void testSpring(){
         IAccountService iAccountService = (IAccountService)ctx.getBean("accountService");
         iAccountService.findMemberById("1");

    }
}
