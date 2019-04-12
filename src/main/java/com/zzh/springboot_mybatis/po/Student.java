package com.zzh.springboot_mybatis.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZengZhiHang
 * @create 2019-04-12-11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int stuid;
    private String stuname;
    private Grade grade;
}
