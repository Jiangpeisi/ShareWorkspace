package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.IUserDao;
import com.jiangpeisi.domain.User;
import com.jiangpeisi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Override
    public String insert(User user) {
        if(userDao.findByUsername(user.getUsername())!=null)
            return "注册失败，"+user.getUsername()+"已经存在";
        else {
            userDao.insert(user);
            return "注册成功";
        }
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @Override
    public String delete(User user) {
        if(userDao.findByUsername(user.getUsername())!=null) {
            userDao.delete(user);
            return "删除成功";
        }
        else {
            return "删除失败，"+user.getUsername()+"不存在";
        }
    }

    /**
     * 更改用户密码
     * @param user
     * @return
     */
    @Override
    public String updatePassword(User user) {
        if (userDao.findByUsernameAndKey(user) != null) {
            userDao.updatePassword(user);
            return "更改成功";
        } else {
            return "更改失败，用户不存在或密钥错误";
        }
    }

    /**
     * 更新用户信息
     * @param user
     */
    @Override
    public String update(User user) {
        User temp=userDao.findByUsername(user.getUsername());
        if(temp!=null) {
            temp.setSex(user.getSex());
            temp.setAddress(user.getAddress());
            temp.setEmail(user.getEmail());
            temp.setTel(user.getTel());
            temp.setSignature(user.getSignature());
            temp.setNickname(user.getNickname());
            temp.setAge(user.getAge());
            temp.setAvatar(user.getAvatar());
            userDao.update(temp);
            return "信息更新成功";
        }
        else
        {
            return "信息更新失败";
        }
    }

    /**
     * 用户登陆
     * @param user
     * @return
     */
    @Override
    public String login(User user) {
        if(userDao.findUser(user)!=null)
            return "登陆成功";
        else
            return "账户不存在或密码错误";
    }

    /**
     * 根据username查询用户信息
     * @param user
     * @return
     */
    @Override
    public User findByUsername(User user) {
        return userDao.findByUsername(user.getUsername());
    }
}
