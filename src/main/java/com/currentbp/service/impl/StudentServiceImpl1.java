package com.currentbp.service.impl;

import com.currentbp.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author baopan
 * @createTime 2020/8/6 18:07
 */
@Service("studentService1")
public class StudentServiceImpl1 implements StudentService {
    @Override
    public String getStudentName(int id) {
        return "name"+id;
    }
}
