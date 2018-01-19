package com.hup.basic.user.server.service;

import com.hup.basic.user.model.User;

/**
 * @author to dapeng
 */
public interface UserService {
    /**
     * 查找一个用户
     * @param id
     * @return
     */
    User findOne(Long id);
}
