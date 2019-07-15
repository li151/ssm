package com.ssm.controller;

import com.ssm.pojo.admin;
import com.ssm.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class adminController {

    @Autowired
    private adminService adminServices;

    @RequestMapping("/findall")
    public String findall(){
        List<admin> admins = adminServices.findAll();
        for(admin adm:admins){
            System.out.println(adm);
        }
        return "test";
    }
}
