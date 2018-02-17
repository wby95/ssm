package com.wby.dao;

import com.wby.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 用户的dao层
 *
 * @author Administrator
 */
@Repository("userDao")
public interface UserDao {
    /**
     * 用户登录验证
     *
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 查询用户
     *
     * @param map
     * @return
     */
    public List <User> findUser(Map <String, Object> map);

    /**
     * 获取总的记录条数
     *
     * @param map
     * @return
     */
    public Long getTotal(Map <String, Object> map);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public int add(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    public int delete(Integer id);
}
