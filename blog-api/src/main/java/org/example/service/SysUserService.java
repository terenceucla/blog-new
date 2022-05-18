package org.example.service;

import org.example.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);
}
