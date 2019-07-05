package cn.itcast.dao;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

@Repository
public interface DeleteDao {

    //按照学号删除学生信息
    @Delete("delete from td_user_basic where sid=#{sid}")
    public void deleteOne(Integer sid);
    //按照学号删除学生信息
    @Delete("delete from td_user_personaldata where sid=#{sid}")
    public void deleteTwo(Integer sid);
}
