package com.wby.service;

import com.wby.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 验证用户登录的service
 *
 * @author Administrator
 *
 */
public interface UserService {
	/**
	 *
	 * @param user
	 * @return
	 */
	public User login(User user);


	/**
	 * 查询用户
	 * @param map
	 * @return
	 */
	public List<User> findUser(Map<String,Object> map);

	/**
	 * 获取总的记录条数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object>map);
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int update(User user);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
