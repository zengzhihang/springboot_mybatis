package com.zzh.springboot_mybatis.handler;

import com.zzh.springboot_mybatis.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author ZengZhiHang
 * @create 2019-04-12-11:38
 */
@Controller
public class Handler {
    @Resource
    private StudentService ss;

    @RequestMapping("findAll")
    public ModelAndView findAll(ModelAndView mv){
        mv.addObject("list",ss.findAll());
        mv.setViewName("findAll");
        return mv;
    }
}
