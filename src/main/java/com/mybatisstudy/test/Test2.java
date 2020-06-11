package com.mybatisstudy.test;

import com.mybatisstudy.entity.Account;
import com.mybatisstudy.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // 加载配置文件
        InputStream inputStream = Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);

        // 添加对象
//        Account account = new Account("李四", "123", 23);
//        accountRepository.save(account);
//        sqlSession.commit();

        // 查询全部对象
//        List<Account> list = accountRepository.findAll();
//        for (Account a : list) {
//            System.out.println(a);
//        }

        // 通过id查询对象
//        Account account = accountRepository.findById(2L);
//        System.out.println(account);

        // 修改对象
//        Account account = accountRepository.findById(2L);
//        account.setAge(20);
//        account.setUsername("张三");
//        account.setPassword("1111");
//        int res = accountRepository.update(account);
//        System.out.println(res);
//        sqlSession.commit();

        // 通过id删除对象
//        int res = accountRepository.deleteById(3L);
//        System.out.println(res);
//        sqlSession.commit();

        // 通过name查询对象
//        String name = "qq";
//        System.out.println(accountRepository.findByName(name));

        // 通过包装类查询对象
//        Long id = 2L;
//        System.out.println(accountRepository.findById2(id));

        // 通过name和age查询对象
//        String name = "张三";
//        int age = 20;
//        System.out.println(accountRepository.findByNameAndAge(name, age));

        // 基本数据类型，统计 Account 总数
        System.out.println(accountRepository.count());
        // 包装类，统计 Account 总数
        System.out.println(accountRepository.count2());
        // String 类型，通过 id 查询 Account 的 name
        System.out.println(accountRepository.findNameById(2L));
        sqlSession.close();
    }
}
