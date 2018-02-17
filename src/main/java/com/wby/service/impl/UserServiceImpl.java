package com.wby.service.impl;

import javax.annotation.Resource;

import com.wby.dao.UserDao;
import com.wby.entity.User;
import com.wby.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	/**
	 *
	 * @param user
	 * @return
	 */
	public User login(User user) {
		return userDao.login(user);
	}

	/**查询用户
	 *
	 * @param map
	 * @return
	 */
	public List<User> findUser(Map<String, Object> map) {
		return userDao.findUser(map);
	}

	/**获取总的记录条数
	 *
	 * @param map
	 * @return
	 */
	public Long getTotal(Map <String, Object> map) {
		return userDao.getTotal(map);
	}


	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int update(User user) {
		return userDao.update(user);
	}

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user) {
		return userDao.add(user);
	}

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int delete(Integer id) {
		return userDao.delete(id);
	}
}
