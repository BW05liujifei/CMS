package com.liujifei.service;

import com.github.pagehelper.PageInfo;
import com.liujifei.entity.User;
import com.liujifei.entity.UserVo;

/**
 * 
 * @author 刘吉飞
 *
 */
public interface UserService {
	
	/**
	 * 
	 * @return
	 */
	User login(User user);
	/**
	 * 
	 * @return
	 */
	User register(User user);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	User findByName(String name);
	
	/**
	 * 
	 * @param uservo
	 * @return
	 */
	User query(UserVo  uservo);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	int update(User user);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	User findById(Integer id);
	
	/**
	 * 根据用户名模糊查询
	 * @param pageNumber
	 * @param pageSize
	 * @param name
	 * @return
	 */
	PageInfo<User> search(int pageNumber, int pageSize, String name);
	
	
	
}
