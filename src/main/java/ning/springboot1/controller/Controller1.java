package ning.springboot1.controller;

import ning.springboot1.dao.UserDao;
import ning.springboot1.pojo.User;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class Controller1 {


    //读取配置文件内容
    @Value("${student:名字}")
    String name;

    @Value("${student.age}")
    String age;

    @Value("${age1}")
    String age1;

    @Value("${:值}")
    String val;

    @Value("值1")
    String val1;
    //内容可以有html标签！
    @Value("${link}")
    String link;

    @RequestMapping("/hello")//括号不写参数则成为首页！（覆盖掉static中的index.html）
    public String hello(Model model) {
        model.addAttribute("msg", "你好" + " " + name + " " + age + " " + age1 + " " + val + " " + val1 + " " + link);
        return "home";
    }

    //用autowired会有红线，但不影响功能!  这两个注释作用一样
    @Resource
    UserDao dao;

    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("users", dao.findAll());
        return "selectResult";
    }

    @RequestMapping("/login")
    public String login(Model model, String name, String password, HttpSession session) {
        if (dao.login(name, password)) ;
        else {
            model.addAttribute("msg", "登录失败");
            return "home";
        }
        session.setAttribute("user", new User(null, name, password));
        model.addAttribute("msg", "登录成功"+session.getAttribute("user").toString());

        return "home";
    }

    @RequestMapping("/register")
    public String register(Model model, String name, String password) {
        if (dao.check(name)) {//重复
            model.addAttribute("msg", "注册失败，此账户已被注册！");
            return "home";
        }
        //用户名可用！添加用户！
        dao.register(name, password);
        model.addAttribute("msg", "注册成功");
        return "home";
    }

}
