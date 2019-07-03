package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.tool.APIResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class JSONController {


    @RequestMapping("/testJavaBean")
    @ResponseBody
    public APIResult test(@RequestParam("name") String name){
        User user = new User();
        user.setUserName(name);
        user.setPassword("123456");
        return APIResult.createOk(user);
    }

    @RequestMapping("/testMap")
    @ResponseBody
    public APIResult test2(@RequestParam("name") String name){
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("test",123);
        map.put("array",new String[]{"a","b","c"});
        return APIResult.createOk(map);
    }

    @RequestMapping("/testNg")
    @ResponseBody
    public APIResult testNg() {
        return APIResult.createNg("用户名或密码错误");
    }

}
