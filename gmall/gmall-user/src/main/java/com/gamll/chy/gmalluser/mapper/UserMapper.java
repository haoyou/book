package com.gamll.chy.gmalluser.mapper;

import com.gamll.chy.gmalluser.entity.UmsMember;
import com.gamll.chy.gmalluser.mappers.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper extends TkMapper<UmsMember> {
}
