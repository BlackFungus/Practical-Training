package cn.itcast.controller;

import cn.itcast.domain.TopicMain;
import cn.itcast.domain.TopicReply;
import cn.itcast.service.TopicService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Topic;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/release")
    @ResponseBody
    public APIResult MakeTopicMain(@RequestParam("sid")Integer sid,  @RequestParam("title")String title, @RequestParam("context") String context, @RequestParam("file") String file){
        TopicMain topicMain = topicService.MakeTopicMain(sid,title,context,file);
        Map<String,Object> map = new HashMap<>();
        map.put("sid",topicMain.getSid());
        map.put("tid",topicMain.getTid());
        if(topicMain.getSid().equals(sid)){
            return APIResult.createOk(map);
        }
        return APIResult.createNg("操作失败");
    }

    @RequestMapping("/replyRelease")
    @ResponseBody
    public APIResult MakeTopicReply(@RequestParam("sid") Integer sid,@RequestParam("tid") String tid,@RequestParam("context") String context,@RequestParam("file") String file){
        TopicReply topicReply = topicService.MakeTopicReply(sid,tid,context,file);
        Map<String,Object> map = new HashMap<>();
        map.put("sid",topicReply.getSid());
        map.put("rid",topicReply.getRid());
        if(topicReply.getTid().equals(tid)){
            return APIResult.createOk(map);
        }
        return APIResult.createNg("操作失败");
    }
}
