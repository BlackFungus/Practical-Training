package cn.itcast.controller;


import cn.itcast.domain.PersonData;
import cn.itcast.service.PersonDataService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonDataController {
    @Autowired
    private PersonDataService PersonDataService;

    @RequestMapping("/find")
    @ResponseBody
    public APIResult findAll(Integer sid) {
        List<PersonData> list = PersonDataService.findAll(sid);
        System.out.println(list);
        return APIResult.createOKMessage("ok");
    }

    @RequestMapping("/updata")
    @ResponseBody
    public APIResult updata(PersonData personData){
        int i = PersonDataService.updata(personData);
        System.out.println(i);
        return APIResult.createOKMessage("iok");
    }
}
