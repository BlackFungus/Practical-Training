package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有账户
    public List<Account> findAll();

    //查询是否存在某一用户，返回该用户的密码和状态码
    public List<Account> findExist(String username);

}
