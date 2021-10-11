package com.hcx.demo2.service;

import com.hcx.demo2.bean.User;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-11 17:14
 * @since 1.0.0
 */

public interface UserService {
    int deleteById(Long id);

    int createUser(User user);

    User selectById(Long id);

    int modifyUser(User user);

}
