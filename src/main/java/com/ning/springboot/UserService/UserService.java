package com.ning.springboot.UserService;


import com.ning.springboot.dao.UserDao;
import com.ning.springboot.DbPojo.User;
import com.ning.springboot.utils.BeanResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class UserService {

    @Resource
    UserDao dao;

    public BeanResult login(HttpSession session, User page) {
        User entity = dao.findByAccount_AndPassword(page.getAccount(), page.getPassword());
        if (entity != null) {
            //密码保护
            entity.setPassword("******");
            session.setAttribute("user",entity);//保存到session中
            return BeanResult.success(entity);
        }
        return BeanResult.fail("账户/密码错误，没有账号请注册");
    }
}
