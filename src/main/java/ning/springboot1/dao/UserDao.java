package ning.springboot1.dao;

import ning.springboot1.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("select count(*) from user where name='#{name}' and password='#{password}'")
    boolean login(@Param("name") String name, @Param("password") String password);

    @Insert("INSERT INTO user(name,password) VALUES ('#{name}','#{password}');")
    boolean register(@Param("name") String name, @Param("password") String password);

    @Select("select count(*) from user where name='#{name}'")
    boolean check(@Param("name") String name);

    //动态sql测试
    @Update("<script>UPDATE user <trim prefix=\"set\" suffixOverrides=\",\">\n" +
            "  <if test=\"name!=null\">name=#{name},</if>\n" +
            "  <if test=\"password!=null\">password=#{password},</if>\n" +
            " </trim>" +
            "where id = #{id} </script>")//可用！
    boolean dy(@Param("name") String name,@Param("password") String password,@Param("id") String id);
    //测试用xml方式
    boolean dy1(@Param("name") String name,@Param("password") String password,@Param("id") String id);



}
