package cn.tedu.boot.sample.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.tedu.boot.sample.entity.User;

@Mapper
public interface UserMapper {
	
	Integer addnew(User user);
	
	User findByUsername(String username);

}
