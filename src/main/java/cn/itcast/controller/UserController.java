package cn.itcast.controller;

import cn.itcast.pojo.UserOrders;
import cn.itcast.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-13 18:01
 * @version:
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;

    @RequestMapping("/getlist")
    public String getList(Model model){
        try {
            List<UserOrders> list = service.getList();
            model.addAttribute("list",list);
            return "sucess";
        } catch (Exception e) {
            e.printStackTrace();
            return "faild";
        }

    }


}
