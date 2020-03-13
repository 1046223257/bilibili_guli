package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    /**
     * 查询所有
     * @return
     */
    List<UmsMember> selectAllUser();


}
