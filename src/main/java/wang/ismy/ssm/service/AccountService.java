package wang.ismy.ssm.service;

import wang.ismy.ssm.entity.Account;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/23 11:34
 */
public interface AccountService {


    List<Account> findAll();

    void save(Account account);

    void transfer(Integer user1,Integer user2);
}
