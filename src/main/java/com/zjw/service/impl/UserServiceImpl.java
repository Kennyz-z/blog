package com.zjw.service.impl;

import com.zjw.entity.User;
import com.zjw.mapper.UserMapper;
import com.zjw.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author KennyZ
 * @since 2022-04-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
