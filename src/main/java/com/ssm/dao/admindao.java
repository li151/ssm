package com.ssm.dao;

import com.ssm.pojo.admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface admindao {
    /**
     * 查询用户所有信息
     * @return
     */
    @Select("select * from admin")
    public List<admin> findAll();

    /**
     * 插入用户
     * @param admins
     */
    @Insert("insert into admin(id,users,pwd,username) values(#{id},#{users},#{pwd},#{username})")
    public void insertAll(admin admins);
}
