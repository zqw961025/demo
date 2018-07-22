package com.example.demo.controller;


import com.example.demo.Service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/hello1")
    public String hello1(){
        return "Hello";
    }
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/email")
    public String sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2384236461@qq.com");
        message.setTo("2384236461@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件,勿回复");
        mailSender.send(message);
        return "login";
    }
    @RequestMapping("email1")
    public String sendSimpleMail1() throws Exception{
        return "login";
    }
}
