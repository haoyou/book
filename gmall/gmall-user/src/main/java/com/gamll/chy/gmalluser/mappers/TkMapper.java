package com.gamll.chy.gmalluser.mappers;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 配置通用Mapper
 * */

public interface TkMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
