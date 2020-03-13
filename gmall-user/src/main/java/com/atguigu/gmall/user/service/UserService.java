package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {
    /**
     * 查询所有的UmsMember信息
     * @return  list
     */
    List<UmsMember> getAllUser();


}
