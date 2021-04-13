package cn.liangyy.cache.redis.controller;

import cn.liangyy.cache.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-04-13-9:52
 */
@RestController
public class RedisUserController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @ResponseBody
    @GetMapping("/addUserToRedis")
    public Boolean addUserToRedis(String name,String password){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        redisTemplate.opsForValue().set(name,user);
        return true;
    }

    @ResponseBody
    @GetMapping("/getUserToRedis")
    public User getUserToRedis(String name){
        return (User) redisTemplate.opsForValue().get(name);
    }

    @ResponseBody
    @GetMapping("/deleteUserFromRedis")
    public Boolean deleteUserFromRedis(String name){
        return redisTemplate.delete(name);
    }
}
