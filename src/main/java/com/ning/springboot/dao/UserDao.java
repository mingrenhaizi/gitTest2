package com.ning.springboot.dao;

import com.ning.springboot.DbPojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {

    User findByAccount_AndPassword(String account,String password);

//    @Query(value="select * from user where name=(:name)",nativeQuery = true)
//    User getUserByName(@Param("name") String name);

}
