package wang.ismy.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import wang.ismy.ssm.entity.Account;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/23 11:35
 */
public interface AccountDao {

    @Select("SELECT * FROM account")
    List<Account> findAll();

    @Insert("INSERT INTO account VALUES(null,#{name},#{money})")
    void save(Account account);

    @Update("UPDATE account SET money=money-100 WHERE id = #{id}")
    void decrease(Integer id);

    @Update("UPDATE account SET money=money+100 WHERE id = #{id}")
    void increase(Integer id);
}
