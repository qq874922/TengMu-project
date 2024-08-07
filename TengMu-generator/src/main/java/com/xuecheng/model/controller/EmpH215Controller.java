package com.xuecheng.model.controller;


import com.xuecheng.model.mapper.EmpH215Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mss
 * @since 2024-05-26
 */
@RestController
@RequestMapping("/emp-h215")
public class EmpH215Controller {
    @Autowired
    EmpH215Mapper empH215Mapper;

    private void s(){
        empH215Mapper.selectById(1);
    }
}
