package com.yjiewei.controller;

import com.yjiewei.entity.Emp;
import com.yjiewei.service.EmpService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2021-08-16 21:03:13
 */
@RestController
@CrossOrigin // 解决跨域问题
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/show/{id}")
    public Emp selectOne(@PathVariable("id") Integer id) {
        return this.empService.queryById(id);
    }

    /**
     * 获取所有员工数据
     * @return
     */
    @GetMapping("/emps")
    public List<Emp> emps(){
        List<Emp> emps = empService.queryAllByLimit(0, Integer.MAX_VALUE);
        System.out.println("员工数据条数是：" + emps.size());
        return emps;
    }

    @CrossOrigin
    @Delete("/deleteById/{id}")  // 提示跨域问题，有毒
    public void deleteById(@PathVariable("id") Integer id) {
        empService.deleteById(id);
    }

}
