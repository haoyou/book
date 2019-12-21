package com.chy.gmall.service;

import com.chy.gmall.bean.UmsMember;
import com.chy.gmall.bean.UmsMemberReceiveAddress;


import java.util.List;

public interface UserService {
    public List<UmsMember> getAllUserInfo();

    List<UmsMemberReceiveAddress> getUmsMemberAddress(String id);
}
