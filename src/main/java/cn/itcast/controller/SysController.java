package cn.itcast.controller;


import cn.itcast.service.AccountService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
