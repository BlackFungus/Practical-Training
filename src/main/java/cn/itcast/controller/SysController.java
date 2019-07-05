package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import cn.itcast.service.DeleteService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accountChangeState")
    @ResponseBody
    public APIResult AccountStateChange(Integer sid) {

        int i = accountService.upDateState(sid);
        if (1 == i) {
            return APIResult.createOKMessage("ok");
        } else {
            return APIResult.createNg("error");
        }

    }

    @Autowired
    private DeleteService deleteService;
    @RequestMapping("/deleteStudent")
    @ResponseBody
    public APIResult AccountChange(Integer sid){
        deleteService.DeleteStudent(sid);
        List<Account> list = accountService.findExist2(sid);
        if(null !=list&&list.size()>0){
            return APIResult.createOKMessage("操作失败");
        }
        else {
            return APIResult.createOKMessage("操作成功");
        }
    }


}
