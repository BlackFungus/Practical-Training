package cn.itcast.service;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface AccountService {

    //查询所有账户
    public List<Account> findAll();

    //查询是否存在某一用户，返回该用户的密码和状态码
    public List<Account> findExist(String username);

    //根据学号查询是否存在某一用户
    public List<Account> findExist2(Integer sid);

    //向td_user_basic插入一条数据
    public int insertUserBasic(@Param("username") String username, @Param("password")String password, @Param("sid")Integer sid);

    //冻结、解冻用户
    public int upDateState(Integer state);
}
