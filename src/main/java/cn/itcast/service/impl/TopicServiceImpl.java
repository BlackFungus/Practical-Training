package cn.itcast.service.impl;

import cn.itcast.dao.TopicDao;
import cn.itcast.domain.TopicMain;
import cn.itcast.domain.TopicReply;
import cn.itcast.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("topicMainServiceImpl")
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Override
    public TopicMain MakeTopicMain(Integer sid, String title, String context,String file){
        TopicMain topicMain=new TopicMain();
        topicMain.setSid(sid);
        topicMain.setTitle(title);
        topicMain.setContext(context);
        topicMain.setFile(file);
        Date creat_time=new Date();
        Date change_time=new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        dateFormat.format(creat_time);
        topicMain.setCreate_time(creat_time);
        dateFormat.format(change_time);
        topicMain.setChange_time(change_time);
        String tid;
        String ssid = sid.toString();
        String screate_time = java.text.DateFormat.getDateInstance().format(new java.util.Date());
        tid=ssid+screate_time;
        topicMain.setTid(tid);
        topicDao.MakeTopicMain(topicMain);
        return topicMain;
    }

    @Override
    public TopicReply MakeTopicReply(Integer sid, String tid, String context, String file){
        TopicReply topicReply=new TopicReply();
        Date creat_time=new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        dateFormat.format(creat_time);
        String rid;
        String screate_time = java.text.DateFormat.getDateInstance().format(new java.util.Date());
        rid=tid+screate_time;
        topicReply.setSid(sid);
        topicReply.setTid(tid);
        topicReply.setContext(context);
        topicReply.setFile(file);
        topicReply.setCreate_time(creat_time);
        topicReply.setRid(rid);
        topicDao.MakeTopicReply(topicReply);
        return topicReply;
    }
}
