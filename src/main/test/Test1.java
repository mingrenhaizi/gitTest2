import ning.springboot1.Springboot1Application;
import ning.springboot1.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot1Application.class)//主程序入口的application类！！！
public class Test1 {//名字不能与Test一样！

    @Resource
    UserDao dao;

    @Test
    public void contextLoads() {//动态sql git上传测试
        dao.dy1("ning22", "111", "8");
        dao.dy1(null, "222", "7");
    }

}