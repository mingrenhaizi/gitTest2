package com.ning.springboot.dao;

import com.ning.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, String> {

    User findByAccount_AndPassword(String account,String password);

//    @Query(value="select * from user where name=(:name)",nativeQuery = true)
//    User getUserByName(@Param("name") String name);

}
