package com.liujifei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.liujifei.entity.Channel;

@Mapper
public interface ChannelMapper {

	@Select("select * from cms_channel order by id")
	@ResultType(Channel.class)
	List<Channel> getChannels();
	
}
