package com.zhang.atcrowdfunding.service.impl;
import com.zhang.atcrowdfunding.entity.Admin;
import com.zhang.atcrowdfunding.mapper.AdminMapper;
import com.zhang.atcrowdfunding.service.api.AdmineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmineServiceImpl implements AdmineService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);


    }
}

