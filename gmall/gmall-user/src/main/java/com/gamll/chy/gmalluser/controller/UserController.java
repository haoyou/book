package com.gamll.chy.gmalluser.controller;


import com.chy.gmall.bean.UmsMember;
import com.chy.gmall.bean.UmsMemberReceiveAddress;
import com.chy.gmall.service.UserService;
import com.gamll.chy.gmalluser.entity.UmsMemberAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/getalluserinfo")
    @ResponseBody
    public List<UmsMember> getAllUserInfo(){
        List<UmsMember> umsMembers = userService.getAllUserInfo();
        return umsMembers;
    }

    @RequestMapping("/getaddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByUserId(String id){
        List<UmsMemberReceiveAddress> umsMemberAddress = userService.getUmsMemberAddress(id);
        return umsMemberAddress;
    }
}
