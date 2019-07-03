package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import cn.itcast.tool.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户");

        List<Account> list = accountService.findAll();
        for(Account account:list){
            System.out.println(account);
        }
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/login")
    @ResponseBody
    public APIResult login(@RequestParam("username") String username,@RequestParam("password") String password){

        List<Account> list = accountService.findExist(username);
        if (null !=list&&list.size()>0){
            Account accountOne = list.get(0);
            if(!password.equals(accountOne.getPassword())){
                return APIResult.createNg("密码错误");
            }
            if(0==accountOne.getState()){
                return APIResult.createNg("用户被冻结");
            }
            Map<String,Object> map = new HashMap<>();
            map.put("username",accountOne.getUsername());
            map.put("password",accountOne.getPassword());
            map.put("sid",accountOne.getSid());
            return APIResult.createOk(map);
        }else{
            return APIResult.createNg("该用户不存在");
        }
    }




//    /**
//     * 保存
//     * @param
//     * @return
//     */
//    @RequestMapping("/save")
//    public String save(Account account){
//        System.out.println("表现层：保存信息");
//        accountService.saveAccount(account);
//        return "list";
//    }
}
