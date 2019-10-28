package com.lanxin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanxin.bean.Emp;
import com.lanxin.bean.EmpExample;
import com.lanxin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2019/8/7.
 */
@Controller
@RequestMapping(value="/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/selectdname")
    public ModelAndView selectdname(){
        ModelAndView mv=new ModelAndView();
        EmpExample empExample=new EmpExample();
        EmpExample.Criteria cri=empExample.createCriteria();
        //cri.andDidEqualTo(2);
        PageHelper.startPage(1,2);
        List<Emp> emps=empService.selectByExample(empExample);
        PageInfo<Emp> pageinfo=new PageInfo<Emp>(emps);
        pageinfo.getList();
        for(Emp emp:pageinfo.getList()){
            System.out.println(emp.getEname());
        }

        mv.addObject("pageinfo",pageinfo);
        mv.setViewName("/view/listemp");
        return mv;
    }
    @RequestMapping(value="/selectemp")
    @ResponseBody
    public PageInfo<Emp> selectemp(){
        EmpExample empExample=new EmpExample();
        EmpExample.Criteria cri=empExample.createCriteria();
        //cri.andDidEqualTo(2);
        PageHelper.startPage(1,2);
        List<Emp> emps=empService.selectByExample(empExample);
        PageInfo<Emp> pageinfo=new PageInfo<Emp>(emps);
        pageinfo.getList();
        pageinfo.getFirstPage();

        for(Emp emp:pageinfo.getList()){
            System.out.println(emp.getEname());
        }
        return pageinfo;
    }
}
