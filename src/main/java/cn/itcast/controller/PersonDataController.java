package cn.itcast.controller;


import cn.itcast.domain.PersonData;
import cn.itcast.service.PersonDataService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonDataController {
    @Autowired
    private PersonDataService PersonDataService;

    @RequestMapping("/find")
    @ResponseBody
    public APIResult findAll(Integer sid) {
        List<PersonData> list = PersonDataService.findAll(sid);
        PersonData personDataOne = list.get(0);
        Map<String,Object> map = new HashMap<>();
        map.put("name",personDataOne.getName());
        map.put("nativePlace",personDataOne.getID_No());
        map.put("Email",personDataOne.getEmail());
        map.put("phoneNum",personDataOne.getPhoneNum());
        map.put("QQNum",personDataOne.getQQNum());
        map.put("Class",personDataOne.getClassNum());
        map.put("sid",personDataOne.getSid());
        return APIResult.createOk(map);
    }

    @RequestMapping("/updata")
    @ResponseBody
    public APIResult updata(PersonData personData){
        int i = PersonDataService.updata(personData);
        System.out.println(i);
        return APIResult.createOKMessage("iok");
    }
}
