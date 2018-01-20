package com.hup.basic.user.client;


import com.hup.basic.user.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author to dapeng
 */
@FeignClient("basic-server")
@RequestMapping(value = "/user")
public interface UserService {

    @GetMapping(value = "/{id}")
    public User findOne(@PathVariable("id") Long id);
}
