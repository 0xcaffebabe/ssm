package wang.ismy.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.ismy.ssm.dao.AccountDao;
import wang.ismy.ssm.entity.Account;
import wang.ismy.ssm.service.AccountService;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/23 11:34
 */
@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao dao;

    public AccountServiceImpl(AccountDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Account> findAll() {
        System.out.println("find all run");
        return dao.findAll();
    }

    @Override
    public void save(Account account) {
        dao.save(account);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(Integer user1, Integer user2) {
        dao.decrease(user1);
        dao.increase(user2);
    }
}
