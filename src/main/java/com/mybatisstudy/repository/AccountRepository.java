package com.mybatisstudy.repository;

import com.mybatisstudy.entity.Account;

import java.util.List;

public interface AccountRepository {
     int save(Account account);
     int update(Account account);
     int deleteById(long id);
     List<Account> findAll();
     Account findById(long id);
     Account findByName(String name);
     Account findById2(Long id);
     Account findByNameAndAge(String name, int age);
     int count();
     Integer count2();
     String findNameById(long id);
     Account findByAccount(Account account);
     List<Account> findByIds(Account account);
}
