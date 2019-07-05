package cn.itcast.dao;

import cn.itcast.domain.TopicMain;
import cn.itcast.domain.TopicReply;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao {

    //发表帖子
    @Insert("insert into td_topic_mian(tid,sid,title,context,file,create_time,change_time)values(#{tid},#{sid},#{title},#{context},#{file},#{create_time},#{change_time})")
    public void MakeTopicMain(TopicMain topicMain);

    //回复帖子
    @Insert("insert into td_topic_reply(rid,sid,tid,context,file,create_time)values(#{rid},#{sid},#{tid},#{context},#{file},#{create_time})")
    public void MakeTopicReply(TopicReply topicReply);
}
