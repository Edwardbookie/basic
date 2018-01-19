package com.hup.basic.user.server.service.impl;

import com.hup.basic.user.model.User;
import com.hup.basic.user.server.repository.UserRepository;
import com.hup.basic.user.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author to dapeng
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }
}
