package com.zzh.springboot_mybatis.dao;

import com.zzh.springboot_mybatis.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-12-11:31
 */
@Mapper
@Repository
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> findAll();
}
