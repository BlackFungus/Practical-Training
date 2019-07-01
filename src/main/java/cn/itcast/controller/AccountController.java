package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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


    /**
     * 保存
     * @param
     * @return
     */
    @RequestMapping("/save")
    public String save(Account account){
        System.out.println("表现层：保存信息");
        accountService.saveAccount(account);
        return "list";
    }
}
