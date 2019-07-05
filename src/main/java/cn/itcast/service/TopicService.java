package cn.itcast.service;

import cn.itcast.domain.TopicMain;
import cn.itcast.domain.TopicReply;

public interface TopicService {

    //创造帖子
    public TopicMain MakeTopicMain(Integer sid, String title, String context, String file);

    //回复帖子
    public TopicReply MakeTopicReply(Integer sid, String tid, String context, String file);
}
