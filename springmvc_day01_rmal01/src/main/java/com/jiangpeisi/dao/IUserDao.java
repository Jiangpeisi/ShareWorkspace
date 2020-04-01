package com.jiangpeisi.dao;

import com.jiangpeisi.domain.User;
import org.springframework.stereotype.Repository;

/**
 * 持久层用户接口
 */
@Repository
public interface IUserDao {
    /**
     * 查询用户，根据用户名和密钥，用于更改密码
     * @param user
     * @return
     */
    public User findByUsernameAndKey(User user);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 查询用户，根据用户名和密码，用于登陆
     * @param user
     * @return
     */
    public User findUser(User user);

    /**
     * 插入用户，用于注册
     * @param user
     */
    public void insert(User user);

    /**
     * 删除用户，用于注销
     * @param user
     */
    public void delete(User user);

    /**
     * 更新用户
     * @param user
     */
    public void update(User user);

    /**
     * 修改用户密码
     * @param user
     */
    public void updatePassword(User user);
}
