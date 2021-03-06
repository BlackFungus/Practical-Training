package cn.itcast.dao;

import cn.itcast.domain.Account;
import cn.itcast.domain.PersonData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonDataDao {

    //根据学号查询个人信息
    @Select("select * from td_user_personaldata where sid = #{sid}")
    public List<PersonData> findAll(@Param("sid") Integer sid);

    //修改个人信息
    public int updata(PersonData personData);

    //向td_user_personaldata里插入一条数据
    @Insert("inser into td_user_personaldata (sid) values (#{sid})")
    public int insert(Integer sid);
}
