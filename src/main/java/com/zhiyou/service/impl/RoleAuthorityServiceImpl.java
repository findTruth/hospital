package com.zhiyou.service.impl;

import com.zhiyou.mapper.RoleAuthorityMapper;
import com.zhiyou.service.RoleAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HYC
 * @date 2018/4/25 9:59
 * @About 角色权限表
 */
@Service
public class RoleAuthorityServiceImpl implements RoleAuthorityService {
    @Autowired
    private RoleAuthorityMapper roleAuthorityMapper;

    @Override
    public int saveRoleAuthorityById(String[] str, Integer id) {
       // return saveRoleAuthorityById();
        return 0;
    }
}
