package com.ssm.service;

import com.ssm.pojo.admin;

import java.util.List;

public interface adminService {
    /**
     * 查询用户所有信息
     * @return
     */
    public List<admin> findAll();

    /**
     * 插入用户
     * @param admins
     */
    public void insertAll(admin admins);
}
