package com.zzh.springboot_mybatis.service.impl;

import com.zzh.springboot_mybatis.dao.StudentMapper;
import com.zzh.springboot_mybatis.po.Student;
import com.zzh.springboot_mybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-12-11:37
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper sm;

    @Override
    public List<Student> findAll() {
        return sm.findAll();
    }
}
