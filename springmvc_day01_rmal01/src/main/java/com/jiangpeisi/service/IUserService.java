package com.jiangpeisi.service;

import com.jiangpeisi.domain.User;

public interface IUserService {
    public String insert(User user);
    public String delete(User user);
    public String update(User user);
    public String login(User user);
    public String updatePassword(User user);
    public User findByUsername(User user);
}
