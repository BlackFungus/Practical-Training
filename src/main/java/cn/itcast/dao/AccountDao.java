package cn.itcast.dao;


import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {

    //查询所有账户
    @Select("select * from td_user_basic")
    public List<Account> findAll();

    //根据用户名查询是否存在某一用户
    @Select("select password,sid,username,state from td_user_basic where username = #{username}")
    public List<Account> findExist(String username);

    //根据学号查询是否存在某一用户
    @Select("select password,sid,username,state from td_user_basic where sid = #{sid}")
    public List<Account> findExist2(Integer sid);

    //向td_user_basic插入一条数据
    @Insert("inser into td_user_basic (username,password,sid,create_time) values (#{username},#{password}#{sid},#{create_time}) ")
    public int insertUserBasic(@Param("username") String username, @Param("password")String password,  @Param("sid")Integer sid,@Param("create_time") Date create_time);

    //冻结、解冻用户
    @Update("update td_user_basic set state = #{sate}")
    public int upDateState(Integer state);
}
