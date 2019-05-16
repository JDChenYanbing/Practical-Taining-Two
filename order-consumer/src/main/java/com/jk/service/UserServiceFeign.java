package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:02
 * @description：
 * @modified By：
 * @version: $
 */
@FeignClient(value = "order-provider", fallback = UserServiceError.class)
public interface UserServiceFeign extends UserService{
}
