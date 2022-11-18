package com.ebus.dao.before;

import java.util.List;

import com.ebus.entity.BUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	public List<BUser> isUse(BUser bUser);
	public int register(BUser bUser);
	public List<BUser> login(BUser bUser);
}
