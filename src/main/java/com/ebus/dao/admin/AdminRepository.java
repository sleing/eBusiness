package com.ebus.dao.admin;

import java.util.List;

import com.ebus.entity.AUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminRepository {
    List<AUser> login(AUser aUser);
}

