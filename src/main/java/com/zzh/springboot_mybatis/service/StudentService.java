package com.zzh.springboot_mybatis.service;

import com.zzh.springboot_mybatis.po.Student;

import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-12-11:37
 */
public interface StudentService {
    public List<Student> findAll();
}
