package com.currentbp.service.impl;

import com.currentbp.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author baopan
 * @createTime 2020/8/6 18:07
 */
@Service("studentService2")
public class StudentServiceImpl2 implements StudentService {
    @Override
    public String getStudentName(int id) {
        return "name2:" + id;
    }
}
