package com.test.web.Dao;

import com.test.web.UserInfo.UserInfo;



public interface IDao {
        //登录验证账号密码功能
    UserInfo findByuser(UserInfo userinfo) ;
        //更新商品功能 返回受影响行数
     int addUser(UserInfo userInfo);
        //查询商品所有信息功能

        //根据id查找商品信息



}
