package com.zjw.controller;


import com.zjw.common.Result;
import com.zjw.entity.User;
import com.zjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author KennyZ
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Result Test() {
        User user = userService.getById(1L);
        return Result.success(user);
    }

    @PostMapping("/test2")
    public Result Test2(@Validated @RequestBody User user){
        return Result.success(user);
    }
}
