package com.gamll.chy.gmalluser.service.impl;

import com.gamll.chy.gmalluser.entity.UmsMember;
import com.gamll.chy.gmalluser.mapper.UserMapper;
import com.gamll.chy.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUserInfo() {
        List<UmsMember> umsMembers = userMapper.selectAllUserInfo();
        return umsMembers;
    }
}
