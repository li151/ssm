package com.ssm.service.Impl;

import com.ssm.dao.admindao;
import com.ssm.pojo.admin;
import com.ssm.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("admins")
public class adminServiceImpl implements adminService {

    @Autowired
    private admindao admindaos;
    public List<admin> findAll() {
        List<admin> admins = admindaos.findAll();
        return admins;
    }

    public void insertAll(admin admins){
        admindaos.insertAll(admins);
    }
}
