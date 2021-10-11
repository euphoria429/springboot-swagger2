package com.hcx.demo2.dao;

import com.hcx.demo2.bean.User;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-11 17:14
 * @since 1.0.0
 */
@Repository
public interface UserMapper {

    int deleteById(Long id);

    int createUser(User user);

    User selectById(Long id);

    int modifyUser(User user);

}
