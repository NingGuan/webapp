package com.guanning.web.controller;

import com.guanning.web.mapper.PidMapper;
import com.guanning.web.vo.Pid;
import com.guanning.web.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    public PidMapper pidMapper;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        List<User> users = new ArrayList<User>();
        User user = new User("guannning",26);
        User user1 = new User("ningguan",27);
        users.add(user);
        users.add(user1);
        model.addAttribute("users",users);
        model.addAttribute("name","guanning");
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "login";
    }

    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String result(@ModelAttribute(value = "user") User user,Model model){
        System.out.println(user.name);
        logger.debug("debug");
        model.addAttribute("user",user);
        return "result";
    }

    @ResponseBody
    @RequestMapping(value = "/getpid",method = RequestMethod.GET)
    public String getpid(@RequestParam(value = "name",required = true) String name){
        Pid pid = new Pid();
        pid.setId("hello");
        pid.setName("hello");

        pid = pidMapper.selectByPrimaryKey("hello");
        logger.debug("debug");
        logger.debug(pid.getName());
        //pidMapper.insert(pid);
        return "success";
    }

}
