package com.gamll.chy.gmalluser.service.impl;

import com.chy.gmall.bean.UmsMember;
import com.chy.gmall.bean.UmsMemberReceiveAddress;
import com.chy.gmall.service.UserService;
import com.gamll.chy.gmalluser.mapper.UmsMemberAddressMapper;
import com.gamll.chy.gmalluser.mapper.UserMapper;
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
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberAddress(String id) {
//        UmsMemberAddress umsMemberAddress = new UmsMemberAddress();
//        umsMemberAddress.setMember_id(id);
//
//        List<UmsMemberAddress> umsMemberAddressList = umsMemberAddressMapper.select(umsMemberAddress);
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", id);
        List<UmsMemberReceiveAddress> umsMemberAddressList = umsMemberAddressMapper.selectByExample(example);
        return umsMemberAddressList;
    }
}
