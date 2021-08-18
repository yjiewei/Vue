/*
 * @author yjiewei
 * @date 2021/8/9 20:55
 */
package com.yjiewei.controller;

import com.yjiewei.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // 解决跨域问题
public class VueController {

    @RequestMapping("/test1") // get方式请求
    public String test1(@RequestParam Integer id, @RequestParam("name") String username){
        System.out.println(id);
        System.out.println(username);
        return "demo good";
    }

    @PostMapping("/test2")
    public String test2(@RequestBody User user){
        System.out.println(user.toString());
        return "demo2 very good";
    }
}
