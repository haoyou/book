package com.gamll.chy.gmalluser.service.impl;

import com.gamll.chy.gmalluser.entity.UmsMember;
import com.gamll.chy.gmalluser.entity.UmsMemberAddress;
import com.gamll.chy.gmalluser.mapper.UmsMemberAddressMapper;
import com.gamll.chy.gmalluser.mapper.UserMapper;
import com.gamll.chy.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberAddressMapper umsMemberAddressMapper;


    @Override
    public List<UmsMember> getAllUserInfo() {
//        List<UmsMember> umsMembers = userMapper.selectAllUserInfo();
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberAddress> getUmsMemberAddress(String id) {
//        UmsMemberAddress umsMemberAddress = new UmsMemberAddress();
//        umsMemberAddress.setMember_id(id);
//
//        List<UmsMemberAddress> umsMemberAddressList = umsMemberAddressMapper.select(umsMemberAddress);
        Example example = new Example(UmsMemberAddress.class);
        example.createCriteria().andEqualTo("member_id", id);
        List<UmsMemberAddress> umsMemberAddressList = umsMemberAddressMapper.selectByExample(example);
        return umsMemberAddressList;
    }
}
