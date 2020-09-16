package com.currentbp;

import com.currentbp.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;

/**
 * 项目启动点
 *
 * @author baopan
 * @createTime 2020/6/16 11:51
 */

@MapperScan("com.currentbp.mapper")
@SpringBootApplication
public class ApplicationStarter {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
        System.out.println("sssssssssssssssss");
    }
}
