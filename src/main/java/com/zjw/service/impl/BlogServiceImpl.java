package com.zjw.service.impl;

import com.zjw.entity.Blog;
import com.zjw.mapper.BlogMapper;
import com.zjw.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
