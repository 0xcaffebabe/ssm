package wang.ismy.ssm.controller;

import org.springframework.web.bind.annotation.*;
import wang.ismy.ssm.entity.Account;
import wang.ismy.ssm.service.AccountService;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author MY
 * @date 2019/8/23 11:25
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/findAll")
    public List<Account> findAll(){

        return accountService.findAll();
    }

    @GetMapping("/save")
    public String save(@RequestParam("name") String name, @RequestParam("money") BigDecimal money){
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        accountService.save(account);
        return "成功";
    }

    @GetMapping("transfer")
    public String transfer(@RequestParam("user1") Integer user1,@RequestParam("user2") Integer user2){
        accountService.transfer(user1, user2);
        return "success";
    }
}
