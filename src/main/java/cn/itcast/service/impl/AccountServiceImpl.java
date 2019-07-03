package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    //查询所有账户
    public List<Account> findAll(){
        System.out.println("业务层：查询所有账户。。。");
        return accountDao.findAll();
    }

    //查询是否存在某一用户，返回该用户的密码和状态码
    public List<Account> findExist(String username){
        return accountDao.findExist(username);
    }
    //根据学号查询是否存在某一用户
    public List<Account> findExist2(Integer sid) {
        return accountDao.findExist2(sid);
    }

    @Override
    public int insertUserBasic(String username, String password, Integer sid) {
        return accountDao.insertUserBasic(username,password,sid,new Date());
    }

    @Override
    public int upDateState(Integer sid) {

        List<Account> list = accountDao.findExist2(sid);

        Account accountOne = list.get(0);

        Integer i = accountOne.getState();

        if (1==i){
           return accountDao.upDateState(0);
        }else{
            return accountDao.upDateState(1);
        }

    }

    @Override
    public List<Account> LimitFind(Integer offset, Integer rows) {
        return accountDao.LimitFind(offset * rows,rows);
    }


}
