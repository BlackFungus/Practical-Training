package cn.itcast.dao;

import cn.itcast.domain.Denglu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DengluDao {
    @Select("select sid,username,password from td_user_basic where sid=#{password}")
    public List<Denglu> denglua(String password);

}
