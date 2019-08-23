package wang.ismy.ssm.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author MY
 * @date 2019/8/23 11:21
 */
@Data
public class Account {

    private Integer id;

    private String name;

    private BigDecimal money;
}
