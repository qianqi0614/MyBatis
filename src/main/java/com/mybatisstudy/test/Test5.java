package com.mybatisstudy.test;

import com.mybatisstudy.entity.Account;
import com.mybatisstudy.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Account account = new Account();
        List<Long> ids = new ArrayList<Long>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        account.setIds(ids);
//        account.setId(1L);
//        account.setUsername("qq1");
//        account.setPassword("123");
//        account.setAge(11);
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        Account account1 = accountRepository.findByAccount(account);
//        account.setUsername("小明");
        System.out.println(accountRepository.findByIds(account));
        System.out.println(account);
        sqlSession.commit();
        sqlSession.close();
    }
}
