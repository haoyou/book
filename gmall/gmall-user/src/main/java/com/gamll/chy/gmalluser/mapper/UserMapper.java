package com.gamll.chy.gmalluser.mapper;

import com.gamll.chy.gmalluser.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUserInfo();
}
