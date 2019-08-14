package cn.chai.user.controller;

import cn.chai.user.pojo.User;
import cn.chai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User findUser(@PathVariable("id")Long id){
        return this.userService.queryUserById(id);
    }

    @GetMapping("all")
    public String toUsers(Model model){
        List<User> users = this.userService.queryUserAll();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "hello user!";
    }
}
