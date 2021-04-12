package cn.liangyy.cache.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-04-12-9:08
 */
@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
