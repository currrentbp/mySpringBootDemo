package com.currentbp.controller;

import com.currentbp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author baopan
 * @createTime 2020/8/6 18:17
 */
@Controller
public class StudentController {
//    @Resource
//    public StudentService studentService1;
//    @Resource
//    public StudentService studentService2;
//    @Resource(name="studentService1")
//    public StudentService studentService4;
//    @Resource(name="studentService2")
//    public StudentService studentService3;

    @Autowired
    public StudentService studentService2;


    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    @ResponseBody
    public int getName() {
        System.out.println(studentService2);
//        System.out.println(studentService2);
//        System.out.println(studentService3);
//        System.out.println(studentService4);
        return 1;
    }
}
