package org.example.service;

import org.example.dao.pojo.SysUser;
import org.example.vo.Result;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserBytoken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);
}
