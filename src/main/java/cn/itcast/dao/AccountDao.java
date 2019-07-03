package cn.itcast.dao;


import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {

    //查询所有账户
    @Select("select * from td_user_basic")
    public List<Account> findAll();

    //查询是否存在某一用户
    @Select("select password,sid,username,state from td_user_basic where username = #{username}")
    public List<Account> findExist(String username);


}
